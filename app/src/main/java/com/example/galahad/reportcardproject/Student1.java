package com.example.galahad.reportcardproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Student1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_file);
        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();
        grades.add(new ReportCard("Math","A"));
        grades.add(new ReportCard("Chemistry","B"));
        grades.add(new ReportCard("Biology","A"));
        grades.add(new ReportCard("Physics","A"));
    ReportAdapter adapter = new ReportAdapter(this,grades);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
