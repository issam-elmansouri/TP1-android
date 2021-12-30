package com.example.coursandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button BtnBienvenue, BtnEtat, BtnFiliere;
    private EditText nom, prenom, age, message;
    private RadioButton master, ci, cp;
    private CheckBox maried;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnBienvenue = (Button) findViewById(R.id.BtnBienvenue);
        BtnEtat = (Button) findViewById(R.id.BtnEtat);
        BtnFiliere = (Button) findViewById(R.id.BtnFiliere);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        age = (EditText) findViewById(R.id.age);
        message = (EditText) findViewById(R.id.message);
        master = (RadioButton) findViewById(R.id.master);
        ci = (RadioButton) findViewById(R.id.ci);
        cp = (RadioButton) findViewById(R.id.cp);
        maried = (CheckBox) findViewById(R.id.maried);
        BtnBienvenue.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!nom.getText().toString().matches("")
                            && !prenom.getText().toString().matches("")
                            && !age.getText().toString().matches("")
                        ){
                            //Toast.makeText(MainActivity.this, "Bonjour "+nom.getText().toString()+" "+prenom.getText().toString()+" , vous avez "+age.getText().toString(), Toast.LENGTH_LONG).show();
                            message.setText("Bonjour "+nom.getText().toString()+" "+prenom.getText().toString()+" , vous avez "+age.getText().toString());
                        }else{
                            Toast.makeText(MainActivity.this, "vous devez remplire tous les champs", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
        BtnFiliere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (master.isChecked()){
                    Toast.makeText(MainActivity.this, "Vous êtes en Master",
                            Toast.LENGTH_LONG).show();
                }else if(ci.isChecked()){
                    Toast.makeText(MainActivity.this, "Vous êtes en cycle d'ingénieur",
                            Toast.LENGTH_LONG).show();
                }else if(cp.isChecked()){
                    Toast.makeText(MainActivity.this, "Vous êtes en cycle préparatoire",
                            Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "vous devez slectioner une filière",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        BtnEtat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (maried.isChecked()){
                    Toast.makeText(MainActivity.this, "Vous êtes Marié",
                            Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(MainActivity.this, "Vous êtes Célibataire",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}