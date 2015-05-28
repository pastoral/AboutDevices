package symphony.munir.com.aboutdevice.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.Arrays;
import java.util.Locale;

import symphony.munir.com.aboutdevice.R;
import symphony.munir.com.aboutdevice.adapter.CCDataAdapter;
import symphony.munir.com.aboutdevice.model.CCData;
import symphony.munir.com.aboutdevice.model.CCDataSet;
import symphony.munir.com.aboutdevice.utils.ConnectionDetector;
import symphony.munir.com.aboutdevice.utils.RecyclerItemClickListener;

/**
 * Created by admin on 5/15/2015.
 */
public class ContactsFragment extends Fragment {
    private ImageButton imageButton;
    public RecyclerView recycleViewer;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private CCDataSet ccDataSet;
    public CCData[] ccdata;
    public final static String EXTRA_LANG = "com.example.munirulhoque.recyclerview2.LANG";
    public final static String EXTRA_LAT = "com.example.munirulhoque.recyclerview2.LAT";
    public final static String EXTRA_ADDRESS = "com.example.munirulhoque.recyclerview2.ADDRESS";
    public ContactsFragment()
    {

    }
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


   @Override
   public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_contact,container,false);

        recycleViewer = (RecyclerView)v.findViewById(R.id.id_recyclerview);
        imageButton = (ImageButton)v.findViewById(R.id.id_AlterButton);

       // LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        lm.setOrientation(LinearLayoutManager.VERTICAL);

        // recycleViewer.setLayoutManager(mLayoutManager);
        recycleViewer.setLayoutManager(lm);
        ccDataSet = new CCDataSet();

        if(Locale.getDefault().getLanguage().equals("bn"))
        {
            ccdata = ccDataSet.getBanglaData();
            imageButton.setImageResource(R.drawable.toggle_english);
        }
        else
        {
            ccdata = ccDataSet.getEnglishData();
            imageButton.setImageResource(R.drawable.toggle_bangla);
        }
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alterLanguage();
            }
        });
        return v;
    }

    public void alterLanguage()
    {



        String temp = ccDataSet.getCCLang();
        if(temp.equals("en"))
        {


            ccdata = new CCData[ccdata.length];
            ccdata = ccDataSet.getBanglaData();
            Arrays.sort(ccdata, CCData.ccDataComparator);
            mAdapter = new CCDataAdapter(ccdata);
            recycleViewer.setAdapter(mAdapter);
            imageButton.setImageResource(R.drawable.toggle_english);

        }
        else
        {

            ccdata = new CCData[ccdata.length];
            ccdata = ccDataSet.getEnglishData();
            Arrays.sort(ccdata, CCData.ccDataComparator);
            mAdapter = new CCDataAdapter(ccdata);
            recycleViewer.setAdapter(mAdapter);
            imageButton.setImageResource(R.drawable.toggle_bangla);

        }
        //Toast.makeText(this,"Language Identified  " + ccDataSet.getCCLang(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();
        Arrays.sort(ccdata, CCData.ccDataComparator);
        mAdapter = new CCDataAdapter( ccdata);

        recycleViewer.setAdapter(mAdapter);

        recycleViewer.setHasFixedSize(true);

        recycleViewer.setItemAnimator(new DefaultItemAnimator());
        //  RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,LinearLayoutManager.VERTICAL);
       // recycleViewer.addItemDecoration(new DividerItemDecoration(ResourcesCompat.getDrawable(getResources(), R.drawable.recycler_item_divider, null)));
        recycleViewer.addItemDecoration(
                new HorizontalDividerItemDecoration.Builder(getActivity())
                        .color(Color.GRAY)
                        .sizeResId(R.dimen.recycler_item_divider)
                        .marginResId(R.dimen.recycler_divider_left_margin, R.dimen.recycler_divider_right_margin)
                        .build());


        recycleViewer.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(),new RecyclerItemClickListener.OnItemClickListener(){
                    @Override
                    public void onItemClick(View view, int position) {
                      // ((CCDataAdapter)recycleViewer.getAdapter())
                        Intent intent;

                        ConnectionDetector cd = new ConnectionDetector(getActivity().getApplicationContext());

                        Boolean isInternetPresent = cd.isConnectingToInternet();
                        if(isInternetPresent) {
                                int resultCode = GooglePlayServicesUtil
                                        .isGooglePlayServicesAvailable(getActivity());
                                // ---if Google Play services is available---
                                if (ConnectionResult.SUCCESS == resultCode) {
                                    intent = new Intent(getActivity(), MapActivity.class);
                                    // Toast.makeText(getActivity(),"Location Updates Google Play services is available.",Toast.LENGTH_LONG).show();
                                } else {
                                    //---Google Play services was not available for
                                    // some reason---
                                    intent = new Intent(getActivity(), AirMapActivity.class);
                                    // intent = new Intent(getActivity(),MapActivity.class);
                                    // Toast.makeText(getActivity(), "Location Updates Google Play services is NOT available.", Toast.LENGTH_LONG).show();
                                }

                                String activityName = getActivity().getClass().getSimpleName();
                                intent.putExtra(EXTRA_LAT, ccdata[position].getLatitude());
                                intent.putExtra(EXTRA_LANG, ccdata[position].getLongitude());
                                intent.putExtra(EXTRA_ADDRESS, ccdata[position].getCcAddress());
                                intent.putExtra("Activity",activityName);
                                startActivity(intent);
                                //Toast.makeText(view.getContext(),"item :  " + ccdata[position].getCcAddress(), Toast.LENGTH_SHORT).show();
                            }
                         else {

                               Toast.makeText(getActivity().getApplicationContext(),"Please check your internet connection",Toast.LENGTH_SHORT).show();
                            }
                        }
                    })
            );

    }
}
