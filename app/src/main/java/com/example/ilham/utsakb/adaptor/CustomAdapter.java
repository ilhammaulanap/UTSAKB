package com.example.ilham.utsakb.adaptor;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ilham.utsakb.R;

//Nama  : Ilham Maulana Pratama
//NIM   : 10116335
//KLS   : IF 8
//TGL   : 6 Mei 2019

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet,mDataSet2, mDataSet3, mDataSet4, mDataSet5, mDataSet6 ;
    private int[] mDataSet7;

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView,textView2,textView3,textView4,textView5,textView6;
        private final ImageView icon;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getPosition() + " clicked.");
                }
            });
            textView = (TextView) v.findViewById(R.id.nim);
            textView2 = (TextView) v.findViewById(R.id.nama);
            textView3 = (TextView) v.findViewById(R.id.kelas);
            textView4 = (TextView) v.findViewById(R.id.telepon);
            textView5 = (TextView) v.findViewById(R.id.email);
            textView6 = (TextView) v.findViewById(R.id.social);
            icon = (ImageView) v.findViewById(R.id.thumbnail);
        }

        public TextView getTextView() {
            return textView;
        }
        public TextView getTextView2() {
            return textView2;
        }
        public TextView getTextView3() {
            return textView3;
        }
        public TextView getTextView4() {
            return textView4;
        }
        public TextView getTextView5() {
            return textView5;
        }
        public TextView getTextView6() {
            return textView6;
        }
        public ImageView getImageView() {
            return icon;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomAdapter(String[] dataSet,String[] dataSet2,String[] dataSet3,String[] dataSet4,String[] dataSet5,String[] dataSet6, int[] mDataSet7) {
        this.mDataSet = dataSet;
        this.mDataSet2 = dataSet2;
        this.mDataSet3 = dataSet3;
        this.mDataSet4 = dataSet4;
        this.mDataSet5 = dataSet5;
        this.mDataSet6 = dataSet6;
        this.mDataSet7 = mDataSet7;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_view, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getTextView2().setText(mDataSet2[position]);
        viewHolder.getTextView3().setText(mDataSet3[position]);
        viewHolder.getTextView4().setText(mDataSet4[position]);
        viewHolder.getTextView5().setText(mDataSet5[position]);
        viewHolder.getTextView6().setText(mDataSet6[position]);
        viewHolder.getImageView().setImageResource(mDataSet7[position]);
    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
