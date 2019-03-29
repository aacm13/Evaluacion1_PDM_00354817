package tech.visuallatam.labo4movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counterOne = 0;
    private int counterDos = 0;
    private int counterTres = 0;
    private int counterCuatro = 0;
    private int counterCinco = 0;
    private int counterSeis = 0;
    private int counterSiete = 0;
    private int counterOcho = 0;
    private int counterNueve = 0;

    TextView Uno;
    TextView Dos;
    TextView Tres;
    TextView Cuatro;
    TextView Cinco;
    TextView Seis;
    TextView Siete;
    TextView Ocho;
    TextView Nueve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uno = (TextView) findViewById(R.id.uno);
        Dos= (TextView) findViewById(R.id.dos);
        Tres= (TextView) findViewById(R.id.tres);
        Cuatro= (TextView) findViewById(R.id.cuatro);
        Cinco= (TextView) findViewById(R.id.cinco);
        Seis= (TextView) findViewById(R.id.seis);
        Siete= (TextView) findViewById(R.id.siete);
        Ocho= (TextView) findViewById(R.id.ocho);
        Nueve= (TextView) findViewById(R.id.nueve);

        Uno.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterOne ++;
                Uno.setText("Producto 1/n" + Integer.toString(counterOne));
            }
        });

        Dos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterDos ++;
                Dos.setText("Producto 1/n" + Integer.toString(counterDos));
            }
        });
        Tres.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterTres ++;
                Tres.setText("Producto 1/n" + Integer.toString(counterTres));
            }
        });
        Cuatro.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterCuatro ++;
                Cuatro.setText("Producto 1/n" + Integer.toString(counterCuatro));
            }
        });
        Cinco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterCinco ++;
                Cinco.setText("Producto 1/n" + Integer.toString(counterCinco));
            }
        });
        Seis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterSeis ++;
                Seis.setText("Producto 1/n" + Integer.toString(counterSeis));
            }
        });
        Siete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterSiete ++;
                Siete.setText("Producto 1/n" + Integer.toString(counterSiete));
            }
        });
        Ocho.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterOcho ++;
                Ocho.setText("Producto 1/n" + Integer.toString(counterOcho));
            }
        });
        Nueve.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterNueve ++;
                Nueve.setText("Producto 1/n" + Integer.toString(counterNueve));
            }
        });

    }
}
