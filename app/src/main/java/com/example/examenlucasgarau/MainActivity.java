package com.example.examenlucasgarau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Double numero1=0.0;
    private Double numero2=0.0;
    private String resultado;
    private EditText opr1;
    private EditText opr2;
    private TextView text;
    private double memoria;
    private double total;
    private RadioButton even;
    private RadioButton odd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        opr1 = (EditText) findViewById(R.id.numero1);
        opr2 = (EditText) findViewById(R.id.numero2);
        even = (RadioButton)findViewById(R.id.Even);
        odd = (RadioButton)findViewById(R.id.odd);
        text.setText("0.0");
        opr1.setText("0");
        opr2.setText("0");
        resultado="0";
        numero1=0.0;
        total=0.0;
        numero2=0.0;
        memoria=0.0;
        resultado="0";

    }


//Primera parte metodos memoria

    public void sumar2(View view) {
        try {
            numero1 = Double.parseDouble(opr1.getText().toString());
            numero2 = Double.parseDouble(opr2.getText().toString());
            resultado = String.valueOf(calculator.sumar(numero1, numero2));
        }catch(NumberFormatException e){
            resultado="numeros no validos";
        }
        Comprobarparimpar(view);
        text.setText(resultado);

    }

    public void restar2(View view) {
        try {
            numero1 = Double.parseDouble(opr1.getText().toString());
            numero2 = Double.parseDouble(opr2.getText().toString());
            resultado = String.valueOf(calculator.restar(numero1, numero2));
        }catch(NumberFormatException e){
            resultado="numeros no validos";
        }
        Comprobarparimpar(view);
        text.setText(resultado);

    }

    public void dividir2(View view) {
        try {
            numero1 = Double.parseDouble(opr1.getText().toString());
            numero2 = Double.parseDouble(opr2.getText().toString());
            resultado = String.valueOf(calculator.dividir(numero1, numero2));

        }catch(NumberFormatException e){
            resultado="numeros no validos";
        }
        Comprobarparimpar(view);
        text.setText(resultado);

    }

    public void multiplicar2(View view) {
        try {
            numero1 = Double.parseDouble(opr1.getText().toString());
            numero2 = Double.parseDouble(opr2.getText().toString());
            resultado = String.valueOf(calculator.multiplicar(numero1, numero2));
        }catch(NumberFormatException e){
            resultado="numeros no validos";
        }
        Comprobarparimpar(view);
        text.setText(resultado);

    }

    public void Comprobarparimpar(View view){
        if(total%2 == 0) {even.setChecked(true); odd.setChecked(false);}
        else {even.setChecked(false); odd.setChecked(true);}

    }

//Segunda parte metodos memoria
    public void memoriamc(View view){
        memoria=0;
    }
    public void memoriaplus(View view){
        memoria=calculator.sumar(total,memoria);
    }
    public void memoriaminus(View view){
        memoria=calculator.restar(total,memoria);
    }
    public void memoriamr(View view){
        text.setText(String.valueOf(memoria));

    }


}
