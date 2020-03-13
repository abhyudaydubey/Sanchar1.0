package tech.hack.sanchar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText userName;
    private EditText userCountry;
    private EditText userState;
    private EditText userRegion;
    private EditText userEmail;
    private EditText userPhone;
    private EditText userPass;

    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName = (EditText)findViewById(R.id.userName);
        userCountry = (EditText)findViewById(R.id.userCountry);
        userState = (EditText)findViewById(R.id.userState);
        userRegion = (EditText)findViewById(R.id.userRegion);
        userEmail= (EditText)findViewById(R.id.userEmail);
        userPhone = (EditText)findViewById(R.id.userPhone);
        userPass = (EditText)findViewById(R.id.userPass);

        registerBtn = (Button)findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
