package br.ulbra.appcompras;

import static javax.net.ssl.SSLEngineResult.Status.OK;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
        Button btTotal;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            chkarroz = findViewById(R.id.chkArroz);
            chkleite = (CheckBox) findViewById(R.id.chkLeite);
            chkcarne = (CheckBox) findViewById(R.id.chkCarne);
            chkfeijao = (CheckBox) findViewById(R.id.chkFeijao);
            Button btTotal = (Button) findViewById(R.id.btnTotal);
            btTotal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    double total = 0;
                    if (chkarroz.isChecked()) {
                        total += 2.69;
                    }
                    if (chkleite.isChecked()) {
                        total += 5.00;
                    }
                    if (chkcarne.isChecked()) {
                        total += 9.7;
                    }
                    if (chkfeijao.isChecked()) {
                        total += 2.30;
                    }
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Aviso");
                    dialogo.setMessage("Valor total da compra :" + String.valueOf(total));
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }
            });
        }
    }