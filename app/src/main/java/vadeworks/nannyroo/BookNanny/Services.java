package vadeworks.nannyroo.BookNanny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import vadeworks.nannyroo.R;

public class Services extends AppCompatActivity {

    private RadioGroup radioServicesGroup;
    private RadioGroup servicesTypes;
    private Button next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        radioServicesGroup=(RadioGroup)findViewById(R.id.radioService);
        servicesTypes = findViewById(R.id.servicesTypes);
        next3 = findViewById(R.id.next3);

        radioServicesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.oneTime:
                        servicesTypes.setVisibility(View.VISIBLE);
                        break;
                    case R.id.weekly:
                        servicesTypes.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });


        servicesTypes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.childcare:
                        next3.setVisibility(View.VISIBLE);
                        next3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Services.this,ChildCare.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.driving:
                        next3.setVisibility(View.VISIBLE);
                        next3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Services.this,Driving.class);
                                startActivity(intent);
                            }
                        });
                        break;
                    case R.id.tutors:
                        next3.setVisibility(View.VISIBLE);
                        next3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Services.this,Tutors.class);
                                startActivity(intent);
                            }
                        });
                        break;
                }
            }
        });








    }
}
