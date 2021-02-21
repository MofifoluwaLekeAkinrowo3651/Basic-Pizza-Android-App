package dieko.akinrowo.n01343651;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import static dieko.akinrowo.n01343651.R.layout.activity_final;


public class AkinrowoActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_final);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView UserInput1 = findViewById(R.id.diekoname_view);
        TextView UserInput2 = findViewById(R.id.diekoaddress_View);
        TextView UserInput3 = findViewById(R.id.diekospinnerView);
        UserInput1.setText(getIntent().getStringExtra("Name"));
        UserInput2.setText(getIntent().getStringExtra("Address"));
        UserInput3.setText(getIntent().getStringExtra("Postcode"));


    }
}
