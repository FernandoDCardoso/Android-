package com.example.ferna.tarifador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ferna.rateofcar.R;


public class MainActivity extends AppCompatActivity {

    private EditText etNumero1, etNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1 = (EditText) findViewById(R.id.edit);
        etNumero2 = (EditText) findViewById(R.id.editText2);
        final TextView ResultadoR = (TextView) findViewById(R.id.text_result);
        Button CalculaR = (Button) findViewById(R.id.buttonCalcular);

        CalculaR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double d1 = Double.parseDouble(etNumero1.getText().toString());
                Double r1 = Double.parseDouble(etNumero2.getText().toString());

                Double Result = d1 * r1;

                ResultadoR.setText("Resultado: R$ " + Result);

            }
        });

    }
}