package br.edu.fateczl.atv7contabancaria;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.atv7contabancaria.model.ContaBancaria;
import br.edu.fateczl.atv7contabancaria.model.ContaPoupanca;

public class MainActivity extends AppCompatActivity {

    List<ContaBancaria> lista = new ArrayList<>();
    private RadioButton rbPoupanca;
    private RadioButton rbEspecial;
    private EditText etCliente;
    private EditText etNumConta;
    private EditText etSaldo;
    private EditText etDiaRendimento;
    private EditText etTaxa;
    private EditText etLimite;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rbPoupanca = findViewById(R.id.rbPoupanca);
        rbPoupanca.setChecked(true);
        rbEspecial = findViewById(R.id.rbEspecial);
        etCliente = findViewById(R.id.etCliente);
        etNumConta = findViewById(R.id.etNumConta);
        etSaldo = findViewById(R.id.etSaldo);
        etDiaRendimento = findViewById(R.id.etDiaRendimento);
        etTaxa = findViewById(R.id.etTaxa);
        etLimite = findViewById(R.id.etLimite);
        tvRes = findViewById(R.id.tvRes);
        Button btnDepositar = findViewById(R.id.btnDepositar);
        btnDepositar.setOnClickListener(op -> depositar());
        Button btnSaque = findViewById(R.id.btnSaque);
        btnSaque.setOnClickListener(op -> saque());
    }

    private void depositar() {
        if (rbPoupanca.isChecked()){
            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contaPoupanca.setCliente(etCliente.getText().toString());
            contaPoupanca.setNum_conta(Integer.parseInt(etNumConta.getText().toString()));
            contaPoupanca.depositar(Float.parseFloat(etSaldo.getText().toString()));
            contaPoupanca.setDiaDeRendimento(Integer.parseInt(etDiaRendimento.getText().toString()));
            lista.add(contaPoupanca);
            String res = "O valor de R$" + etSaldo.getText().toString() + " foi depositado na conta de " + contaPoupanca.getCliente() + ". Novo saldo: R$" + contaPoupanca.getSaldo();
            tvRes.setText(res);
        }
    }

    private void saque() {
        float valorASacar = Float.parseFloat(etSaldo.getText().toString());
        if(rbPoupanca.isChecked()){
            ContaBancaria contaPoupanca = new ContaPoupanca();

        }
    }
}