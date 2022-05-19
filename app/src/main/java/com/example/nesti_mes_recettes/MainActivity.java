package com.example.nesti_mes_recettes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnEasy = (Button)findViewById(R.id.easyBtn);
        //Utilisation d'un écouteur d'évenement pour récupérer l'intéraction avec le bouton
        btnEasy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Facile à fire");
                alertDialog.setMessage("Voulez vous choisir une recette facile à faire?");
                alertDialog.setPositiveButton("oui", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //Lance l'activité qui affiche la fenetre Easy
                        Intent intent = new Intent(MainActivity.this, EasyActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), btnEasy.getText(), Toast.LENGTH_SHORT).show();
                    }

                });
                alertDialog.setNegativeButton("non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                alertDialog.show();


                //Affiche un message
                Toast toast = Toast.makeText(getApplicationContext(), btnEasy.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }

        });
        final Button btnGluten = (Button)findViewById(R.id.glutenBtn);
        //Utilisation d'un écouteur d'évenement pour récupérer l'intéraction avec le bouton
        btnGluten.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Sans gluten");
                alertDialog.setMessage("Voulez vous choisir une recette Sans gluten?");
                alertDialog.setPositiveButton("oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //Lance l'activité qui affiche la fenetre Easy
                        Intent intent = new Intent(MainActivity.this, GlutenActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), btnGluten.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                alertDialog.show();
                //Affiche un message
                Toast toast = Toast.makeText(getApplicationContext(), btnGluten.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button btnSaison = (Button)findViewById(R.id.SaisonBtn);
        //Utilisation d'un écouteur d'évenement pour récupérer l'intéraction avec le bouton
        btnSaison.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("C'est de saison");
                alertDialog.setMessage("Voulez vous choisir une recette C'est de saison?");
                alertDialog.setPositiveButton("oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //Lance l'activité qui affiche la fenetre Easy
                        Intent intent = new Intent(MainActivity.this, SassionActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), btnSaison.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setNegativeButton("non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                alertDialog.show();
                //Affiche un message
                Toast toast = Toast.makeText(getApplicationContext(), btnSaison.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button btnTraditionel = (Button)findViewById(R.id.TraditonBtn);
        //Utilisation d'un écouteur d'évenement pour récupérer l'intéraction avec le bouton
        btnTraditionel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Traditionelles");
                alertDialog.setMessage("Voulez vous choisir une recette Traditionelles?");
                alertDialog.setPositiveButton("oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), btnTraditionel.getText(), Toast.LENGTH_SHORT).show();
                        //Lance l'activité qui affiche la fenetre Easy
                        Intent intent = new Intent(MainActivity.this, TraditionelActivity.class);
                        startActivity(intent);
                    }
                });
                alertDialog.setNegativeButton("non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
                alertDialog.show();
                //Affiche un message
                Toast toast = Toast.makeText(getApplicationContext(), btnTraditionel.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    /**
     * Gestion ouverture/fermeture du menu général
     * @param pMenu Menu
     * @return boolean ture
     */
    @Override
    public boolean onCreateOptionsMenu(Menu pMenu){
        MenuInflater inflater = this.getMenuInflater();
        inflater.inflate(R.menu.menugeneral, pMenu);
        return true;
    }
    /**
     * Lance une action en fonction de l'élément du menu selectionné
     * @param pItem MenuItem
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem pItem){
        switch (pItem.getItemId()){
            case R.id.menu_search:
                Toast t = Toast.makeText(this, "Menu : Recherche", Toast.LENGTH_SHORT);
                t.show();

                //  Log.i( "LogNesti",  "Menu : Recherche");
                break;
            case R.id.menu_list:
                Toast l = Toast.makeText(this, "Menu : Liste de course", Toast.LENGTH_LONG);
                l.show();

                //Log.i( "LogNesti",  "Menu: Liste de course");
                break;

        }
        return true;
    }

}