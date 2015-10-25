package com.apprevelations.mthearpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ExerciseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lv1;
    ArrayList<ExerciseItem> data;
    ExerciseAdapter adapter;
    LayoutInflater l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        data=new ArrayList<ExerciseItem>();
        l=getLayoutInflater();
        adapter=new ExerciseAdapter(this, 0, data, l);

        lv1=(ListView)findViewById(R.id.lv1_exercise_activity);

        lv1.setAdapter(adapter);

        ExerciseItem e1=new ExerciseItem("Hand Curl 1");
        ExerciseItem e2=new ExerciseItem("Hand Side Swing 1");
        ExerciseItem e3=new ExerciseItem("Shoulder Front Swing");
        ExerciseItem e4=new ExerciseItem("Bench Press");
        ExerciseItem e5=new ExerciseItem("Crunches");
        ExerciseItem e6=new ExerciseItem("Chinups");
        ExerciseItem e7=new ExerciseItem("Dips");

        data.add(e1);
        data.add(e2);
        data.add(e3);
        data.add(e4);
        data.add(e5);
        data.add(e6);
        data.add(e7);

        lv1.setOnItemClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exercise, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent i=new Intent();
        i.setClass(getApplicationContext(), ExerciseSensor.class);

        ExerciseItem ei1=data.get(position);

        String exercise_name=ei1.exercise_name;



        i.putExtra("exercise_name_from_exerciseactivity", exercise_name);

        startActivity(i);

    }
}
