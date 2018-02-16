package pulu.neko.animaljava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class QuestLima extends AppCompatActivity {
    String soalLima;
    EditText editKebo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest_5);
    }

    @Override
    public void onBackPressed() { }


    public void submit(View view){
        Intent Count = new Intent(QuestLima.this, Count.class);

        Intent intent = getIntent();
        String soalSatu = intent.getStringExtra("soalSatu");
        String soalDua = intent.getStringExtra("soalDua");
        String soalTiga = intent.getStringExtra("soalTiga");
        String soalEmpat =  intent.getStringExtra("soalEmpat");

        editKebo = (EditText) findViewById(R.id.editKebo);

        String kebo =editKebo.getText().toString();

        if(kebo.equals("Gudel") ||kebo.equals("GUDEL") || kebo.equals("gudel")){
            soalLima = "1";
        }else{
            soalLima = "0";
        }
        Log.d("kebo",kebo);
        Log.d("soal",soalLima);

        if(soalLima.equals("1")){
            Toast.makeText(getApplicationContext(), "Jawaban kamu benar!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Jawaban kamu Salah!", Toast.LENGTH_SHORT).show();
        }

        Count.putExtra("soalSatu",soalSatu);
        Count.putExtra("soalDua", soalDua);
        Count.putExtra("soalTiga", soalTiga);
        Count.putExtra("soalEmpat", soalEmpat);
        Count.putExtra("soalLima", soalLima);

        startActivity(Count);
    }


}
