package pulu.neko.animaljava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static pulu.neko.animaljava.R.id.radioGembluk;

public class QuestEmpat extends AppCompatActivity {
    RadioButton radioSenggutru, radioPrecil, radioUndur, radioMinthi;
    String soalEmpat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest_4);
    }

    @Override
    public void onBackPressed() { }

    public void submit(View view){
        Intent soalLima = new Intent(QuestEmpat.this, QuestLima.class);
        Intent intent = getIntent();
        String soalSatu = intent.getStringExtra("soalSatu");
        String soalDua = intent.getStringExtra("soalDua");
        String soalTiga = intent.getStringExtra("soalTiga");


        radioSenggutru = (RadioButton) findViewById(R.id.radioSenggutru);
        radioPrecil = (RadioButton) findViewById(R.id.radioPrecil);
        radioUndur = (RadioButton) findViewById(R.id.radioUndur);
        radioMinthi = (RadioButton) findViewById(R.id.radioMinthi);


        if(radioUndur.isChecked()){
            soalEmpat="1";
        }else {
            soalEmpat="0";
        }

        if(soalEmpat.equals("1")){
            Toast.makeText(getApplicationContext(), "Jawaban kamu benar!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Jawaban kamu Salah!", Toast.LENGTH_SHORT).show();
        }


        soalLima.putExtra("soalSatu",soalSatu);
        soalLima.putExtra("soalDua", soalDua);
        soalLima.putExtra("soalTiga", soalTiga);
        soalLima.putExtra("soalEmpat", soalEmpat);

        startActivity(soalLima);
    }

}
