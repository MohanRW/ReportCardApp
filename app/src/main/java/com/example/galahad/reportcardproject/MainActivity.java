package com.example.galahad.reportcardproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView student1=(TextView)findViewById(R.id.student1);

      student1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent student1Intent = new Intent(MainActivity.this,Student1.class);
              startActivity(student1Intent);
          }
      });

}
}
