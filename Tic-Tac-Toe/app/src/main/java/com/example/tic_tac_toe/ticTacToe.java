package com.example.tic_tac_toe;


import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tic_tac_toe.R;
import com.example.tic_tac_toe.piece_selection;

import java.util.ArrayList;
import java.util.Collections;

public class ticTacToe extends AppCompatActivity {
    RelativeLayout r1;
    ImageView one, two, three, four, five, six, seven, eight, nine;
    TextView win;
    ImageView r0, r30, r45, r60, r90, r120, r135, r150, winning;
    Button left, right, leftd, rightd;
    TextView replay;
    public int p=0;
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> c = new ArrayList<Integer>();
    public String s="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tic_tac_toe);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        left = findViewById(R.id.ppl);
        right = findViewById(R.id.ppr);
        leftd = findViewById(R.id.ppld);
        rightd = findViewById(R.id.pprd);
        replay = findViewById(R.id.replay);
        r0 = findViewById(R.id.r0);
        r30 = findViewById(R.id.r30);
        r45 = findViewById(R.id.r45);
        r60 = findViewById(R.id.r60);
        r90 = findViewById(R.id.r90);
        r120 = findViewById(R.id.r120);
        r135 = findViewById(R.id.r135);
        r150 = findViewById(R.id.r150);
        win = findViewById(R.id.win);
        winning = findViewById(R.id.winning);
        r1 = findViewById(R.id.r1);


