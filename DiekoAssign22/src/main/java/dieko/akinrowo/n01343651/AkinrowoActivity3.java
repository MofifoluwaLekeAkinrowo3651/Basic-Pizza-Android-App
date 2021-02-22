//Dieko Akinrowo, N01343651 Section D
package dieko.akinrowo.n01343651;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


import static dieko.akinrowo.n01343651.R.layout.activity_final;


public class AkinrowoActivity3 extends AppCompatActivity {
//    EditText date_time;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_final);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        date_time = findViewById(R.id.diekodatetimepicker);
//        date_time.setInputType(InputType.TYPE_NULL);
        TextView UserInput1 = findViewById(R.id.diekoname_view);
        TextView UserInput2 = findViewById(R.id.diekoaddress_View);
        TextView UserInput3 = findViewById(R.id.diekospinnerView);
        UserInput1.setText(getIntent().getStringExtra("Name"));
        UserInput2.setText(getIntent().getStringExtra("Address"));
        UserInput3.setText(getIntent().getStringExtra("Postcode"));

        Button button = findViewById(R.id.diekodone);
        button.setOnClickListener(v -> onDone());
    }

    public void newActivity(){
        Intent intent = new Intent(AkinrowoActivity3.this, DiekoActivity.class);
        startActivity(intent);
    }

//        public void showDateTime(final EditText date_time) {
//            Calendar calendar = Calendar.getInstance();
//            DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
//                @Override
//                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                    calendar.set(Calendar.YEAR,year);
//                    calendar.set(Calendar.MONTH,month);
//                    calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
//
//                    TimePickerDialog.OnTimeSetListener timeSetListener=new TimePickerDialog.OnTimeSetListener() {
//                        @Override
//                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                            calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
//                            calendar.set(Calendar.MINUTE,minute);
//
//                            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yy HH:mm");
//                            date_time.setText(simpleDateFormat.format(calendar.getTime()));
//                        }
//                    };
//                    new TimePickerDialog(AkinrowoActivity3.this, timeSetListener,calendar.get(Calendar.HOUR_OF_DAY)
//                           ,calendar.get(Calendar.MINUTE),false).show();
//
//                }
//            };
//
//            new DatePickerDialog(AkinrowoActivity3.this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)
//                    ,calendar.get(Calendar.DAY_OF_MONTH)).show();
//        }

    public void onDone() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Pickup/Delivery Time");

        alertDialogBuilder
                .setMessage("Order #0001" +
                        "\n" +
                        "Your order will be read in 30 minutes!")
                .setCancelable(false)
                .setPositiveButton("Okay, thanks", (dialog, id) -> {

                    Toast.makeText(getApplicationContext(), "Enjoy!",
                            Toast.LENGTH_LONG).show();
                    newActivity();
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    }

