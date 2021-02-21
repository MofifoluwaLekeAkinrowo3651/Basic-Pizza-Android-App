package dieko.akinrowo.n01343651;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import static dieko.akinrowo.n01343651.R.layout.activity_final;


public class AkinrowoActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_final);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        TextView UserInput1 = findViewById(R.id.diekoet);
////        TextView UserInput2 = findViewById(R.id.diekoaddress);
////        TextView UserInput3 = findViewById(R.id.diekopostc);
//        Intent intent = getIntent();
////        String str1 = intent.getStringExtra("Name");
////        String str2 = intent.getStringExtra("Address");
////        String str3 = intent.getStringExtra("Postcode");
//
//        UserInput1.setText(getIntent().getStringExtra("Name"));
//        UserInput1.setText(getIntent().getStringExtra("Name"));
//        UserInput1.setText(getIntent().getStringExtra("Name"));
    }
}
