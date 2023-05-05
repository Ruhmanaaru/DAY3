package easy.tuto.lecture4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private char[] skyLetters = {'b', 'd', 'f', 'h', 'k', 'l', 't'};
    private char[] grassLetters = {'g', 'j', 'p', 'q', 'y'};
    private char[] rootLetters = {'a', 'c', 'e', 'i', 'm', 'n', 'o', 'r', 's', 'u', 'v', 'w', 'x', 'z'};
    private String answerString = "";
    TextView question;
    Button sky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.questionview);
        sky=findViewById(R.id.button4);
        Random rand=new Random();
        int num=rand.nextInt(2);
        if(num==0)
        {
            int n= rand.nextInt(skyLetters.length-1);
            char sky= skyLetters[n];
            question.setText(sky+"");
        }
        if(num==1)
        {
            int n= rand.nextInt(grassLetters.length-1);
            char grass= grassLetters[n];
            question.setText(grass+"");
        }

        if(num==2)
        {
            int n= rand.nextInt(rootLetters.length-1);
            char root= rootLetters[n];
            question.setText(root+"");
        }


        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });










    }
}