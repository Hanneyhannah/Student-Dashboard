package com.example.studentdashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inc = (TextView) findViewById(R.id.inc);
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String uname = username.getText().toString();
                String pword = password.getText().toString();
                if (uname.equals("Adeline") && pword.equals("P@$sw0rd")){
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    intent.putExtra("idnumber","20190181");
                    intent.putExtra("studname", "Niño, Hannah Dorothy B.");
                    intent.putExtra("studimg", R.drawable.hannah);
                    startActivity(intent);
                    finish();

                }else if(uname.equals("Galdgasm") && pword.equals("qj48ma1578")){
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    intent.putExtra("idnumber","20193699");
                    intent.putExtra("studname", "Angeles, John Regald A.");
                    intent.putExtra("studimg", R.drawable.john);
                    startActivity(intent);
                    finish();

                }else if(uname.equals("Milotic2001") && pword.equals("Milotic31")){
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    intent.putExtra("idnumber","20190206");
                    intent.putExtra("studname", "Marktirez, Mark Roland C.");
                    intent.putExtra("studimg", R.drawable.mark);
                    startActivity(intent);
                    finish();
                }else if(uname.equals("rlascop200") && pword.equals("rlaa30")){
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    intent.putExtra("idnumber","20194001");
                    intent.putExtra("studname", "Alvaro, Ruth Lacerna");
                    intent.putExtra("studimg", R.drawable.ruth);
                    startActivity(intent);//
                    finish();//
                }else{
                    username.setText("");
                    password.setText("");
                    inc.setVisibility(View.VISIBLE);

                }
            }});
    }
}