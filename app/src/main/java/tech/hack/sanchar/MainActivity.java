package tech.hack.sanchar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flash_screen);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();

            }
        },2000);





    }


}
