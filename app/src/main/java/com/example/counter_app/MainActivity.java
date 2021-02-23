package com.example.counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countNumber;
    private Button plusButton;
    private Button minusButton;
    private Button clearButton;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countNumber = (TextView)this.findViewById(R.id.countNumber);
        plusButton = (Button)this.findViewById(R.id.plusButton);
        minusButton = (Button)this.findViewById(R.id.minusButton);
        clearButton = (Button)this.findViewById(R.id.clearButton);
        number = 0;

        countNumber.setText(number + "");
        plusButton.setOnClickListener(new View.OnClickListener(){//プラスボタンの処理
            @Override
            public void onClick(View v) {
                number = number + 1;
                countNumber.setText(number + "");
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener(){//マイナスボタンの処理
            @Override
            public void onClick(View v) {
                number = number - 1;
                countNumber.setText(number + "");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {//クリアボタンの処理
            @Override
            public void onClick(View v) {
                number = 0;
                countNumber.setText(number + "");
            }
        });
    }
}