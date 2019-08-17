package vadeworks.nannyroo.BookNanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vadeworks.nannyroo.R;

public class OrderDetails3 extends AppCompatActivity {



    Button orderDetails3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details3);



        orderDetails3 = findViewById(R.id.orderdetails3);
        orderDetails3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderDetails3.this, OrderConfirmation.class);
                startActivity(intent);
            }
        });

    }
}
