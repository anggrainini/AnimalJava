package pulu.neko.animaljava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static pulu.neko.animaljava.R.id.radioBlengur;
import static pulu.neko.animaljava.R.id.soalDua;
import static pulu.neko.animaljava.R.id.soalSatu;

public class QuestDua extends AppCompatActivity {
    RadioButton radioGembluk, radioJabrisan, radioPrecil, radioCemeng;
    String soalDua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest_2);
    }


    @Override
    public void onBackPressed() { }

    public void submit(View view){
        Intent soalTiga = new Intent(QuestDua.this, QuestTiga.class);

        /*ambil nilai soal 1*/
        Intent intent = getIntent();
        String soalSatu = intent.getStringExtra("soalSatu");
        radioGembluk = (RadioButton) findViewById(R.id.radioGembluk);
        radioJabrisan = (RadioButton) findViewById(R.id.radioJabrisan);
        radioPrecil = (RadioButton) findViewById(R.id.radioPrecil);
        radioCemeng = (RadioButton) findViewById(R.id.radioCemeng);


        if(radioGembluk.isChecked()){
            soalDua="1";
        }else {
            soalDua="0";
        }

        if(soalDua.equals("1")){
            Toast.makeText(getApplicationContext(), "Jawaban kamu benar!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Jawaban kamu Salah!", Toast.LENGTH_SHORT).show();
        }

        soalTiga.putExtra("soalSatu",soalSatu);
        soalTiga.putExtra("soalDua", soalDua);

        startActivity(soalTiga);
    }

}
