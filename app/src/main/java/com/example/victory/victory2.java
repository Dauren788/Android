package com.example.victory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class victory2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory2);

        int partA=9;
        int partB=9;
        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;

        /*Здесь мы создаём объект, основанный на классе TextView и Button соответственно, а также связываем эти объекты к соответствующим элементам графического интерфейса, созданного нами ранее*/
        TextView textObjectPartA =(TextView)findViewById(R.id.textPartA);
        TextView textObjectPartB =(TextView)findViewById(R.id.textPartB);
        Button buttonObjectChoice1 =(Button)findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 =(Button)findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 =(Button)findViewById(R.id.buttonChoice3);

        //Используем метод(функцию) setText, который описан в классах Button и //TextView для вывода на графический интерфейс значений переменных.
        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);
//на данный момент нам не важно, какая кнопка будет
//показывать правильный ответ,
//а какая неправильный.
        buttonObjectChoice1.setText("" + correctAnswer);
        buttonObjectChoice2.setText("" + wrongAnswer1);
        buttonObjectChoice3.setText("" + wrongAnswer2);
    }
}
