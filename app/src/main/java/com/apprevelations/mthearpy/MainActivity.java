package com.apprevelations.mthearpy;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvexercise, tvtips;

    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvexercise=(TextView)findViewById(R.id.tvexercise);
        tvtips=(TextView)findViewById(R.id.tvtips);


        tvexercise.setTypeface(EasyFonts.captureIt(this));
        tvtips.setTypeface(EasyFonts.captureIt(this));


        tvexercise.setOnClickListener(this);
        tvtips.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.tvexercise:
                //case when exercises are displayed

                Intent i1=new Intent();
                i1.setClass(getApplicationContext(), ExerciseActivity.class);
                startActivity(i1);

                break;
            case R.id.tvtips:
                //case when tips are selected

                Intent i2=new Intent();
           //     i2.setClass(getApplicationContext(), ExerciseActivity.class);
            //    startActivity(i2);



                break;

        }


    }
}
