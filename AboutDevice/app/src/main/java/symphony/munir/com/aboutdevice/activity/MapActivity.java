package symphony.munir.com.aboutdevice.activity;

import android.app.Activity;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;


import symphony.munir.com.aboutdevice.MainActivity;
import symphony.munir.com.aboutdevice.R;

public class MapActivity extends ActionBarActivity implements OnMapReadyCallback, LocationListener{
    public MapFragment mapFragment;
    private boolean needsInit=false;
    private String lat, lang, address;
    TextView addressBar;
    private GoogleMap mMap;
    Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

       // String intentName = getCallingPackageName(this);
       // Toast.makeText(this,intentName,Toast.LENGTH_LONG).show();


        String activityName = intent.getStringExtra("Activity");
        if(activityName.equals("MainActivity"))
        {
            lat = intent.getStringExtra(ContactsFragment.EXTRA_LAT);
            lang = intent.getStringExtra(ContactsFragment.EXTRA_LANG);
            address = intent.getStringExtra(ContactsFragment.EXTRA_ADDRESS);
        }
        else
        {
            lat = intent.getStringExtra("lat");
            lang = intent.getStringExtra("lang");
            address = intent.getStringExtra("address");
        }
        setContentView(R.layout.activity_map);
        addressBar = (TextView)findViewById(R.id.id_footerAddress);
        mapFragment =  (MapFragment) getFragmentManager()
                .findFragmentById(R.id.fragmap);

        if (savedInstanceState == null) {
            needsInit=true;
        }
        addressBar.setText(address);

        mapFragment.getMapAsync(this);
        //mMap.setMyLocationEnabled(true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng position = new LatLng(Double.parseDouble(lat), Double.parseDouble(lang));

        mMap = googleMap;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 15));

        googleMap.addMarker(new MarkerOptions()
                .title("Symphony Customer Care")
                .snippet(address)
                .position(position))
                .showInfoWindow();
        googleMap.setMyLocationEnabled(true);

        // Getting LocationManager object from System Service LOCATION_SERVICE
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        // Creating a criteria object to retrieve provider
        Criteria criteria = new Criteria();

        // Getting the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);

        // Getting Current Location
        location = locationManager.getLastKnownLocation(provider);

        if(location!=null){
            onLocationChanged(location);
        }
        locationManager.requestLocationUpdates(provider, 20000, 0, this);
    }

    @Override
    public void onLocationChanged(Location location) {
        // Getting latitude of the current location
        double latitude = location.getLatitude();

        // Getting longitude of the current location
        double longitude = location.getLongitude();

        // Creating a LatLng object for the current location
        LatLng latLng = new LatLng(latitude, longitude);

        // Showing the current location in Google Map
       mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        // Zoom in the Google Map
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
   public static String getCallingPackageName(Activity activity) {
       return activity.getCallingPackage();
   }
}
