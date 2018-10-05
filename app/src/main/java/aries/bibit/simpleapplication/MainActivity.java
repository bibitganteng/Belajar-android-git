package aries.bibit.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button buttonActivity, buttonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActivity = (Button) findViewById(R.id.activity);
        buttonFragment = (Button) findViewById(R.id.Fragment)


        buttonActivity.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {
                getSupportFragmentManager() .beginTransaction() .add(R.id.frame, new MainActivity())

                Intent i =new Intent(getApplicationContext(),second_activity.class);

                startActivity(i);



            }

        });


    }
}
