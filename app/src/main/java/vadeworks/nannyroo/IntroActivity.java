package vadeworks.nannyroo;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.cuneytayyildiz.onboarder.OnboarderActivity;
import com.cuneytayyildiz.onboarder.OnboarderPage;
import com.cuneytayyildiz.onboarder.utils.OnboarderPageChangeListener;


import java.util.Arrays;
import java.util.List;

import vadeworks.nannyroo.Landing.Landing;

public class IntroActivity extends OnboarderActivity implements OnboarderPageChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        List<OnboarderPage> pages = Arrays.asList(
                new OnboarderPage.Builder()
                        .title("Childcare on Demand!!!")
                        .description("Offers the best nanny services.")
                        .imageResourceId( R.drawable.logo_white)
                        .backgroundColorId(R.color.green_400)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build(),
                new OnboarderPage.Builder()
                        .title("Childcare on Demand!!!")
                        .description("Offers the best nanny services.")
                        .imageResourceId( R.drawable.logo_white)
                        .backgroundColorId(R.color.green_500)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build(),
                new OnboarderPage.Builder()
                        .title("Childcare on Demand!!!")
                        .description("Offers the best nanny services.")
                        .imageResourceId( R.drawable.logo_white)
                        .backgroundColorId(R.color.green_500)
                        .titleColorId(R.color.white)
                        .descriptionColorId(R.color.white)
                        .multilineDescriptionCentered(true)
                        .build()

        );
        setOnboarderPageChangeListener(this);
        initOnboardingPages(pages);



    }

    @Override
    public void onFinishButtonPressed() {
        Intent intent = new Intent(IntroActivity.this, Landing.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onPageChanged(int position) {

    }
}
