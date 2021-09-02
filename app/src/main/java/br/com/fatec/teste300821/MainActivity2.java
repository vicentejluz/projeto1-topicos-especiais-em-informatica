package br.com.fatec.teste300821;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText txtN1, txtN2;
    private TextView txtResultado;
    private double N1, N2, soma = 0;
    private Button btnBUTTON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtN1 = (EditText) findViewById(R.id.txtN1);
        txtN2 = (EditText) findViewById(R.id.txtN2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnBUTTON = (Button) findViewById(R.id.btnBUTTON);

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void somar(View view) {
        String sN1 = txtN1.getText().toString().trim();
        String sN2 = txtN2.getText().toString().trim();
        if (TextUtils.isEmpty(sN1))
            N1 = 0;
        else
            N1 = Double.parseDouble(txtN1.getText().toString());
        if (TextUtils.isEmpty(sN2))
            N2 = 0;
        else
            N2 = Double.parseDouble(txtN2.getText().toString());
        soma = N1 + N2;
        String.valueOf(soma);
        txtResultado.setText(String.valueOf(soma));
    }

}