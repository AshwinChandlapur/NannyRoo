package vadeworks.nannyroo.BookNanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import vadeworks.nannyroo.R;

public class ChildCare extends AppCompatActivity {

    Button nextChildCare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_care);
        nextChildCare = findViewById(R.id.nextChildCare);
        nextChildCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChildCare.this,OrderDetails.class);
                startActivity(intent);
            }
        });

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.opt1:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt2:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt3:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt4:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt5:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt6:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt7:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt8:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
            case R.id.opt9:
                nextChildCare.setVisibility(View.VISIBLE);
                break;
        }
    }
}
