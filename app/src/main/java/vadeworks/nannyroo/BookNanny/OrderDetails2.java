package vadeworks.nannyroo.BookNanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vadeworks.nannyroo.R;

public class OrderDetails2 extends AppCompatActivity {


    Button orderDetails2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details2);


        orderDetails2 = findViewById(R.id.orderdetails2);
        orderDetails2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderDetails2.this, OrderDetails3.class);
                startActivity(intent);
            }
        });
    }
}
