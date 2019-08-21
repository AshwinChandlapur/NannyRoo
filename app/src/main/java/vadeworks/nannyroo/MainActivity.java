package vadeworks.nannyroo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gc.materialdesign.views.ButtonRectangle;

import vadeworks.nannyroo.BookNanny.BookNanny;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButtonRectangle bookNanny = findViewById(R.id.bookNanny);
        bookNanny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookNanny.class);
                startActivity(intent);
            }
        });
    }
}
//change in main activity