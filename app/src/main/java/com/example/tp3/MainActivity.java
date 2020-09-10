package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_euros, et_dolares, etcambio;
    Button bt;
    RadioButton rbEuro, rbDolar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal1);
        et_dolares =  findViewById(R.id.etdolar);
        et_euros =  findViewById(R.id.eteuro);
        bt =  findViewById(R.id.btnconbertir);
        etcambio =  findViewById(R.id.etcambio);
        rbEuro =  findViewById(R.id.rbeuro);
        rbDolar =  findViewById(R.id.rbdolar);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!rbEuro.isChecked()) {


                    String textoEuro = et_euros.getText().toString();//crea una variable y le da el valor de et_euro en string
                    Double euros = Double.parseDouble(textoEuro);//esa varible de string la pasa a double
                    Double dolares = euros * 1.18;//multiplica ese double por el valor a dolar
                    String textoDolares = String.valueOf(dolares);//coloca ese valor dolar en una variable
                    etcambio.setText(textoDolares);//se lo doy al etcambio
                }
                else {

                        String textoDolar = et_dolares.getText().toString();//crea una variable y le da el valor de et_euro en string
                        Double dolar = Double.parseDouble(textoDolar);//esa varible de string la pasa a double
                        Double euros = dolar * 0.85;//multiplica ese double por el valor a dolar
                        String textoEuros = String.valueOf(euros);//coloca ese valor dolar en una variable
                        etcambio.setText(textoEuros);//se lo doy al etcambio

                }

            }
        });
    }
}









