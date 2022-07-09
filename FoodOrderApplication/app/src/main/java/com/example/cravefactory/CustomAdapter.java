package com.example.cravefactory;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] pic;
    String[] foodNames;

    private LayoutInflater inflater;     //is a class used to instantiate layout xml file into its corresponding view objects

    CustomAdapter(Context context,String[]foodNames,int[]pic){

        this.context=context;
        this.foodNames=foodNames;
        this.pic=pic;
    }

    @Override
    public int getCount() {
        return foodNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override //get a view that displays data at specified position in data set u can either create view
    // manually or inflate it from xml layout file
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view=inflater.inflate(R.layout.sample_view,viewGroup,false); //inflate new view hierarchy from specific xml resource
        }
        ImageView imageView=(ImageView)view.findViewById(R.id.imageViewId);
        TextView textView=(TextView)view.findViewById(R.id.textViewId);
        imageView.setImageResource(pic[i]);
        textView.setText(foodNames[i]);
        return view;
    }
}
