package com.example.studentdashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button logout = (Button) findViewById(R.id.logout);
        ImageView profileimg = (ImageView) findViewById(R.id.profileimg);
        TextView name = (TextView) findViewById(R.id.name);
        TextView idno = (TextView) findViewById(R.id.idno);

        Bundle profileimg_getter = getIntent().getExtras();
        if (profileimg_getter!=null){
            int set_profileimg = profileimg_getter.getInt("studimg");
            profileimg.setImageResource(set_profileimg);
        }
        String name_getter = getIntent().getExtras().getString("studname");
        String idno_getter = getIntent().getExtras().getString("idnumber");
        name.setText(name_getter);
        idno.setText(idno_getter);

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Dashboard.this,MainActivity.class); //RETURN TO MAIN (LOGOUT)
                startActivity(intent);
                finish();
            }
        });
    }
}