package dieko.akinrowo.n01343651;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DiekoActivity extends AppCompatActivity {

    final Context context = this;
    RadioButton PizzaP, Dominos, PizzaHut;
    RadioGroup radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PizzaP = findViewById(R.id.dieko_pp);
        Dominos = findViewById(R.id.dieko_dominos);
        PizzaHut = findViewById(R.id.dieko_phut);

        Button btn = findViewById(R.id.diekonext1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = getString(R.string.load_mess);
                String error="Please select a store.";
                if(!PizzaP.isChecked() && !Dominos.isChecked() && !PizzaHut.isChecked()){
                    Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
                    newActivity();
                }
            }
        });
    }

    public void newActivity(){
        Intent intent = new Intent(DiekoActivity.this, AkinrowoActivity.class);
        startActivity(intent);
    }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
  MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    Intent intent;
    switch (item.getItemId()) {
        case R.id.diekopizza:
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.dominos.ca"));
            startActivity(intent);

            String str = getString(R.string.menu_toast);
            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            break;

        case R.id.diekohelp:
            intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com"));
            startActivity(intent);
            break;

        case R.id.diekohmenu:
            String hello = getString(R.string.hello_mess);
            Toast.makeText(getApplicationContext(), hello, Toast.LENGTH_LONG).show();
        default:
            return super.onOptionsItemSelected(item);
    }
return true;

}

//    public void onRadioButtonClicked(View view) {
//        boolean checked = ((RadioButton) view).isChecked();
//        String string ="";
//        // Check which RadioButton was clicked
//        switch(view.getId()) {
//            case R.id.dieko_pp:
//                if (checked)
//                    string = getString(R.string.ppchoice);
//                break;
//
//            case R.id.dieko_dominos:
//                if (checked)
//                    string = getString(R.string.dominoschoice);
//                break;
//
//        case R.id.dieko_phut:
//                if (checked)
//                    string = getString(R.string.phutchoice);
//                break;
//        }
//        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
//
//}

    @Override
    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("EXIT");
        
        alertDialogBuilder
                .setMessage("Do you want to exit the app?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, id) -> {

                    Toast.makeText(getApplicationContext(), "Bye bye!",
                            Toast.LENGTH_LONG).show();
                    System.exit(2);
                })

                .setNegativeButton("No", (dialog, id) -> dialog.cancel());

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}