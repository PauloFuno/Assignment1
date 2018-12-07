package android.example.com.assignment1;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public int i = 0;
    public String nColor[] = {"Black", "White", "Gray", "Blue", "Green", "Red", "Orange", "Pink", "Purple", "Brown"};
    public String cColor[] = {"#000000", "#FFFFFF", "#999999", "#0000FF", "#008000", "#FF0000", "#FF4E00", "#FF00FF", "#800080", "#6A280B"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void toast (String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    public void onClick (View view) {

    }

    public void ButtonClicked(View view) {

        int random = (int)(Math.random() * 10);
        int rand2 = (int)(Math.random() * 10);
        Button l_b = (Button) findViewById(R.id.left_button);
        Button r_b = (Button) findViewById(R.id.right_button);
        TextView cName = (TextView)findViewById(R.id.color_name);
        TextView scoreValue = (TextView)findViewById(R.id.score_value);
        r_b.setBackgroundColor(Color.parseColor(cColor[random]));
        l_b.setBackgroundColor(Color.parseColor(cColor[rand2]));



        if (nColor[random].equals(cName)) {
            cName.setText(nColor[random]);
            scoreValue.setText(Integer.toString(i));
            toast("Right!");
            i++;
        } else {
            toast("Wrong!");
            cName.setText(nColor[random]);
        }



    }







}
