package vadeworks.nannyroo.Landing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.gc.materialdesign.views.ButtonRectangle;

import vadeworks.nannyroo.MainActivity;
import vadeworks.nannyroo.OnBoarding.OnBoarding;
import vadeworks.nannyroo.R;

public class Landing extends AppCompatActivity {

    ButtonRectangle register;
    ButtonRectangle login;

    ButtonRectangle loginNow;
    ButtonRectangle registerNow;
    LinearLayout registerLogin;
    LinearLayout registerPage;
    LinearLayout loginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        getSupportActionBar().hide();


        register = findViewById(R.id.register);
        login = findViewById(R.id.login);
        registerLogin = findViewById(R.id.registerLogin);
        registerPage = findViewById(R.id.registerPage);
        loginPage = findViewById(R.id.loginPage);
        loginNow = findViewById(R.id.loginNow);
        registerNow = findViewById(R.id.registerNow);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerLogin.setVisibility(View.GONE);
                registerPage.setVisibility(View.VISIBLE);
            }
        });


        registerNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landing.this, OnBoarding.class);
                startActivity(intent);
            }
        });


        loginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landing.this, MainActivity.class);
                startActivity(intent);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerLogin.setVisibility(View.GONE);
                loginPage.setVisibility(View.VISIBLE);
            }
        });





    }
}
