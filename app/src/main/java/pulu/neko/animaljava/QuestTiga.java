package pulu.neko.animaljava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import static pulu.neko.animaljava.R.id.radioGembluk;

public class QuestTiga extends AppCompatActivity {
    CheckBox checkBebek, checkBaya, checkLuwing, checkKidang;
    String soalTiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest_3);
    }

    @Override
    public void onBackPressed() { }

    public void submit(View view){
        Intent soalEmpat = new Intent(QuestTiga.this, QuestEmpat.class);
        /*ambil nilai soal 1*/
        Intent intent = getIntent();
        String soalSatu = intent.getStringExtra("soalSatu");
        String soalDua = intent.getStringExtra("soalDua");

        checkBebek = (CheckBox) findViewById(R.id.checkBebek);
        checkBaya = (CheckBox) findViewById(R.id.checkBaya);
        checkLuwing = (CheckBox) findViewById(R.id.checkLuwing);
        checkKidang = (CheckBox) findViewById(R.id.checkKidang);


        if(checkBaya.isChecked()&& checkKidang.isChecked() ){
            soalTiga="1";
        }else {
            soalTiga="0";
        }

        if(soalTiga.equals("1")){
            Toast.makeText(getApplicationContext(), "Jawaban kamu benar!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Jawaban kamu Salah!", Toast.LENGTH_SHORT).show();
        }


        soalEmpat.putExtra("soalSatu",soalSatu);
        soalEmpat.putExtra("soalDua", soalDua);
        soalEmpat.putExtra("soalTiga", soalTiga);


        startActivity(soalEmpat);
    }


}
