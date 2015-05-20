package symphony.munir.com.aboutdevice.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;


import symphony.munir.com.aboutdevice.MainActivity;
import symphony.munir.com.aboutdevice.R;

public class MapActivity extends ActionBarActivity implements OnMapReadyCallback{
    public MapFragment mapFragment;
    private boolean needsInit=false;
    private String lat, lang, address;
    TextView addressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        lat = intent.getStringExtra(ContactsFragment.EXTRA_LAT);
        lang = intent.getStringExtra(ContactsFragment.EXTRA_LANG);
        address = intent.getStringExtra(ContactsFragment.EXTRA_ADDRESS);
        setContentView(R.layout.activity_map);
        addressBar = (TextView)findViewById(R.id.id_footerAddress);
        mapFragment =  (MapFragment) getFragmentManager()
                .findFragmentById(R.id.fragmap);

        if (savedInstanceState == null) {
            needsInit=true;
        }
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng position = new LatLng(Double.parseDouble(lat), Double.parseDouble(lang));

        googleMap.setMyLocationEnabled(true);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 13));

        googleMap.addMarker(new MarkerOptions()
                .title("Symphony Customer Care")
                .snippet(address)
                .position(position))
                .showInfoWindow();
        addressBar.setText(address);
    }

    @Override
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
    }
}
