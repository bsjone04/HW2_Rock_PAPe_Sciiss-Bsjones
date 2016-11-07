package bsjone04.tictactoehw4_bsjones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rock, paper, scissors;

    ImageView icon1, icon2;

    String playerClick, cpuClick, result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        icon1 = (ImageView) findViewById(R.id.icon1);


        icon2 = (ImageView) findViewById(R.id.icon2);

        rock = (Button) findViewById(R.id.rock);
        paper = (Button) findViewById(R.id.paper);
        scissors = (Button) findViewById(R.id.scissors);

        r = new Random();

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerClick = "rock";
                icon2.setImageResource(R.drawable.rock);
                calculate();


            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerClick = "paper";
                icon2.setImageResource(R.drawable.paper);
                calculate();

            }
        });
        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerClick = "scissors";
                icon2.setImageResource(R.drawable.scissors);
                calculate();

            }
        });
    }

        public void calculate() {
        int cpu = r.nextInt(3);
        if(cpu == 0) {
            cpuClick = "rock";
            icon1.setImageResource(R.drawable.rock);
        }
        else if(cpu == 1){
            cpuClick = "paper";
            icon1.setImageResource(R.drawable.paper);
        }
        else if (cpu == 2) {
            cpuClick = "scissors";
            icon1.setImageResource(R.drawable.scissors);
        }
            if(playerClick.equals("rock") && cpuClick.equals("paper")){
                result = "you lose";
        }
            else if(playerClick.equals("rock") && cpuClick.equals("scissors")){
                result = "you win";
            }
            else if(playerClick.equals("paper") && cpuClick.equals("rock")){
                result = "you win";
            }
            else if(playerClick.equals("paper") && cpuClick.equals("scissors")){
                result = "you lose";
            }
           else if(playerClick.equals("scissors") && cpuClick.equals("paper")){
                result = "you win";
            }
            else if(playerClick.equals("scissors") && cpuClick.equals("rock")){
                result = "you lose";
            }
            else if(playerClick.equals("scissors") && cpuClick.equals("scissors")){
                result = "you tie";
            }
            else if(playerClick.equals("rock") && cpuClick.equals("rock")){
                result = "you tie";
            }
            else if(playerClick.equals("paper") && cpuClick.equals("paper")){
                result = "you tie";
            }

            Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
    }
    }
}
