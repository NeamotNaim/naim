package com.example.cgpa3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class CalculateActivity extends AppCompatActivity implements View.OnClickListener {
    private int time=1;
    private int shift = 2;
    private Button addcourse, reset, calculate;
    private LinearLayout linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13;
    private EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13;
    private Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10, spinner11, spinner12, spinner13;
    String spin[] = {"Select Gpa", "4.00", "3.75", "3.50", "3.25", "3.00", "2.75", "2.50", "2.25", "2.00", "0.00"};
   double cgpa1,cgpa2,cgpa3,cgpa4,cgpa5,cgpa6,cgpa7,cgpa8,cgpa9,cgpa10,cgpa11,cgpa12,cgpa13;
  private double total_credit1,total_credit2,total_credit3,total_credit4,total_credit5,total_credit6,total_credit7,total_credit8,total_credit9,total_credit10,total_credit11,total_credit12,total_credit13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        //fatching back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
/////difining all spinner
        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner1.setAdapter(adapter1);

        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner2.setAdapter(adapter2);

        spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner3.setAdapter(adapter3);

        spinner4 = findViewById(R.id.spinner4);
        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner4.setAdapter(adapter4);


        spinner5 = findViewById(R.id.spinner5);
        ArrayAdapter adapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner5.setAdapter(adapter5);

        spinner6 = findViewById(R.id.spinner6);
        ArrayAdapter adapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner6.setAdapter(adapter6);

        spinner7 = findViewById(R.id.spinner7);
        ArrayAdapter adapter7 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner7.setAdapter(adapter7);

        spinner8 = findViewById(R.id.spinner8);
        ArrayAdapter adapter8 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner8.setAdapter(adapter8);

        spinner9 = findViewById(R.id.spinner9);
        ArrayAdapter adapter9 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner9.setAdapter(adapter9);


        spinner10 = findViewById(R.id.spinner10);
        ArrayAdapter adapter10 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner10.setAdapter(adapter10);

        spinner11 = findViewById(R.id.spinner11);
        ArrayAdapter adapter11 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner11.setAdapter(adapter11);

        spinner12 = findViewById(R.id.spinner12);
        ArrayAdapter adapter12 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner12.setAdapter(adapter12);

        spinner13 = findViewById(R.id.spinner13);
        ArrayAdapter adapter13 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spin);
        spinner13.setAdapter(adapter13);


        ///////
        linearLayout1 = findViewById(R.id.linear1);
        linearLayout2 = findViewById(R.id.linear2);
        linearLayout3 = findViewById(R.id.linear3);
        linearLayout4 = findViewById(R.id.linear4);
        linearLayout4 = findViewById(R.id.linear4);
        linearLayout5 = findViewById(R.id.linear5);
        linearLayout6 = findViewById(R.id.linear6);
        linearLayout7 = findViewById(R.id.linear7);
        linearLayout8 = findViewById(R.id.linear8);
        linearLayout9 = findViewById(R.id.linear9);
        linearLayout10 = findViewById(R.id.linear10);
        linearLayout11 = findViewById(R.id.linear11);
        linearLayout12 = findViewById(R.id.linear12);
        linearLayout13 = findViewById(R.id.linear13);
        ////
        editText1 = findViewById(R.id.credit1);
        editText2 = findViewById(R.id.credit2);
        editText3 = findViewById(R.id.credit3);
        editText4 = findViewById(R.id.credit4);
        editText5 = findViewById(R.id.credit5);
        editText6 = findViewById(R.id.credit6);
        editText7 = findViewById(R.id.credit7);
        editText8 = findViewById(R.id.credit8);
        editText9 = findViewById(R.id.credit9);
        editText10 = findViewById(R.id.credit10);
        editText11 = findViewById(R.id.credit11);
        editText12 = findViewById(R.id.credit12);
        editText13 = findViewById(R.id.credit13);


