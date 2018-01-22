package com.example.galahad.reportcardproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import android.widget.TextView;

/**
 * Created by Galahad on 01/12/2016.
 */

public class ReportAdapter extends ArrayAdapter<ReportCard> {
    public ReportAdapter(Context context, ArrayList<ReportCard> grades) {
        super(context, 0, grades);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }
        ReportCard currentWord = getItem(position);


        TextView subTextView = (TextView) listItemView.findViewById(R.id.Subject_text_view);

        subTextView.setText(currentWord.getsubject());


        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.Grade_text_view);

       gradeTextView.setText(currentWord.getgrade());


        return listItemView;
    }

}
