package vadeworks.nannyroo.BookNanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vadeworks.nannyroo.MainActivity;
import vadeworks.nannyroo.R;

public class OrderConfirmation extends AppCompatActivity {


    Button orderConfimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        orderConfimation = findViewById(R.id.orderConfirmation);
        orderConfimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderConfirmation.this, MainActivity.class);
                // Comment Added...
                startActivity(intent);
            }
        });


    }
}
