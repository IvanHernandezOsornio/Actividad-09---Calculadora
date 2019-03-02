package com.example.calculadora01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    private float numero1;
    private float numero2;
    private float resultado_operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText) findViewById(R.id.et_resultado1);
        valor2 = (EditText) findViewById(R.id.et_resultado2);
        resultado = (TextView) findViewById(R.id.tv_resultado);
    }

    public void suma(View view) {
        if (valor1 != null && valor2 != null)
            numero1 = Float.parseFloat(String.valueOf(valor1.getText()));
            numero2 = Float.parseFloat(String.valueOf(valor2.getText()));
            resultado_operacion = numero1 + numero2;
            resultado.setText(Float.toString(resultado_operacion));
    }

    public void resta(View view) {
        if (valor1 != null && valor2 != null)
            numero1 = Float.parseFloat(String.valueOf(valor1.getText()));
            numero2 = Float.parseFloat(String.valueOf(valor2.getText()));
            resultado_operacion = numero1 - numero2;
            resultado.setText(Float.toString(resultado_operacion));
    }

    public void multiplicacion(View view) {
        if (valor1 != null && valor2 != null)
            numero1 = Float.parseFloat(String.valueOf(valor1.getText()));
            numero2 = Float.parseFloat(String.valueOf(valor2.getText()));
            resultado_operacion = numero1 * numero2;
            resultado.setText(Float.toString(resultado_operacion));
    }

    public void division(View view) {
        if (valor1 != null && valor2 != null)
            numero1 = Float.parseFloat(String.valueOf(valor1.getText()));
            numero2 = Float.parseFloat(String.valueOf(valor2.getText()));
            resultado_operacion = numero1 / numero2;
            resultado.setText(Float.toString(resultado_operacion));
    }

    public void modulo(View view) {
        if (valor1 != null && valor2 != null)
            numero1 = Float.parseFloat(String.valueOf(valor1.getText()));
            numero2 = Float.parseFloat(String.valueOf(valor2.getText()));
            resultado_operacion = numero1 % numero2;
            resultado.setText(Float.toString(resultado_operacion));
    }

}
