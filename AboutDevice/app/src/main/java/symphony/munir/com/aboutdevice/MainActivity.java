package symphony.munir.com.aboutdevice;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import symphony.munir.com.aboutdevice.activity.ContactsFragment;
import symphony.munir.com.aboutdevice.activity.FeatureFragment;
import symphony.munir.com.aboutdevice.activity.FragmentDrawer;
import symphony.munir.com.aboutdevice.activity.HomeFragment;


public class MainActivity extends ActionBarActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

    private Toolbar mToolbar;
    private FragmentDrawer drawerFragment;
    TextView modelName;
    private Fragment uniFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        modelName = (TextView)findViewById(R.id.model_name);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
       // getSupportActionBar().setDisplayShowHomeEnabled(true);
       // displayShowHomeEnabled(true);


        drawerFragment = (FragmentDrawer)
        getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);
       // displayView(0);
        String brand = Build.BRAND;
        //Toast.makeText(this,brand,Toast.LENGTH_SHORT).show();

        if(brand.contains("Symphony")||brand.contains("symphony") )
        {
            displayView(0);
        }
        else{
            inCompatibilityDialog();
        }


    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu);

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
    } */

    @Override
    public void onDrawerItemSelected(View view, int position) {
            displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new HomeFragment();
                title = getString(R.string.title_home);
                modelName.setText("");

                break;
            case 1:
                fragment = new FeatureFragment();
                title = getString(R.string.title_feature);
                modelName.setText("Helio S1");
                break;
            case 2:
                fragment = new ContactsFragment();
                title = getString(R.string.title_contacts);
                modelName.setText("");
                break;
            default:
                break;
        }

        if (fragment != null) {
            uniFragment = fragment;
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

    public void showFeatures(View v)
    {

        Fragment fragment = new FeatureFragment();
        String title = getString(R.string.app_name);
        title = getString(R.string.title_feature);
        modelName.setText("Helio S1");
        fragmentSwitching(fragment,title);

    }
    public void showCustomerCare(View v)
    {


        Fragment fragment = new ContactsFragment();
        String title = getString(R.string.app_name);
        title = getString(R.string.title_contacts);
        modelName.setText("");
        fragmentSwitching(fragment,title);

    }

    public void fragmentSwitching(Fragment fragment, String title)
    {
        getSupportActionBar().setTitle(title);
        uniFragment = fragment;
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_body, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        // set the toolbar title
       //
    }

    @Override
    public void onBackPressed() {
        if(!(uniFragment instanceof HomeFragment))
        {
            Fragment fragment = new HomeFragment();
            String title = getString(R.string.app_name);
            title = getString(R.string.title_home);
            modelName.setText("");
            fragmentSwitching(fragment,title);
        }
        else {
            super.onBackPressed();
            finish();
        }
    }
    public void callHotline1(View view)
    {
        Intent intent1 = new Intent(Intent.ACTION_DIAL);
        intent1.setData(Uri.parse("tel:16272"));
        startActivity(intent1);
    }

    public void callHotline2(View view)
    {
        Intent intent2 = new Intent(Intent.ACTION_DIAL);
        intent2.setData(Uri.parse("tel:0966670066"));
        startActivity(intent2);
    }

    public void inCompatibilityDialog()
    {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(this,R.style.AppCompatAlertDialogStyle);
        builder.setTitle("Non brand device");
        builder.setMessage("Please use a Symphony smart phone to run this application");
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //dialogInterface.dismiss();

                finish();

            }
        });
        builder.show();


    }
}
