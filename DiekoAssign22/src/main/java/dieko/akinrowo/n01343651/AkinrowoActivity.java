/*
DIEKO AKINROWO, N01343651, SECTION D
 */

package dieko.akinrowo.n01343651;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static dieko.akinrowo.n01343651.R.layout.activity_second;

public class AkinrowoActivity extends AppCompatActivity {
    CheckBox chicken,olives,xcheese,pineapple,bbqs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Size
        RadioButton small= findViewById(R.id.diekosm);
        RadioButton medium= findViewById(R.id.diekomed);
        RadioButton large= findViewById(R.id.diekolg);
        RadioButton xlarge= findViewById(R.id.diekoxlg);
        
        //Type
        RadioButton panmade= findViewById(R.id.diekopan);
        RadioButton flat= findViewById(R.id.diekoflat);
        RadioButton tossed= findViewById(R.id.diekotossed);

        //Topping
        CheckBox pepperoni = findViewById(R.id.diekocheckBox);
        chicken=findViewById(R.id.diekocheckBox4);
        olives=findViewById(R.id.diekocheckBox6);
        xcheese=findViewById(R.id.diekocheckBox2);
        pineapple=findViewById(R.id.diekocheckBox5);
        bbqs=findViewById(R.id.diekocheckBox3);

        Button btn = findViewById(R.id.diekonext2);
        btn.setOnClickListener(v -> {
            String error = "";
            if(!small.isChecked() && !medium.isChecked() && !large.isChecked() && !xlarge.isChecked()) {
                error+="Please select size.\n";
            }
            if(!panmade.isChecked() && !flat.isChecked() && !tossed.isChecked()) {
                error+="Please select type.\n" ;
            }
            if(!pepperoni.isChecked() && !chicken.isChecked() && !olives.isChecked() && !xcheese.isChecked() && !pineapple.isChecked() && !bbqs.isChecked()) {
                error+="Please choose at least once topping.";
            }
            if((small.isChecked() || medium.isChecked() || large.isChecked() || xlarge.isChecked()) &&
              (panmade.isChecked() || flat.isChecked() || tossed.isChecked()) &&
              (pepperoni.isChecked() || chicken.isChecked() || olives.isChecked() || xcheese.isChecked() || pineapple.isChecked() || bbqs.isChecked())){
                newActivity();
            } else {
                Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void newActivity(){
        Intent intent = new Intent(AkinrowoActivity.this, AkinrowoActivity2.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(AkinrowoActivity.this, DiekoActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

}



