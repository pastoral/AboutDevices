package symphony.munir.com.aboutdevice.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import symphony.munir.com.aboutdevice.R;

/**
 * Created by admin on 5/15/2015.
 */
public class FeatureFragment extends Fragment {
    TextView modelName;
    public FeatureFragment()
    {

    }

    @Override
    public void onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_feature,container,false);
       // modelName = (TextView)view.findViewById(R.id.model_name);
       // modelName.setText("Helio S1");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
