package vadeworks.nannyroo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SpalashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_spalash_screen);
        getSupportActionBar().hide();

        //ANOTHER COMMENT FROM LIZA

        // Another COmment Added.

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpalashScreen.this, IntroActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);


    }
}
