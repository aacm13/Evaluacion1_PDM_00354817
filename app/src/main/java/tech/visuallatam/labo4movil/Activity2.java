package tech.visuallatam.labo4movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String user = intent.getStringExtra(MainActivity.EXTRA_USER);
        String mail = intent.getStringExtra(MainActivity.EXTRA_MAIL);
        String products = intent.getStringExtra(MainActivity.EXTRA_PROD);

        char[] p = products.toCharArray();
        int pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9;
        pd1 = Integer.parseInt(String.valueOf(p[0]));
        pd2 = Integer.parseInt(String.valueOf(p[1]));
        pd3 = Integer.parseInt(String.valueOf(p[2]));
        pd4 = Integer.parseInt(String.valueOf(p[3]));
        pd5 = Integer.parseInt(String.valueOf(p[4]));
        pd6 = Integer.parseInt(String.valueOf(p[5]));
        pd7 = Integer.parseInt(String.valueOf(p[6]));
        pd8 = Integer.parseInt(String.valueOf(p[7]));
        pd9 = Integer.parseInt(String.valueOf(p[8]));

        Uno = (TextView) findViewById(R.id.uno);
        Dos= (TextView) findViewById(R.id.dos);
        Tres= (TextView) findViewById(R.id.tres);
        Cuatro= (TextView) findViewById(R.id.cuatro);
        Cinco= (TextView) findViewById(R.id.cinco);
        Seis= (TextView) findViewById(R.id.seis);
        Siete= (TextView) findViewById(R.id.siete);
        Ocho= (TextView) findViewById(R.id.ocho);
        Nueve= (TextView) findViewById(R.id.nueve);

        Uno.setText("Producto1: "+pd1);
        Dos.setText("Producto2: "+pd2);
        Tres.setText("Producto3: "+pd3);
        Cuatro.setText("Producto4: "+pd4);
        Cinco.setText("Producto5: "+pd5);
        Seis.setText("Producto6: "+pd6);
        Siete.setText("Producto7: "+pd7);
        Ocho.setText("Producto8: "+pd8);
        Nueve.setText("Producto9: "+pd9);

        int prod = pd1+ pd2+ pd3+ pd4+ pd5+ pd6+ pd7+ pd8+ pd9;
        TextView USER = (TextView) findViewById(R.id.mail);
        TextView MAIL = (TextView) findViewById(R.id.user);
        TextView PROD = (TextView) findViewById(R.id.prod);

        USER.setText("User: " + user);
        MAIL.setText("Mail: " + mail);
        PROD.setText("# Productos: " + prod);
    }
}
