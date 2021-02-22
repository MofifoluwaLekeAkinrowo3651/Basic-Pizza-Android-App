package dieko.akinrowo.n01343651;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import static dieko.akinrowo.n01343651.R.layout.activity_third;

public class AkinrowoActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_third);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        EditText name = findViewById(R.id.diekoet);
        EditText credit_card = findViewById(R.id.diekoet2);
        EditText sec_pin = findViewById(R.id.diekoet3);
        EditText postcode = findViewById(R.id.diekopostc);
        EditText address = findViewById(R.id.diekoaddress);

        Spinner province = findViewById(R.id.dieko_province);
        province.setOnItemSelectedListener(this);
        List<String> provinces = new ArrayList<>();
        provinces.add("Alberta");
        provinces.add("British Columbia");
        provinces.add("Manitoba");
        provinces.add("New Brunswick");
        provinces.add("Newfoundland and Labrador");
        provinces.add("Nunavut");
        provinces.add("Ontario");
        provinces.add("Prince Edward Island");
        provinces.add("Quebec");
        provinces.add("Saskatchewan");
        provinces.add("Yukon");

        ArrayAdapter array = new ArrayAdapter(this, android.R.layout.simple_spinner_item, provinces);
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        province.setAdapter(array);

        Button order = findViewById(R.id.diekoorder);
        order.setOnClickListener(v -> {
                    if (name.getText().toString().trim().equalsIgnoreCase("")) {
                        name.setError(getString(R.string.enter_name));
                    }
                    if (credit_card.getText().toString().trim().equalsIgnoreCase("")) {
                        credit_card.setError(getString(R.string.enter_card));
                    }
                    if (sec_pin.getText().toString().trim().equalsIgnoreCase("")) {
                        sec_pin.setError("Please enter pin");
                    }
                    if (postcode.getText().toString().trim().equalsIgnoreCase("")) {
                        postcode.setError("Please enter postcode");
                    }
                    if (address.getText().toString().trim().equalsIgnoreCase("")) {
                        address.setError("Please enter address");
                    }
                    else {
                        newActivity();
                    }

            TextView checkoutname = findViewById(R.id.diekoet);
            TextView checkoutaddress = findViewById(R.id.diekoaddress);
            TextView checkoutpostc = findViewById(R.id.diekopostc);

            Intent intent = new Intent(AkinrowoActivity2.this, AkinrowoActivity3.class);
            intent.putExtra("Name", checkoutname.getText().toString());
            intent.putExtra("Address", checkoutaddress.getText().toString());
            intent.putExtra("Postcode", checkoutpostc.getText().toString());
            startActivity(intent);

                });

            name.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (name.getText().length() <= 3) {
                        name.setError("Name must be higher than 3 characters");
                    }
                    return false;
                }
            });
            credit_card.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (credit_card.getText().length() < 16) {
                        credit_card.setError("Invalid Number");
                    }
                    return false;
                }
            });
            postcode.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (postcode.getText().length() < 6) {
                        postcode.setError("Invalid Postcode");
                    }
                    return false;
                }
            });
            sec_pin.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (sec_pin.getText().length() < 3) {
                        sec_pin.setError("Invalid Pin");
                    }
                    return false;
                }
            });
            postcode.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (postcode.getText().length() < 6) {
                        postcode.setError("Invalid Postcode");
                    }
                    return false;
                }
            });

        }

    public void newActivity(){
        Intent intent = new Intent(AkinrowoActivity2.this, AkinrowoActivity3.class);
        startActivity(intent);
    }
        @Override
        public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
//do nothing
        }
        @Override
        public void onNothingSelected (AdapterView < ? > parent){
//do nothing
        }

}

