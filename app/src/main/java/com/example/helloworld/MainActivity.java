package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        final TextView tv1 = findViewById(R.id.textView2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressBar pb1 = findViewById(R.id.progressBar1);//这句如果放做类的成员变量，会报错
                pb1.incrementProgressBy(1);
                count = count + 1;                 //不能把count设为onCreate的变量，会报错。只能成员变量
                Log.d("MainActivity","btn1");
                if(count>=10)
                    tv1.setText("=、=\n你赢了!");
                else {
                    tv1.setText("你已经按了" + count + "次了");//这里的warning记得改

                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressBar pb1 = findViewById(R.id.progressBar1);
                pb1.incrementProgressBy(1);
                count = count + 1;
                Log.d("MainActivity","btn2");
                if(count>=10)
                    tv1.setText("=、=\n太强了!");
                else {
                    tv1.setText("你已经按了" + count + "次了");

                }
            }
        });

    }
}
