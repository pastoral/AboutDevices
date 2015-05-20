package symphony.munir.com.aboutdevice.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import symphony.munir.com.aboutdevice.R;
import symphony.munir.com.aboutdevice.model.CCData;

/**
 * Created by munirul.hoque on 4/9/2015.
 */
public class CCDataAdapter extends RecyclerView.Adapter<CCDataAdapter.CCViewHolder> {
private CCData[] ccData;
//private  MyClickListner myClickListner;
private static String LOG_TAG = "CCDataAdapter";

    public CCDataAdapter(CCData[] ccData)
    {
        this.ccData = ccData;
    }

    public class CCViewHolder extends RecyclerView.ViewHolder //implements View.OnClickListener // only make the item clickable
    {
        public ImageView ccIcon;
        public TextView ccDistrict;
        public TextView ccAddress;


        public CCViewHolder(View itemLayoutView)
        {
            super(itemLayoutView);
            ccIcon = (ImageView)itemLayoutView.findViewById(R.id.id_ccicon);
            ccDistrict = (TextView)itemLayoutView.findViewById(R.id.id_ccDistrict);
            ccAddress = (TextView)itemLayoutView.findViewById(R.id.id_ccAddress);
            Log.v(LOG_TAG, "Adding Click Listner");

           // itemLayoutView.setClickable(true);
           // itemLayoutView.setOnClickListener(this); // Set click listner for item

        }

      /*  @Override
        public void onClick(View view) { // item clickable
           Toast.makeText(view.getContext(), "item : " + getAdapterPosition(),Toast.LENGTH_SHORT).show();

        }*/
    }


    @Override
    public CCViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.ccpoint_layout,parent,false);
        return new CCViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(CCViewHolder holder, int position) {
      holder.ccIcon.setImageResource(ccData[position].getImageUrl());
      holder.ccDistrict.setText(ccData[position].getCcName());
      holder.ccAddress.setText(ccData[position].getCcAddress());
    }

    @Override
    public int getItemCount() {
        //return 0;
        return ccData.length;
    }



  /*  public interface MyClickListner{
      public void  onItemClick(int position, View v);
    }*/
}
