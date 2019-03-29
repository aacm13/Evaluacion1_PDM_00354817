package tech.visuallatam.labo4movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String user = intent.getStringExtra(MainActivity.EXTRA_USER);
        String mail = intent.getStringExtra(MainActivity.EXTRA_MAIL);
        int prod = intent.getIntExtra(MainActivity.EXTRA_PROD, 0);

        TextView USER = (TextView) findViewById(R.id.mail);
        TextView MAIL = (TextView) findViewById(R.id.user);
        TextView PROD = (TextView) findViewById(R.id.prod);

        USER.setText("User: " + user);
        MAIL.setText("Mail: " + mail);
        PROD.setText("# Productos: " + prod);
    }
}
