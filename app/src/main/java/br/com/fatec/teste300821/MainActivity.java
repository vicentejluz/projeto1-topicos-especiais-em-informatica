package br.com.fatec.teste300821;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtEmail, txtSenha;
    private String meuEmail = "admin@admin.com";
    private String minhaSenha = "admin";
    private String email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Button btnLogin =  (Button) findViewById(R.id.btnLogin);
        Button btnSign = (Button) findViewById(R.id.btnSign);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        txtEmail= (EditText) findViewById(R.id.txtEmail);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        email = txtEmail.getText().toString();
        senha= txtSenha.getText().toString();
        if(email.isEmpty() || senha.isEmpty()) {
            Toast toast = Toast.makeText(MainActivity.this, ((Button)view ).getText()+
                    "  ERRO - Preencha todos os campos " ,Toast.LENGTH_LONG);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GRAY);
            toast.show();
        }
        else if((email.equals(meuEmail)) && (senha.equals(minhaSenha))) {
            Intent intentExplicita = new Intent(this, MainActivity2.class);
            intentExplicita.putExtra("E-mail", email);
            intentExplicita.putExtra("Senha", senha);
            startActivity(intentExplicita);
        }
        else {
            Toast toast = Toast.makeText(MainActivity.this, ((Button) view).getText() +
                    "  ERRO - E-mail ou senha inválida ", Toast.LENGTH_LONG);
            View toastView = toast.getView();
            toastView.setBackgroundColor(Color.GRAY);
            toast.show();

            txtEmail.getText().clear();
            txtSenha.getText().clear();
            txtEmail.requestFocus();
        }
    }

    public void telaSomar(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}