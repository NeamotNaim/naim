package com.example.cgpa3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {
private TextView name,feedbacktext;
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       name= findViewById(R.id.feedbackernameid);
        feedbacktext=findViewById(R.id.feedbackertextid);
        send=findViewById(R.id.feedbacksendbuttonid);
        send.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            String feedbackername=name.getText().toString();
            String feedbackertext=feedbacktext.getText().toString();
            if (view.getId()==R.id.feedbacksendbuttonid){
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"neamotnaim123@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback fro app");
                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+feedbackername+"\n"+"Message: "
                        +feedbackertext);
                startActivity(Intent.createChooser(intent,"Share with"));
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Exception "+e,Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
