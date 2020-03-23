package tech.hack.sanchar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView newsCard;
    CardView workCard;
    CardView gameCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsCard = (CardView)findViewById(R.id.newsCard);
        workCard = (CardView)findViewById(R.id.workCard);
        gameCard = (CardView)findViewById(R.id.gameCard);


        workCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,WorkActivity.class));
            }
        });

        gameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,GameActivity.class));
            }
        });




    }


}
