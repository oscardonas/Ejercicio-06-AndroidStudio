package com.generaldeequipos.tareaejemplo06;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvIn1;
    private TextView tvIn2;
    private TextView tvOut1;
    private TextView tvOut2;
    private Button buttonIn;
    private Button buttonOut;
    private int iIn = 0;
    private int iOut = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIn1 = (TextView) findViewById(R.id.ConteoIn);
        tvIn2 = (TextView) findViewById(R.id.RotuloInside);
        buttonIn = (Button) findViewById(R.id.AnadirPersonaIn);

        tvOut1 = (TextView) findViewById(R.id.ConteoOut);
        tvOut2 = (TextView) findViewById(R.id.RotuloOutside);
        buttonOut = (Button) findViewById(R.id.AnadirPersonaOut);

        // chequear el savedInstanceState

        if(savedInstanceState != null) {
            iIn = savedInstanceState.getInt("contadorIn");
            tvIn1.setText(String.valueOf(iIn));
            iOut = savedInstanceState.getInt("contadorOut");
            tvOut1.setText(String.valueOf(iOut));
        }
    }


    public void metodoAnadirIn (View view) {
        iIn++;
        String iIn_String = String.valueOf(iIn);
        tvIn1.setText(iIn_String);

    }

    public void metodoAnadirOut (View view) {
        iOut++;
        String iOut_String = String.valueOf(iOut);
        tvOut1.setText(iOut_String);

    }
    // con Ctrl+O busco onSaveInstanceState
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("contadorIn", iIn);
        outState.putInt("contadorOut", iOut);

    }

    // con Ctrl+O busco onRestoreInstanceState y luego lo borro o lo comento
    /*@Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        savedInstanceState.getInt("contadorIn");
        savedInstanceState.getInt("contadorOut");
    }
    */
}