        Intent intent = getIntent();
        if (intent != null) {
            p = intent.getIntExtra("key",0);
        }
        start(p);

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(ticTacToe.this, piece_selection.class);
                startActivity(intent2);

            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(1)){
                    win(1);
                    change(p);
                    if(p==0){
                        one.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        one.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(1);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(2)){
                    win(2);
                    change(p);
                    if(p==0){
                        two.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        two.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(2);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(3)){
                    win(3);
                    change(p);
                    if(p==0){
                        three.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        three.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(3);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(4)){
                    win(4);
                    change(p);
                    if(p==0){
                        four.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        four.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(4);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(5)){
                    win(5);

                    change(p);
                    if(p==0){
                        five.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        five.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(5);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(6)){
                    win(6);
                    change(p);
                    if(p==0){
                        six.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        six.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(6);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(check(7)){
                    win(7);
                    change(p);
                    if(p==0){
                        seven.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        seven.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(7);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(8)){
                    win(8);
                    change(p);
                    if(p==0){
                        eight.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        eight.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(8);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(9)){
                    win(9);
                    change(p);
                    if(p==0){
                        nine.setImageResource(R.drawable.o);
                        p=1;
                    }
                    else if(p==1){
                        nine.setImageResource(R.drawable.x);
                        p=0;
                    }
                    put(9);
                }
            }
        });



        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.orange, getTheme()));
        }



    }

    public void win(int i) {
        if (p == 0) {
            ArrayList<Integer> b = new ArrayList<>();
            int z = 0;
            int y = 0;
            int x = 0;
            a.add(i);
            Collections.sort(a);
            for (int j = 0; j < (a.size()); j++) {
                Log.e("size", String.valueOf(a.size()));
                for (int k = (j + 1); k < (a.size()); k++) {
                    for (int l = (k + 1); l < (a.size()); l++) {
                        z = a.get(j) + a.get(k) + a.get(l);
                        y = (a.get(j) + a.get(l)) / 2;
                        x = a.get(k) - a.get(j);
                        if ((z % 3 == 0) && (y == a.get(k)) && !((x % 2 == 0) && (a.get(k) != 5))&& !((x==1)&&(a.get(l)%3!=0 ))) {
                            b.add(a.get(j));
                            b.add(a.get(k));
                            b.add(a.get(l));
                            Log.e("Os", String.valueOf(b.get(0)) + String.valueOf(b.get(1)) + String.valueOf(b.get(2)));
                            func(b);

                            Log.e("Os", String.valueOf(b.get(0)) + String.valueOf(b.get(1)) + String.valueOf(b.get(2)));
                            p = 2;
                            winner(0);
                            Log.e("Os", String.valueOf(a.get(j)) + String.valueOf(a.get(k)) + String.valueOf(a.get(l)));
                            Log.e("Os", String.valueOf(b.get(0)) + String.valueOf(b.get(1)) + String.valueOf(b.get(2)));
                        }
                    }
                }
            }
        }

        if (p == 1) {
            ArrayList<Integer> b = new ArrayList<>();
            int z = 0;
            int y = 0;
            int x = 0;
            c.add(i);
            Collections.sort(c);
            for (int j = 0; j < (c.size()); j++) {
                for (int k = (j + 1); k < (c.size()); k++) {
                    for (int l = (k + 1); l < (c.size()); l++) {
                        z = c.get(j) + c.get(k) + c.get(l);
                        y = (c.get(j) + c.get(l))/2;
                        x = c.get(k) - c.get(j);
                        if ((z % 3 == 0) && (y == c.get(k)) &&!((x % 2 == 0) && (c.get(k) != 5)) && !((x==1)&&(c.get(l)%3!=0 ))){
                            b.add(c.get(j));
                            b.add(c.get(k));
                            b.add(c.get(l));
                            func(b);
                            p=2;
                            winner(1);
                        }
                    }
                }
            }
        }
    }


    public void func(ArrayList<Integer> b) {
        if (p == 0) {
            for (int i = 0; i < 3; i++) {
                if (b.get(i) == 1) {
                    one.setImageResource(R.drawable.candyo);
                }
                if (b.get(i) == 2) {
                    two.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 3) {
                    three.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 4) {
                    four.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 5) {
                    five.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 6) {
                    six.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 7) {
                    seven.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 8) {
                    eight.setImageResource(R.drawable.candyo);
                }if (b.get(i) == 9) {
                    nine.setImageResource(R.drawable.candyo);
                }
            }
        }
        if (p == 1) {
            for (int i = 0; i < 3; i++) {
                if (b.get(i) == 1) {
                    one.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 2) {
                    two.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 3) {
                    three.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 4) {
                    four.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 5) {
                    five.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 6) {
                    six.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 7) {
                    seven.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 8) {
                    eight.setImageResource(R.drawable.candyx);
                }if (b.get(i) == 9) {
                    nine.setImageResource(R.drawable.candyx);
                }
            }
        }
    }
    public void change(int i){

        if(i==0){
            left.setVisibility(View.INVISIBLE);
            leftd.setVisibility(View.VISIBLE);
            right.setVisibility(View.VISIBLE);
            rightd.setVisibility(View.INVISIBLE);
        }
        if(i==1){
            left.setVisibility(View.VISIBLE);
            leftd.setVisibility(View.INVISIBLE);
            right.setVisibility(View.INVISIBLE);
            rightd.setVisibility(View.VISIBLE);
        }

    }

    public void put(int i) {
        s = s + String.valueOf(i);
        Log.e("string s", s);
        if((s.length()==8) && (p!=2)){
            win.setText("DRAW !");
            r1.setVisibility(View.VISIBLE);
            left.setVisibility(View.INVISIBLE);
            leftd.setVisibility(View.INVISIBLE);
            right.setVisibility(View.INVISIBLE);
            rightd.setVisibility(View.INVISIBLE);
            replay.setText("RETRY");
            win.setVisibility(View.VISIBLE);
            winning.setImageResource(R.drawable.surprised);
            winning.setVisibility(View.VISIBLE);
        }
    }

    public boolean check(int i) {
        String t = s;
        String m = "";
        while (!t.isEmpty()) {
            m = String.valueOf(t.charAt(t.length() - 1));
            t = t.substring(0, t.length() - 1);
            if (m.equals(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    public void start(int k){
        if (k == 0) {
            change(k + 1);
        }
        if (k == 1) {
            change(k - 1);
        }

        s="";
        a.clear();
        c.clear();
        one.setImageResource(0);
        two.setImageResource(0);
        three.setImageResource(0);
        four.setImageResource(0);
        five.setImageResource(0);
        six.setImageResource(0);
        seven.setImageResource(0);
        eight.setImageResource(0);
        nine.setImageResource(0);
        win.setVisibility(View.INVISIBLE);
        r1.setVisibility(View.INVISIBLE);
        win.setText("WINNER !!");
        replay.setText("REPLAY");

    }

    public void winner(int o){

        if(p==2) {
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    left.setVisibility(View.INVISIBLE);
                    leftd.setVisibility(View.INVISIBLE);
                    right.setVisibility(View.INVISIBLE);
                    rightd.setVisibility(View.INVISIBLE);

                    r0.setVisibility(View.VISIBLE);
                    one.setImageResource(0);
                    two.setImageResource(0);
                    three.setImageResource(0);
                    four.setImageResource(0);
                    five.setImageResource(0);
                    six.setImageResource(0);
                    seven.setImageResource(0);
                    eight.setImageResource(0);
                    nine.setImageResource(0);

                    r1.setVisibility(View.VISIBLE);

                    if(o==0){
                        winning.setImageResource(R.drawable.candyo);
                    }
                    if(o==1){
                        winning.setImageResource(R.drawable.candyx);
                    }
                }
            }, 800);

            for(int j=0; j<2; j++) {
                Handler h1 = new Handler();
                h1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r0.setVisibility(View.INVISIBLE);
                        r30.setVisibility(View.VISIBLE);
                    }
                }, j*800+1400);

                Handler h2 = new Handler();
                h2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r30.setVisibility(View.INVISIBLE);
                        r45.setVisibility(View.VISIBLE);
                    }
                }, j*800+1500);

                Handler h3 = new Handler();
                h3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r45.setVisibility(View.INVISIBLE);
                        r60.setVisibility(View.VISIBLE);
                        win.setVisibility(View.VISIBLE);
                    }
                }, j*800+1600);

                Handler h4 = new Handler();
                h4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r60.setVisibility(View.INVISIBLE);
                        r90.setVisibility(View.VISIBLE);
                    }
                }, j*800+1700);

                Handler h5 = new Handler();
                h5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r90.setVisibility(View.INVISIBLE);
                        r120.setVisibility(View.VISIBLE);

                    }
                }, j*800+1800);

                Handler h6 = new Handler();
                h6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r120.setVisibility(View.INVISIBLE);
                        r135.setVisibility(View.VISIBLE);
                    }
                }, j*800+1900);

                Handler h7 = new Handler();
                h7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r135.setVisibility(View.INVISIBLE);
                        r150.setVisibility(View.VISIBLE);
                    }
                }, j*800+2000);

                Handler h8 = new Handler();
                h8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        r150.setVisibility(View.INVISIBLE);
                        r0.setVisibility(View.VISIBLE);

                    }
                }, j*800+2100);
            }
        }


    }

