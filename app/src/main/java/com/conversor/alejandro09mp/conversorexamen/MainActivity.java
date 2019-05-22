package com.conversor.alejandro09mp.conversorexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public String TipoConversion="",Conversion="";
    public Button HM,MH,MK,KM,MC,CM,CP,PC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Conversor de unidades");

    }
    public void Hect_Mts(View v){
        HM=(Button)findViewById(R.id.btn_hm);
        TipoConversion=HM.getText().toString();
        Conversion="1";
        CambiarVentana();
    }
    public void Mts_Hect(View v){
        MH=(Button)findViewById(R.id.btn_mh);
        TipoConversion=MH.getText().toString();
        Conversion="2";
        CambiarVentana();
    }
    public void Mts2_Km(View v){
        MK=(Button)findViewById(R.id.btn_mk);
        TipoConversion=MK.getText().toString();
        Conversion="3";
        CambiarVentana();
    }
    public void KM_Mts2(View v){
        KM=(Button)findViewById(R.id.btn_km);
        TipoConversion=KM.getText().toString();
        Conversion="4";
        CambiarVentana();
    }
    public void Mts_Cnts(View v){
        MC=(Button)findViewById(R.id.btn_M_C);
        TipoConversion=MC.getText().toString();
        Conversion="5";
        CambiarVentana();
    }
    public void Cnts_Mts(View v){
        CM=(Button)findViewById(R.id.btn_C_M);
        TipoConversion=CM.getText().toString();
        Conversion="6";
        CambiarVentana();
    }
    public void Cnts_Pulg(View v){
        CP=(Button)findViewById(R.id.btn_C_INCH);
        TipoConversion=CP.getText().toString();
        Conversion="7";
        CambiarVentana();
    }
    public void Pulg_Cent(View v){
        PC=(Button)findViewById(R.id.btn_INCH_C);
        TipoConversion=PC.getText().toString();
        Conversion="8";
        CambiarVentana();
    }
    public void CambiarVentana(){
        Intent Ventana=new Intent(getApplicationContext(),Conversion.class);
        Ventana.putExtra("Tipo_Conversion",TipoConversion);
        Ventana.putExtra("Conver",Conversion);
        startActivity(Ventana);
    }
}
