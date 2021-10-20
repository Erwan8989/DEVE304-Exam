package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button b1, b3;
    TextView textview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);

        b3 = (Button) findViewById(R.id.button3);

        textview = findViewById(R.id.label1);

        // ***************** Changement de couleur du bouton 1, 2 et 3 et avec changement de l'image au clic *****************


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Changement de couleur des boutons
                textview.setBackgroundColor(Color.RED);
            }
        });


        // ***************** Changement de page au clic *****************

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Appel à la fonction openActivity pour changer de page (activity2)
                openActivity2();
            }
        });
    }


    public void goToActivity2(View view){

        Log.e("DEVE0304", "MainActivity.goToActivity2()");




    };


    public void doSomePrinting(View view) {

        Log.e("DEVE0304", "MainActivity:doSomePrinting()");

        String[] list_of_languages = {"Java", "Python", "Php", "Ruby on Rail", "C++"};

        for (int idx = 0 ; idx < list_of_languages.length ; idx ++) // La sortie du tableau list_of_languages faisait planter l'application
            Log.e("DEVE0304", "" + idx + " : " + list_of_languages[idx]);

    }


    // ***************** Changement de page au clic *****************

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        String list = "";
        intent.putExtra("string_list", "list");
        startActivity(intent);
    }

}