/////
        reset = findViewById(R.id.resetbuttonid);
        addcourse = findViewById(R.id.addcoursebuttonid);
        calculate = findViewById(R.id.calculatebuttonid);

        reset.setOnClickListener(this);
        addcourse.setOnClickListener(this);
        calculate.setOnClickListener(this);
        /////


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
//        if (time==1)
//        {
//            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//            startActivity(intent);
//            finish();
//            time++;
//        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.resetbuttonid) {
            Intent intent = new Intent(getApplicationContext(), CalculateActivity.class);
            startActivity(intent);
            finish();
        }
        if (view.getId() == R.id.addcoursebuttonid) {
            shift++;


            switch (shift) {
                case 3:
                    linearLayout3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    linearLayout4.setVisibility(View.VISIBLE);
                    break;
                case 5:
                    linearLayout5.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    linearLayout6.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    linearLayout7.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    linearLayout8.setVisibility(View.VISIBLE);
                    break;
                case 9:
                    linearLayout9.setVisibility(View.VISIBLE);
                    break;
                case 10:
                    linearLayout10.setVisibility(View.VISIBLE);
                    break;
                case 11:
                    linearLayout11.setVisibility(View.VISIBLE);
                    break;
                case 12:
                    linearLayout12.setVisibility(View.VISIBLE);
                    break;
                case 13:
                    linearLayout13.setVisibility(View.VISIBLE);
                    break;
                default:
                    Toast.makeText(this, "Maximum Number of Course", Toast.LENGTH_LONG).show();

            }


        }
        if (view.getId() == R.id.calculatebuttonid) {
            //gettting credit and gpa
            //calculate cgpa ,total credit
            try {
                double mul1 = 1;

                String credit_string1 = editText1.getText().toString();
                double credit1 = Double.parseDouble(credit_string1);

                String gpa_string1 = spinner1.getSelectedItem().toString();
                double gpa1 = Double.parseDouble(gpa_string1);

                mul1 = credit1 * gpa1;


                //linear2
                double mul2 = 1;

                String credit_string2 = editText2.getText().toString();
                double credit2 = Double.parseDouble(credit_string2);

                String gpa_string2 = spinner2.getSelectedItem().toString();
                double gpa2 = Double.parseDouble(gpa_string2);

                mul2 = credit2 * gpa2;

                 total_credit2 = (credit1 + credit2);
                 cgpa2 = (mul1 + mul2) / total_credit2;
              // Toast.makeText(this, "cgpa" + cgpa2, Toast.LENGTH_LONG).show();


                ///linear3

                double mul3 = 1;

                String credit_string3 = editText3.getText().toString();
                double credit3 = Double.parseDouble(credit_string3);

                String gpa_string3 = spinner3.getSelectedItem().toString();
                double gpa3 = Double.parseDouble(gpa_string3);

                mul3 = credit3 * gpa3;


                 total_credit3 = (credit1 + credit2 + credit3);
                double cgpa3 = (mul1 + mul2 + mul3) / total_credit3;
                //Toast.makeText(this, "cgpa" + cgpa3, Toast.LENGTH_LONG).show();


                //linear4
                double mul4 = 1;

                String credit_string4 = editText4.getText().toString();
                double credit4 = Double.parseDouble(credit_string4);

                String gpa_string4 = spinner4.getSelectedItem().toString();
                double gpa4 = Double.parseDouble(gpa_string4);

                mul4 = credit4 * gpa4;

                  total_credit4 = (credit1 + credit2 + credit3 + credit4);
                  cgpa4 = (mul1 + mul2 + mul3 + mul4) / total_credit4;
               // Toast.makeText(this, "cgpa" + cgpa4, Toast.LENGTH_LONG).show();


                //linear5
                double mul5 = 1;

                String credit_string5 = editText5.getText().toString();
                double credit5 = Double.parseDouble(credit_string5);

                String gpa_string5 = spinner5.getSelectedItem().toString();
                double gpa5 = Double.parseDouble(gpa_string5);

                mul5 = credit5 * gpa5;

                  total_credit5 = (credit1 + credit2 + credit3 + credit4 + credit5);
                  cgpa5 = (mul1 + mul2 + mul3 + mul4 + mul5) / total_credit5;
                //Toast.makeText(this, "cgpa" + cgpa5, Toast.LENGTH_LONG).show();


                //linear6
                double mul6 = 1;

                String credit_string6 = editText6.getText().toString();
                double credit6 = Double.parseDouble(credit_string6);

                String gpa_string6 = spinner6.getSelectedItem().toString();
                double gpa6 = Double.parseDouble(gpa_string6);

                mul6 = credit6 * gpa6;

                  total_credit6 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6);
                  cgpa6 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6) / total_credit6;
                //Toast.makeText(this, "cgpa" + cgpa6, Toast.LENGTH_LONG).show();

                //linear7
                double mul7 = 1;

                String credit_string7 = editText7.getText().toString();
                double credit7 = Double.parseDouble(credit_string7);

                String gpa_string7 = spinner7.getSelectedItem().toString();
                double gpa7 = Double.parseDouble(gpa_string7);

                mul7 = credit7 * gpa7;


                  total_credit7 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7);
                  cgpa7 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7) / total_credit7;
               // Toast.makeText(this, "cgpa" + cgpa7, Toast.LENGTH_LONG).show();


                //linear8
                double mul8 = 1;

                String credit_string8 = editText8.getText().toString();
                double credit8 = Double.parseDouble(credit_string8);

                String gpa_string8 = spinner8.getSelectedItem().toString();
                double gpa8 = Double.parseDouble(gpa_string8);

                mul8 = credit8 * gpa8;


                  total_credit8 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8);
                  cgpa8 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8) / total_credit8;
               // Toast.makeText(this, "cgpa" + cgpa8, Toast.LENGTH_LONG).show();


                //linear
                double mul9 = 1;

                String credit_string9 = editText9.getText().toString();
                double credit9 = Double.parseDouble(credit_string9);

                String gpa_string9 = spinner9.getSelectedItem().toString();
                double gpa9 = Double.parseDouble(gpa_string9);

                mul9 = credit9 * gpa9;


                  total_credit9 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9);
                  cgpa9 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8 + mul9) / total_credit9;
                //Toast.makeText(this, "cgpa" + cgpa9, Toast.LENGTH_LONG).show();

                //linear
                double mul10 = 1;

                String credit_string10 = editText10.getText().toString();
                double credit10 = Double.parseDouble(credit_string10);

                String gpa_string10 = spinner10.getSelectedItem().toString();
                double gpa10 = Double.parseDouble(gpa_string10);

                mul10 = credit10 * gpa10;


                  total_credit10 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10);
                  cgpa10 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8 + mul9 + mul10) / total_credit10;
                //Toast.makeText(this, "cgpa" + cgpa10, Toast.LENGTH_LONG).show();


                //linear11
                double mul11 = 1;

                String credit_string11 = editText11.getText().toString();
                double credit11 = Double.parseDouble(credit_string11);

                String gpa_string11 = spinner11.getSelectedItem().toString();
                double gpa11 = Double.parseDouble(gpa_string11);

                mul11 = credit11 * gpa11;


                  total_credit11 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11);
                  cgpa11 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8 + mul9 + mul10 + mul11) / total_credit11;
                //Toast.makeText(this, "cgpa" + cgpa11, Toast.LENGTH_LONG).show();

                //linear12
                double mul12 = 1;

                String credit_string12 = editText12.getText().toString();
                double credit12 = Double.parseDouble(credit_string12);

                String gpa_string12 = spinner12.getSelectedItem().toString();
                double gpa12 = Double.parseDouble(gpa_string12);

                mul12 = credit12 * gpa12;
                  total_credit12 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11 + mul12);
                  cgpa12 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8 + mul9 + mul10 + mul11 + mul12) / total_credit12;
                //Toast.makeText(this, "cgpa" + cgpa12, Toast.LENGTH_LONG).show();


                //linear
                double mul13 = 1;

                String credit_string13 = editText13.getText().toString();
                double credit13 = Double.parseDouble(credit_string13);

                String gpa_string13 = spinner13.getSelectedItem().toString();
                double gpa13 = Double.parseDouble(gpa_string13);

                mul13 = credit13 * gpa13;
                  total_credit13 = (credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11 + mul12 + mul13);
                 cgpa13 = (mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8 + mul9 + mul10 + mul11 + mul12 + mul13) / total_credit13;
                //Toast.makeText(this, "cgpa" + cgpa13, Toast.LENGTH_LONG).show();




                } catch(Exception e){

                }
            //////show result cgpa and total credit and course
            switch (shift) {
                case 2: {


                    String str=String.valueOf(cgpa2);
                    String str2=String.valueOf(total_credit2);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 3: {


                    String str=String.valueOf(cgpa3);
                    String str2=String.valueOf(total_credit3);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 4: {


                    String str=String.valueOf(cgpa4);
                    String str2=String.valueOf(total_credit4);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 5: {


                    String str=String.valueOf(cgpa5);
                    String str2=String.valueOf(total_credit5);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 6: {


                    String str=String.valueOf(cgpa6);
                    String str2=String.valueOf(total_credit6);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 7: {


                    String str=String.valueOf(cgpa7);
                    String str2=String.valueOf(total_credit7);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 8: {


                    String str=String.valueOf(cgpa8);
                    String str2=String.valueOf(total_credit8);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 9: {


                    String str=String.valueOf(cgpa9);
                    String str2=String.valueOf(total_credit9);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 10: {


                    String str=String.valueOf(cgpa10);
                    String str2=String.valueOf(total_credit10);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 11: {


                    String str=String.valueOf(cgpa11);
                    String str2=String.valueOf(total_credit11);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 12: {


                    String str=String.valueOf(cgpa12);
                    String str2=String.valueOf(total_credit12);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                case 13: {


                    String str=String.valueOf(cgpa13);
                    String str2=String.valueOf(total_credit13);

                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("CGPA: "+str);
                    alert.setMessage("Total Course: "+shift+"\n"+"Total Credit: "+str2);

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();
                    break;
                }
                default:
                {
                    String str="Please fill all requirement currectly";
                    AlertDialog.Builder alert = new AlertDialog.Builder(this);
                    alert.setTitle("something wrong");
                    alert.setMessage(str);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog=alert.create();
                    alertDialog.show();

                  Toast.makeText(this,"Something went wrong",Toast.LENGTH_LONG).show();
                    break;
                }



            }

        }






        }//onclickend





}//class end

