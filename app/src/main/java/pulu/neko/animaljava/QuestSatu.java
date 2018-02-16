package pulu.neko.animaljava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import static java.security.AccessController.getContext;
import static pulu.neko.animaljava.R.id.soalDua;

public class QuestSatu extends AppCompatActivity {
    RadioButton radioMeri, radioBlengur, radioKuthuk, radioKroto;
    String soalSatu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest_1);
    }


    @Override
    public void onBackPressed() { }

    public void submit(View view){
        Intent soalDua = new Intent(QuestSatu.this, QuestDua.class);
        radioMeri = (RadioButton) findViewById(R.id.radioMeri);
        radioBlengur = (RadioButton) findViewById(R.id.radioBlengur);
        radioKuthuk = (RadioButton) findViewById(R.id.radioKuthuk);
        radioKroto = (RadioButton) findViewById(R.id.radioKroto);


        if(radioBlengur.isChecked()){
            soalSatu="1";
        }else {
            soalSatu="0";
        }

        if(soalSatu.equals("1")){
            Toast.makeText(getApplicationContext(), "Jawaban kamu benar!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Jawaban kamu Salah!", Toast.LENGTH_SHORT).show();
        }

        soalDua.putExtra("soalSatu", soalSatu);
        startActivity(soalDua);
    }

}
