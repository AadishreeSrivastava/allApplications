package com.example.calculator;

//import static com.example.myapp.functions.cont;
//import static com.example.myapp.functions.m;
//import static com.example.myapp.functions.o;
//import static com.example.myapp.functions.r;
//import static com.example.myapp.functions.remove;
//import static com.example.myapp.functions.str;
//import static com.example.myapp.functions.t;
//import static com.example.myapp.functions.u;
//import static com.example.myapp.functions.p;
//import static com.example.myapp.functions.q;
//import static com.example.myapp.functions.show;
//import static com.example.myapp.functions.calc;
//import static com.example.myapp.functions.s;


import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class calci extends AppCompatActivity {

    public double p, q, r, s, t, u, o;
    public int m;
    public String str="";


    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, mul, div, add, sub, clr, enter, back;
    public TextView text, text2;
    public String str2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calci);

//        getActionBar().setTitle("Calci");

        p=0;
        q=0;
        r=0.1;
        s=0;
        t=0;
        u=0;
        o=0;
        m=0;


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        enter = findViewById(R.id.enter);
        clr = findViewById(R.id.clear);
        back = findViewById(R.id.back);
        add = findViewById(R.id.plus);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(9);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(0);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont();
                s=1;
                t=0;
                r=0.1;
                str = str + '+';
                text.setText(str);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont();
                s=2;
                t=0;
                r=0.1;
                str = str + '-';
                text.setText(str);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont();
                s=3;
                t=0;
                r=0.1;
                str = str + 'x';
                text.setText(str);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont();
                s=4;
                t=0;
                r=0.1;
                str = str + '/';
                text.setText(str);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(s==0){
                    t=1;
                }
                else{
                    t=2;
                }
                str = str + '.';
                text.setText(str);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                if(str != "Invalid Expression"){
                    str2 = str;
                }
                if(str == "Invalid Expression"){
                }
                else if(u % 1 == 0) {
                    str = String.valueOf((int) (u));
                } else {
                    str = String.valueOf(u);
                }
                text.setText(str);

                text2.setText(str2);
                if(str == "Invalid Expression"){
                    str = "";
                }
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = str2;
                text.setText(str);
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                text.setText("");
                p=0;
                q=0;
                r=0.1;
                s=0;
                t=0;
                u=0;
                m=0;
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove();
                str = str.substring(0, str.length()-1);
                text.setText(str);

            }
        });

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.blue, getTheme()));
        }

    }

    public void show(int i) {
        if (t == 0) {
            if (s == 0) {
                o = p;
                p = (p * 10) + i;
            } else {
                o = q;
                q = (q * 10) + i;
            }
        }
        if (t == 1) {
            o = p;
            p = p + (i * r);
            r = r * 0.1;
            m++;
        }
        if (t == 2) {
            o = q;
            q = q + (i * r);
            r = r * 0.1;
            m++;
        }

        str = str+ String.valueOf(i);
        text.setText(str);

    }
    public void calc() {
        if (s == 1) {
            u = p + q;
        } else if (s == 2) {
            u = p - q;
        } else if (s == 3) {
            u = p * q;
        } else if (s == 4) {
            Log.e("p", String.valueOf(p));
            Log.e("q", String.valueOf(q));

            if (q == 0) {
                str = "Invalid Expression";
            } else {
                u = p / q;
            }
        }else if (s == 0) {
            u = p;
        }

//
//        if(((u%0.0000001!=0)||(((Math.ceil(u)-u)%0.0000001!=0))) && (s==3)){
//            u = new BigDecimal( Double.toString(u)).setScale(m, RoundingMode.HALF_UP).doubleValue();
//
//        }

        Log.e("p", String.valueOf(p));
        Log.e("q", String.valueOf(q));
        Log.e("u", String.valueOf(u));


        p = u;
        q = 0;
        r = 0.1;
        s = 0;
        t = 0;
        m = 0;
    }

    public void remove(){
        if(s==0){
            for(int a=0; a<m; a++){
                p = p * 10;
            }
            p = (int)(p/10);
            for(int a=0; a<m; a++){
                p = p * 0.1;
            }
        }
        else{
            for(int a=0; a<m; a++){
                q = q * 10;
            }
            q = (int)(q/10);
            for(int a=0; a<m; a++){
                q = q * 0.1;
            }
        }
    }


    public void cont(){
        if(q!=0){
            calc();

        }
    }

}