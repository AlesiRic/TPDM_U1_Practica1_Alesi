package com.example.clowntoy.tpdm_u1_practica1_alesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    RadioButton M,F;
    Spinner sangre;
    Switch work;
    String mensaje="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.Name);
        M=findViewById(R.id.Masc);
        F=findViewById(R.id.Feme);
        sangre=findViewById(R.id.Blood);
        work=findViewById(R.id.Empleado);
    }

    public void mostrar(View v){

        if(nombre.getText().toString().equals("")){
            return;
        }
        if((!M.isChecked()) && (!F.isChecked())){
            return;
        }

        mensaje="Nombre: "+nombre.getText().toString()+"\n";
        if(M.isChecked()){
            mensaje=mensaje+"Sexo: Masculino\n";
        }
        if(F.isChecked()){
            mensaje=mensaje+"Sexo: Femenino\n";
        }
        mensaje=mensaje+"Tipo de sangre: "+sangre.getSelectedItem().toString()+"\n";
        if(work.isChecked()){
            mensaje=mensaje+"Trabaja: Si";
        }else{
            mensaje=mensaje+"Trabaja: No";
        }
        Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_SHORT).show();
    }

}