//    public void winner(int o) {
//        if (p == 2) {
//            // Show the initial elements
//            r0.setVisibility(View.VISIBLE);
//            winner.setVisibility(View.VISIBLE);
//
//            // Handler for the first animation step
//            Handler h1 = new Handler();
//            h1.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    r0.setVisibility(View.INVISIBLE);
//                    r30.setVisibility(View.VISIBLE);
//                }
//            }, 500); // 500ms delay for the first step
//
//            // Handler for the second animation step
//            Handler h2 = new Handler();
//            h2.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    r30.setVisibility(View.INVISIBLE);
//                    r45.setVisibility(View.VISIBLE);
//                }
//            }, 1000); // 1000ms delay for the second step
//
//            // Handler for the third animation step
//            Handler h3 = new Handler();
//            h3.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    r45.setVisibility(View.INVISIBLE);
//                    r135.setVisibility(View.VISIBLE);
//                }
//            }, 1500); // 1500ms delay for the third step
//
//            // Handler for the fourth animation step and final actions
//            Handler h4 = new Handler();
//            h4.postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    r135.setVisibility(View.INVISIBLE);
//                    winner.setVisibility(View.INVISIBLE); // Hide the winner view
//                    if (o == 0) {
//                        winning.setImageResource(R.drawable.candyo); // Set image resource for player O
//                    } else if (o == 1) {
//                        winning.setImageResource(R.drawable.candyx); // Set image resource for player X
//                    }
//                }
//            }, 2000); // 2000ms delay for the fourth step and final actions
//        }
//    }


}