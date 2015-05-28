package symphony.munir.com.aboutdevice.activity;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.android.airmapview.AirMapInterface;
import com.airbnb.android.airmapview.AirMapMarker;
import com.airbnb.android.airmapview.AirMapView;
import com.airbnb.android.airmapview.AirMapViewTypes;
import com.airbnb.android.airmapview.DefaultAirMapViewBuilder;
import com.airbnb.android.airmapview.listeners.OnCameraChangeListener;
import com.airbnb.android.airmapview.listeners.OnCameraMoveListener;
import com.airbnb.android.airmapview.listeners.OnInfoWindowClickListener;
import com.airbnb.android.airmapview.listeners.OnLatLngScreenLocationCallback;
import com.airbnb.android.airmapview.listeners.OnMapClickListener;
import com.airbnb.android.airmapview.listeners.OnMapInitializedListener;
import com.airbnb.android.airmapview.listeners.OnMapMarkerClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import symphony.munir.com.aboutdevice.R;

public class AirMapActivity extends ActionBarActivity
        implements OnCameraChangeListener, OnMapInitializedListener,
        OnMapClickListener, OnCameraMoveListener, OnMapMarkerClickListener,
        OnInfoWindowClickListener, OnLatLngScreenLocationCallback {

    private AirMapView map;
    private DefaultAirMapViewBuilder mapViewBuilder;
   // private TextView textLogs;
    private String lat, lang, address;
    TextView addressBar;
    String textLogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        lat = intent.getStringExtra(ContactsFragment.EXTRA_LAT);
        lang = intent.getStringExtra(ContactsFragment.EXTRA_LANG);
        address = intent.getStringExtra(ContactsFragment.EXTRA_ADDRESS);
        setContentView(R.layout.activity_air_map);
       // AirMapView  mapView = (AirMapView) findViewById(R.id.map_view);
        //mapView.initialize(getSupportFragmentManager());
        mapViewBuilder = new DefaultAirMapViewBuilder(this);
        map = (AirMapView) findViewById(R.id.map);
        addressBar  = (TextView)findViewById(R.id.id_footerAddress);
        addressBar.setText(address);
       // textLogs = (TextView) findViewById(R.id.textLogs);

        map.setOnMapClickListener(this);
        map.setOnCameraChangeListener(this);
        map.setOnCameraMoveListener(this);
        map.setOnMarkerClickListener(this);
        map.setOnMapInitializedListener(this);
        map.setOnInfoWindowClickListener(this);
        map.initialize(getSupportFragmentManager());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_air_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        AirMapInterface airMapInterface = null;

        if (id == R.id.action_native_map) {
            try {
                airMapInterface = mapViewBuilder.builder(AirMapViewTypes.NATIVE).build();
            } catch (UnsupportedOperationException e) {
                Toast.makeText(this, "Sorry, native Google Maps are not supported by this device. " +
                                "Please make sure you have Google Play Services installed.",
                        Toast.LENGTH_SHORT).show();
            }
        } else if (id == R.id.action_web_map) {
            airMapInterface = mapViewBuilder.builder(AirMapViewTypes.WEB).build();
        } else if (id == R.id.action_clear_logs) {
            ;
        }

        if (airMapInterface != null) {
            map.initialize(getSupportFragmentManager(), airMapInterface);
        }

        return super.onOptionsItemSelected(item);
    }


    @Override public void onCameraChanged(LatLng latLng, int zoom) {
        appendLog("Map onCameraChanged triggered with lat: " + latLng.latitude + ", lng: "
                + latLng.longitude);
    }

    @Override public void onMapInitialized() {
        appendLog("Map onMapInitialized triggered");
        LatLng position = new LatLng(Double.parseDouble(lat), Double.parseDouble(lang));
        addMarker(address, position, 1);
        map.animateCenterZoom(position, 15);


    }

    private void addMarker(String title, LatLng latLng, int id) {
        map.addMarker(new AirMapMarker(latLng, id)
                .setTitle(title)
                .setIconId(R.mipmap.icon_location_pin));
    }

    @Override public void onMapClick(LatLng latLng) {
        if (latLng != null) {
            appendLog(
                    "Map onMapClick triggered with lat: " + latLng.latitude + ", lng: "
                            + latLng.longitude);

            map.getMapInterface().getScreenLocation(latLng, this);
        } else {
            appendLog("Map onMapClick triggered with null latLng");
        }
    }

    @Override public void onCameraMove() {
        appendLog("Map onCameraMove triggered");
    }

    private void appendLog(String msg) {
        Log.v("Air Map Log : " , textLogs + "\n" + msg );

    }

    @Override public void onMapMarkerClick(long id) {
        appendLog("Map onMapMarkerClick triggered with id " + id);
    }

    @Override public void onMapMarkerClick(Marker marker) {
        appendLog("Map onMapMarkerClick triggered with marker " + marker.getId());
    }

    @Override public void onInfoWindowClick(long id) {
        appendLog("Map onInfoWindowClick triggered with id " + id);
    }

    @Override public void onInfoWindowClick(Marker marker) {
        appendLog("Map onInfoWindowClick triggered with marker " + marker.getId());
    }

    @Override public void onLatLngScreenLocationReady(Point point) {
        appendLog("LatLng location on screen (x,y): (" + point.x + "," + point.y + ")");
    }
    public void getPlayService(View view)
    {
        Intent intent = new Intent(this,MapActivity.class);
        intent.putExtra("lat", lat);
        intent.putExtra("lang", lang);
        intent.putExtra("address",address);
        intent.putExtra("Activity",this.getClass().getSimpleName());
        startActivity(intent);
    }
}
