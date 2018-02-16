package pulu.neko.animaljava;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    ImageButton btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPlay = (ImageButton) findViewById(R.id.btnPlay);


    }

    public void startPlay(View view){
        Intent soalSatu = new Intent(Home.this, QuestSatu.class);
        startActivity(soalSatu);
    }

    public void getHint(View view){
        Intent Hint = new Intent(Home.this, Hint.class);
        startActivity(Hint);
    }

    public void getInstruction(View view){
        Intent Instruct = new Intent(Home.this, Instruction.class);
        startActivity(Instruct);
    }

    public void getAbout(View view){
        Intent About = new Intent(Home.this, About.class);
        startActivity(About);
    }

    public void getClose(View view){
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }

                })
                .setNegativeButton("No", null)
                .show();

    }


}
