package com.example.nesti_mes_recettes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy);
        final Button btnReturn = (Button)findViewById(R.id.retour);
        //Utilisation d'un écouteur d'évenement pour récupérer l'intéraction avec le bouton
        btnReturn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                EasyActivity.this.finish();

            }
    });

}
}


