package com.example.finalproject;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MenuAdapter  extends ArrayAdapter<DataModel> implements View.OnClickListener{

    private ArrayList<DataModel> dataSet;
    Context mContext;

    private static class ViewHolder {
        TextView txtName , txtNum;
        String url,num;

    }

    public MenuAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.row_item, data);
        this.dataSet = data;
        this.mContext=context;

    }


    @Override
    public void onClick(View view) {

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataModel dataModel = getItem(position);
        ViewHolder viewHolder; // view lookup cache stored in tag
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item, parent, false);

    /*    if(position %2 != 1)
        {
            convertView.setBackgroundColor(Color.parseColor("#f5d862")); // some color
        }
        else
        {
            // default state
            convertView.setBackgroundColor (Color.WHITE); // default coloe
        }*/
            viewHolder.txtName =  convertView.findViewById(R.id.name);
            viewHolder.txtNum =  convertView.findViewById(R.id.num);

            viewHolder.num = String.valueOf(position+1);

           convertView.setTag(viewHolder);



        viewHolder.txtName.setText(dataModel.getName());
        viewHolder.txtNum.setText(viewHolder.num);
        // Return the completed view to render on screen
        return convertView;
    }
}
