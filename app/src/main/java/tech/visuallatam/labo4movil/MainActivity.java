package tech.visuallatam.labo4movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_USER = "tech.visuallatam.labo4movil.EXTRA_USER";
    public static final String EXTRA_MAIL = "tech.visuallatam.labo4movil.EXTRA_MAIL";

    public int counterOne = 0;
    public int counterDos = 0;
    public int counterTres = 0;
    public int counterCuatro = 0;
    public int counterCinco = 0;
    public int counterSeis = 0;
    public int counterSiete = 0;
    public int counterOcho = 0;
    public int counterNueve = 0;

    private int TotalCounter= 0;

    TextView Uno;
    TextView Dos;
    TextView Tres;
    TextView Cuatro;
    TextView Cinco;
    TextView Seis;
    TextView Siete;
    TextView Ocho;
    TextView Nueve;

    TextView user;
    TextView email;

    Button send;

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

        send = (Button) findViewById(R.id.send);

        user = (TextView) findViewById(R.id.user);
        email = (TextView) findViewById(R.id.email);

        Uno.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterOne ++;
                Uno.setText("Producto1: " + Integer.toString(counterOne));
            }
        });

        Dos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterDos ++;
                Dos.setText("Producto2: " + Integer.toString(counterDos));
            }
        });
        Tres.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterTres ++;
                Tres.setText("Producto3: " + Integer.toString(counterTres));
            }
        });
        Cuatro.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterCuatro ++;
                Cuatro.setText("Producto4: " + Integer.toString(counterCuatro));
            }
        });
        Cinco.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterCinco ++;
                Cinco.setText("Producto5: " + Integer.toString(counterCinco));
            }
        });
        Seis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterSeis ++;
                Seis.setText("Producto6: " + Integer.toString(counterSeis));
            }
        });
        Siete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterSiete ++;
                Siete.setText("Producto7: " + Integer.toString(counterSiete));
            }
        });
        Ocho.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterOcho ++;
                Ocho.setText("Producto8: " + Integer.toString(counterOcho));
            }
        });
        Nueve.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                counterNueve ++;
                Nueve.setText("Producto9: " + Integer.toString(counterNueve));
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2(){
        EditText name = (EditText) findViewById(R.id.user);
        String User = name.getText().toString();

        EditText mail = (EditText) findViewById(R.id.email);
        String Mail = mail.getText().toString();




        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_USER, User);
        intent.putExtra(EXTRA_MAIL, Mail);
        startActivity(intent);
    }
}
