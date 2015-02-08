package com.techonlogic.yesalam.cardviewlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yesAlam on 23/01/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {

    private ArrayList<BusData> dataset;


    public static class MyViewholder extends RecyclerView.ViewHolder{
        TextView  busno ;
        TextView fromdata ;
        TextView todata ;
        TextView faredata ;
        TextView distdata ;

        public MyViewholder(View itemview){
            super(itemview);
            this.busno = (TextView) itemview.findViewById(R.id.busvalue);
            this.fromdata = (TextView) itemview.findViewById(R.id.fromvalue);
            this.todata = (TextView) itemview.findViewById(R.id.tovalue);
            this.faredata = (TextView) itemview.findViewById(R.id.farevalue);
            this.distdata = (TextView) itemview.findViewById(R.id.distvalue);


        }

    }

    public MyAdapter(ArrayList<BusData> busdataset){this.dataset = busdataset ;}

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        view.setOnClickListener(MainActivity.myOnClickListener);
        MyViewholder myViewholder = new MyViewholder(view);
        return myViewholder;
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int i) {

        TextView  busno = holder.busno;
        TextView fromdata = holder.fromdata;
        TextView todata =  holder.todata;
        TextView faredata = holder.faredata;
        TextView distdata = holder.distdata;

        busno.setText(dataset.get(i).getBus());
        fromdata.setText(dataset.get(i).getFrom());
        todata.setText(dataset.get(i).getTo());
        faredata.setText(dataset.get(i).getFare());
        distdata.setText(dataset.get(i).getDist());


    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }


}
