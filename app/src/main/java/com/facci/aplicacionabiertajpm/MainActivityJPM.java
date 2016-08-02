package com.facci.aplicacionabiertajpm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityJPM extends AppCompatActivity {

    private EditText valorCambioET;
    private TextView numero1TV;
    private EditText valorCambioET2;
    private TextView numero2TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_jpm);

        Button btnInvocarActividad=(Button) findViewById(R.id.btnAcer);
        btnInvocarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityJPM.this, AcercaDe.class);
                startActivity(intent);
            }
        });
    }

    public void clickCapturar(View v){
        valorCambioET =  (EditText) findViewById(R.id.editText1);
        numero1TV = (TextView) findViewById(R.id.numero1TV);
        valorCambioET2 =  (EditText) findViewById(R.id.editText2);
        numero2TV=(TextView)findViewById(R.id.numero2TV);


        Integer valorCambio = Integer.parseInt(valorCambioET.getText().toString());
        Integer valorCambio2 = Integer.parseInt(valorCambioET2.getText().toString());
        Integer resultado;

        numero1TV.setText(String.valueOf(valorCambio));
        numero2TV.setText(String.valueOf(valorCambio2));
        valorCambioET.setText("");
        valorCambioET2.setText("");

        Toast.makeText(MainActivityJPM.this,"\t El numero a multiplicar es: "+valorCambio+ " \n\t Con un rango hasta el: "+valorCambio2+" ",Toast.LENGTH_SHORT).show();

            for (int i = 0; i <= valorCambio2; i++) {
                Toast.makeText(MainActivityJPM.this,""+valorCambio+"x"+i+"="+(valorCambio*i)+"",Toast.LENGTH_SHORT).show();

            }
        Toast.makeText(MainActivityJPM.this,"Gracias por su atencion :D \nla hemos pasado bien",Toast.LENGTH_SHORT).show();
    }


   /* private Integer procesarEdit(Integer valorCambio, Integer valorCambio2){
        Integer resultado;

        return ;
    }*/
}
