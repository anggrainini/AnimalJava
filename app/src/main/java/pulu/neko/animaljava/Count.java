package pulu.neko.animaljava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Count extends AppCompatActivity {
    Integer Hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count);

        Intent intent = getIntent();
        String soalSatu = intent.getStringExtra("soalSatu");
        String soalDua = intent.getStringExtra("soalDua");
        String soalTiga = intent.getStringExtra("soalTiga");
        String soalEmpat =  intent.getStringExtra("soalEmpat");
        String soalLima = intent.getStringExtra("soalLima");

        Hitung = Integer.parseInt(soalSatu)+ Integer.parseInt(soalDua)+ Integer.parseInt(soalTiga)+Integer.parseInt(soalEmpat)+Integer.parseInt(soalLima);

        TextView score = (TextView) findViewById(R.id.score);
        score.setText(String.valueOf(Hitung));

    }

    public void backToMenu(View view){
        Intent Menu = new Intent(Count.this, Home.class);
        startActivity(Menu);
    }

}
