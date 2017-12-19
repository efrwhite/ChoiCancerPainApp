package com.example.elizabethwhitebaker.choipainapp17032017;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HistoryA1 extends AppCompatActivity {
    EditText fNameTxt;
    EditText lNameTxt;

    EditText Ethnicity;
    RadioGroup rg1;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_a1);


        fNameTxt = (EditText) findViewById(R.id.editText);
        lNameTxt = (EditText) findViewById(R.id.editText2);
        Ethnicity = (EditText) findViewById(R.id.editText5);


        rg1 = (RadioGroup) findViewById(R.id.RG1);




        Button previousButton = (Button) findViewById(R.id.prevButtonHA1);
        Button nextButton = (Button) findViewById(R.id.nextButtonHA1);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Calendar c = Calendar.getInstance();
                //int Year, month, day;

                StartPage.fName = String.valueOf(fNameTxt.getText());
                StartPage.lName = String.valueOf(lNameTxt.getText());









                StartPage.ethnicity = Ethnicity.getText().toString();

                Intent intent = new Intent(HistoryA1.this, HistoryA1_1.class);
                startActivity(intent);
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryA1.this, StartPage.class);
                startActivity(intent);
            }
        });




    }

    public void rbgender(View v) {
        int radioButtonId = rg1.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radioButtonId);
        StartPage.gender = rb.getText().toString();
        Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_SHORT).show();
    }

}
