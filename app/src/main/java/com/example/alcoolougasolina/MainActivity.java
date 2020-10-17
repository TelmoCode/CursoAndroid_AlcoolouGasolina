package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText inputTextGasolina, inputTextAlcool;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextGasolina = findViewById(R.id.ipt_gasolina);
        inputTextAlcool = findViewById(R.id.ipt_alcool);
        textResultado = findViewById(R.id.txt_Resultado);
    }

    public void calc_preco(View view){

        String vAlcool = inputTextAlcool.getText().toString();
        String vGasolina = inputTextGasolina.getText().toString();

        Boolean mValidador =  validador(vAlcool, vGasolina);



        if (mValidador == true){

            double vAlcoolR = Double.parseDouble(vAlcool);
            double vGasolinaR = Double.parseDouble(vGasolina);

            double resultadoCalculo = vAlcoolR / vGasolinaR;
            if(resultadoCalculo >= 0.7){
                textResultado.setText("É melhor usar Gasolina");

            }else {
                textResultado.setText("É melhor usar Alcool");

            }
        }else {

            textResultado.setText("Por favou preencha todos os campos");

        }


    }

    public boolean validador(String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("")) {
            camposValidados = false;
        }

        return camposValidados;

    }
    /*
    public double calc(){

        return calc();

    }
     */


}