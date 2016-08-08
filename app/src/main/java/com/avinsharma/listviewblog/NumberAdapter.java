package com.avinsharma.listviewblog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberAdapter extends ArrayAdapter<Number> {

    //Constructor, required for when we declare new objects
    public NumberAdapter (Context context, ArrayList<Number> objects){

        super(context,0,objects);
    }

    //View holder pattern makes your ListView more efficient by reusing views and not using findViewById() everytime
    static class ViewHolder{
        TextView spanishNumber;
        TextView englishNumber;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        //If we have null here we inflate layout and initialize the TextViews with findViewByIds
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder();
            holder.englishNumber = (TextView) convertView.findViewById(R.id.english_number);
            holder.spanishNumber = (TextView) convertView.findViewById(R.id.spanish_number);
            //to save the view holder to the view to be reused later
            convertView.setTag(holder);
        }
        //its not null meaning we can use the previously initialized TextViews without
        //performing findViewById every time improving ListView performance
        else{
            //get the previously set view holder from the view
            holder = (ViewHolder) convertView.getTag();
        }

        //get the current item to be displayed
        Number currentNumber = getItem(position);

        //set the TextViews values
        holder.spanishNumber.setText(currentNumber.getmSpanishTranslation());
        holder.englishNumber.setText(currentNumber.getmDefaultTranslation());

        return convertView;
    }
}
