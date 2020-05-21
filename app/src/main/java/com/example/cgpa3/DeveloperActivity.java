package com.example.cgpa3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.Toast;

public class DeveloperActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton emailbutton,whatsappbutton,facebookbutton;
    private WebView facebookview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("About Developer");

        emailbutton=findViewById(R.id.emailbuttonid);
        whatsappbutton=findViewById(R.id.whatsappbuttonid);
        facebookbutton=findViewById(R.id.facebookid);
        emailbutton.setOnClickListener(this);
        whatsappbutton.setOnClickListener(this);
        facebookbutton.setOnClickListener(this);



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.emailbuttonid){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"neamotnaim123@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Contact from app");
           startActivity(Intent.createChooser(intent,"Contact with"));
        }
        if (view.getId()==R.id.whatsappbuttonid){
            try {
//                Intent intent=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:"+"01553819490"));
//                intent.setPackage("com.whatsapp");
//                startActivity(intent);
                try {  String url="https://api.whatsapp.com/send?Phone="+"+88 01553819490";
                    PackageManager pm= getApplicationContext().getPackageManager();
                    pm.getPackageInfo("com.whatsapp",PackageManager.GET_ACTIVITIES);
                    Intent intent=new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);

                }catch (Exception e){
                    Toast.makeText(this,"Exception "+e,Toast.LENGTH_LONG).show();
                }

            }catch (Exception e){

            }

        }
        if (view.getId()==R.id.facebookid){
            Toast.makeText(this,"You clicked on share",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100011134933677"));
            if (intent.resolveActivity(getPackageManager())!=null){
                startActivity(Intent.createChooser(intent,"Browse with"));
            }

        }
    }
}