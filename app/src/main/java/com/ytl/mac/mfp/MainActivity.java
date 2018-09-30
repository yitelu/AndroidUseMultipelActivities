package com.ytl.mac.mfp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hi Toast Message", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        showCountTextView.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(View View){

        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();

        int count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);

        //start new activity.
        startActivity(randomIntent);

    }
}
