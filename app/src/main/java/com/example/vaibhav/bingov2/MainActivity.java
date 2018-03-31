package com.example.vaibhav.bingov2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 1, i, y,tempstatus=0,play=0,startstatus=1;
    int temp = 0, x1 = 1, x2 = 1, x3 = 1, x4 = 1, x5 = 1, x6 = 1, x7 = 1, x8 = 1, x9 = 1, x10 = 1, x11 = 1, x12 = 1;
    int[] idarray = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn10, R.id.btn11, R.id.btn12, R.id.btn13, R.id.btn14, R.id.btn15, R.id.btn16, R.id.btn17, R.id.btn18, R.id.btn19, R.id.btn20, R.id.btn21, R.id.btn22, R.id.btn23, R.id.btn24, R.id.btn25};
    Button[] btn = new Button[idarray.length + 1];
    Button b1, b2, b3, b4, b5, reset, start;
    Firebase url;
    String status="lost";
    final Handler handler=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!isConnected(MainActivity.this))
            buildDialog(MainActivity.this).show();
        else {
            Toast.makeText(MainActivity.this, "Lets play Bingo!!!", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_main);
            Firebase.setAndroidContext(this);

            url = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/");

            for (i = 0; i < idarray.length; i++) {
                y = i + 1;
                btn[y] = findViewById(idarray[i]);
                btn[y].setOnClickListener(this);
            }
            b1 = findViewById(R.id.b1);
            b2 = findViewById(R.id.b2);
            b3 = findViewById(R.id.b3);
            b4 = findViewById(R.id.b4);
            b5 = findViewById(R.id.b5);
            start = findViewById(R.id.start);
            reset = findViewById(R.id.reset);

            start.setOnClickListener(this);
            reset.setOnClickListener(this);

            handler.postDelayed(new Runnable() {
                public void run() {
                    if (count > 25 && play==1) {
                        startstatus=0;
                        Firebase mref1 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/1");
                        mref1.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref2 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/2");
                        mref2.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref3 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/3");
                        mref3.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref4 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/4");
                        mref4.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref5 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/5");
                        mref5.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref6 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/6");
                        mref6.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref7 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/7");
                        mref7.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref8 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/8");
                        mref8.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref9 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/9");
                        mref9.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref10 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/10");
                        mref10.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref11 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/11");
                        mref11.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref12 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/12");
                        mref12.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref13 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/13");
                        mref13.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref14 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/14");
                        mref14.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref15 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/15");
                        mref15.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref16 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/16");
                        mref16.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref17 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/17");
                        mref17.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref18 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/18");
                        mref18.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref19 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/19");
                        mref19.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref20 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/20");
                        mref20.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref21 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/21");
                        mref21.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref22 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/22");
                        mref22.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref23 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/23");
                        mref23.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref24 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/24");
                        mref24.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase mref25 = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/25");
                        mref25.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                for (i = 1; i <= idarray.length; i++)
                                    if (btn[i].getText().toString().equals(value)) {
                                        btn[i].setText("*");
                                        result();
                                    }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });

                        Firebase ref = new Firebase("https://bingov2-9.firebaseio.com/btnvalue/lost");
                        ref.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String value = dataSnapshot.getValue(String.class);
                                if (status.equals(value)) {
                                    youlost();
                                }
                            }

                            @Override
                            public void onCancelled(FirebaseError firebaseError) {

                            }
                        });
                    }

                    handler.postDelayed(this, 1000);
                }
            }, 1000);
        }

    }



    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        if (count <= 25)
            switch (view.getId()) {
                case R.id.btn1:
                    if (btn[1].getText().toString().equals("")) {
                        btn[1].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn2:
                    if (btn[2].getText().toString().equals("")) {
                        btn[2].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn3:
                    if (btn[3].getText().toString().equals("")) {
                        btn[3].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn4:
                    if (btn[4].getText().toString().equals("")) {
                        btn[4].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn5:
                    if (btn[5].getText().toString().equals("")) {
                        btn[5].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn6:
                    if (btn[6].getText().toString().equals("")) {
                        btn[6].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn7:
                    if (btn[7].getText().toString().equals("")) {
                        btn[7].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn8:
                    if (btn[8].getText().toString().equals("")) {
                        btn[8].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn9:
                    if (btn[9].getText().toString().equals("")) {
                        btn[9].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn10:
                    if (btn[10].getText().toString().equals("")) {
                        btn[10].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn11:
                    if (btn[11].getText().toString().equals("")) {
                        btn[11].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn12:
                    if (btn[12].getText().toString().equals("")) {
                        btn[12].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn13:
                    if (btn[13].getText().toString().equals("")) {
                        btn[13].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn14:
                    if (btn[14].getText().toString().equals("")) {
                        btn[14].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn15:
                    if (btn[15].getText().toString().equals("")) {
                        btn[15].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn16:
                    if (btn[16].getText().toString().equals("")) {
                        btn[16].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn17:
                    if (btn[17].getText().toString().equals("")) {
                        btn[17].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn18:
                    if (btn[18].getText().toString().equals("")) {
                        btn[18].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn19:
                    if (btn[19].getText().toString().equals("")) {
                        btn[19].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn20:
                    if (btn[20].getText().toString().equals("")) {
                        btn[20].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn21:
                    if (btn[21].getText().toString().equals("")) {
                        btn[21].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn22:
                    if (btn[22].getText().toString().equals("")) {
                        btn[22].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn23:
                    if (btn[23].getText().toString().equals("")) {
                        btn[23].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn24:
                    if (btn[24].getText().toString().equals("")) {
                        btn[24].setText(Integer.toString(count++));
                    }
                    break;
                case R.id.btn25:
                    if (btn[25].getText().toString().equals("")) {
                        btn[25].setText(Integer.toString(count++));
                    }
                    break;

                case R.id.reset:
                    if(count==1)
                        Toast.makeText(this, "Nothing is entered.", Toast.LENGTH_SHORT).show();
                    for (i = 1; i <= idarray.length; i++) {
                        btn[i].setText("");
                        btn[i].setEnabled(true);
                    }
                    temp = 0;
                    count = 1;
                    b1.setText("B");
                    b2.setText("I");
                    b3.setText("N");
                    b4.setText("G");
                    b5.setText("O");
                    tempstatus=0;
                    play=0;
                    startstatus=1;

                    x1 = 1;
                    x2 = 1;
                    x3 = 1;
                    x4 = 1;
                    x5 = 1;
                    x6 = 1;
                    x7 = 1;
                    x8 = 1;
                    x9 = 1;
                    x10 = 1;
                    x11 = 1;
                    x12 = 1;
                    deletedb();
                    break;

                case R.id.start:
                    Toast.makeText(this, "Enter 25 random numbers.", Toast.LENGTH_SHORT).show();
                    break;

            }
            if(count==26 && startstatus==1)
                switch (view.getId()) {
                    case R.id.start:
                        play=1;
                        Toast.makeText(this, "Game has started.", Toast.LENGTH_SHORT).show();

                }
            if (count > 25 && play==1)
            switch (view.getId()) {
                case R.id.btn1:
                    if (!btn[1].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[1].getText().toString());
                        fb.setValue(btn[1].getText().toString());
                    }
                    break;

                case R.id.btn2:
                    if (!btn[2].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[2].getText().toString());
                        fb.setValue(btn[2].getText().toString());
                    }
                    break;

                case R.id.btn3:
                    if (!btn[3].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[3].getText().toString());
                        fb.setValue(btn[3].getText().toString());
                    }
                    break;

                case R.id.btn4:
                    if (!btn[4].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[4].getText().toString());
                        fb.setValue(btn[4].getText().toString());
                    }
                    break;

                case R.id.btn5:
                    if (!btn[5].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[5].getText().toString());
                        fb.setValue(btn[5].getText().toString());

                    }
                    break;

                case R.id.btn6:
                    if (!btn[6].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[6].getText().toString());
                        fb.setValue(btn[6].getText().toString());
                    }
                    break;

                case R.id.btn7:
                    if (!btn[7].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[7].getText().toString());
                        fb.setValue(btn[7].getText().toString());

                    }
                    break;
                case R.id.btn8:
                    if (!btn[8].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[8].getText().toString());
                        fb.setValue(btn[8].getText().toString());

                    }
                    break;

                case R.id.btn9:
                    if (!btn[9].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[9].getText().toString());
                        fb.setValue(btn[9].getText().toString());
                    }
                    break;

                case R.id.btn10:
                    if (!btn[10].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[10].getText().toString());
                        fb.setValue(btn[10].getText().toString());

                    }
                    break;

                case R.id.btn11:
                    if (!btn[11].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[11].getText().toString());
                        fb.setValue(btn[11].getText().toString());
                    }
                    break;

                case R.id.btn12:
                    if (!btn[12].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[12].getText().toString());
                        fb.setValue(btn[12].getText().toString());

                    }
                    break;

                case R.id.btn13:
                    if (!btn[13].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[13].getText().toString());
                        fb.setValue(btn[13].getText().toString());
                    }
                    break;

                case R.id.btn14:
                    if (!btn[14].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[14].getText().toString());
                        fb.setValue(btn[14].getText().toString());

                    }
                    break;

                case R.id.btn15:
                    if (!btn[15].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[15].getText().toString());
                        fb.setValue(btn[15].getText().toString());
                    }
                    break;

                case R.id.btn16:
                    if (!btn[16].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[16].getText().toString());
                        fb.setValue(btn[16].getText().toString());

                    }
                    break;

                case R.id.btn17:
                    if (!btn[17].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[17].getText().toString());
                        fb.setValue(btn[17].getText().toString());

                    }
                    break;

                case R.id.btn18:
                    if (!btn[18].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[18].getText().toString());
                        fb.setValue(btn[18].getText().toString());

                    }
                    break;

                case R.id.btn19:
                    if (!btn[19].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[19].getText().toString());
                        fb.setValue(btn[19].getText().toString());

                    }
                    break;

                case R.id.btn20:
                    if (!btn[20].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[20].getText().toString());
                        fb.setValue(btn[20].getText().toString());

                    }
                    break;

                case R.id.btn21:
                    if (!btn[21].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[21].getText().toString());
                        fb.setValue(btn[21].getText().toString());


                    }
                    break;

                case R.id.btn22:
                    if (!btn[22].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[22].getText().toString());
                        fb.setValue(btn[22].getText().toString());


                    }
                    break;

                case R.id.btn23:
                    if (!btn[23].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[23].getText().toString());
                        fb.setValue(btn[23].getText().toString());

                    }
                    break;

                case R.id.btn24:
                    if (!btn[24].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[24].getText().toString());
                        fb.setValue(btn[24].getText().toString());


                    }
                    break;

                case R.id.btn25:
                    if (!btn[25].getText().toString().equals("*")) {
                        Firebase fb = url.child(btn[25].getText().toString());
                        fb.setValue(btn[25].getText().toString());
                    }
                    break;

                case R.id.reset:
                    for (i = 1; i <= idarray.length; i++) {
                        btn[i].setText("");
                        btn[i].setEnabled(true);
                    }
                    temp = 0;
                    count = 1;
                    b1.setText("B");
                    b2.setText("I");
                    b3.setText("N");
                    b4.setText("G");
                    b5.setText("O");
                    tempstatus=0;
                    play=0;
                    startstatus=1;

                    x1 = 1;
                    x2 = 1;
                    x3 = 1;
                    x4 = 1;
                    x5 = 1;
                    x6 = 1;
                    x7 = 1;
                    x8 = 1;
                    x9 = 1;
                    x10 = 1;
                    x11 = 1;
                    x12 = 1;
                    deletedb();
            }

    }

    public void deletedb() {
        DatabaseReference rmv = FirebaseDatabase.getInstance().getReference("btnvalue");
        rmv.removeValue();
    }

    public void result(){
        if (btn[1].getText().toString().equals("*") && btn[2].getText().toString().equals("*") && btn[3].getText().toString().equals("*") && btn[4].getText().toString().equals("*") && btn[5].getText().toString().equals("*") && x1 == 1) {
            x1 = 0;
            temp++;
        }


        if (btn[6].getText().toString().equals("*") && btn[7].getText().toString().equals("*") && btn[8].getText().toString().equals("*") && btn[9].getText().toString().equals("*") && btn[10].getText().toString().equals("*") && x2 == 1) {
            x2 = 0;
            temp++;
        }

        if (btn[11].getText().toString().equals("*") && btn[12].getText().toString().equals("*") && btn[13].getText().toString().equals("*") && btn[14].getText().toString().equals("*") && btn[15].getText().toString().equals("*") && x3 == 1) {
            x3 = 0;
            temp++;
        }

        if (btn[16].getText().toString().equals("*") && btn[17].getText().toString().equals("*") && btn[18].getText().toString().equals("*") && btn[19].getText().toString().equals("*") && btn[20].getText().toString().equals("*") && x4 == 1) {
            x4 = 0;
            temp++;
        }

        if (btn[21].getText().toString().equals("*") && btn[22].getText().toString().equals("*") && btn[23].getText().toString().equals("*") && btn[24].getText().toString().equals("*") && btn[25].getText().toString().equals("*") && x5 == 1) {
            x5 = 0;
            temp++;
        }

        if (btn[1].getText().toString().equals("*") && btn[6].getText().toString().equals("*") && btn[11].getText().toString().equals("*") && btn[16].getText().toString().equals("*") && btn[21].getText().toString().equals("*") && x6 == 1) {
            x6 = 0;
            temp++;
        }


        if (btn[2].getText().toString().equals("*") && btn[7].getText().toString().equals("*") && btn[12].getText().toString().equals("*") && btn[17].getText().toString().equals("*") && btn[22].getText().toString().equals("*") && x7 == 1) {
            x7 = 0;
            temp++;
        }

        if (btn[3].getText().toString().equals("*") && btn[8].getText().toString().equals("*") && btn[13].getText().toString().equals("*") && btn[18].getText().toString().equals("*") && btn[23].getText().toString().equals("*") && x8 == 1) {
            x8 = 0;
            temp++;
        }

        if (btn[4].getText().toString().equals("*") && btn[9].getText().toString().equals("*") && btn[14].getText().toString().equals("*") && btn[19].getText().toString().equals("*") && btn[24].getText().toString().equals("*") && x9 == 1) {
            x9 = 0;
            temp++;
        }

        if (btn[5].getText().toString().equals("*") && btn[10].getText().toString().equals("*") && btn[15].getText().toString().equals("*") && btn[20].getText().toString().equals("*") && btn[25].getText().toString().equals("*") && x10 == 1) {
            x10 = 0;
            temp++;
        }

        if (btn[1].getText().toString().equals("*") && btn[7].getText().toString().equals("*") && btn[13].getText().toString().equals("*") && btn[19].getText().toString().equals("*") && btn[25].getText().toString().equals("*") && x11 == 1) {
            x11 = 0;
            temp++;
        }

        if (btn[5].getText().toString().equals("*") && btn[9].getText().toString().equals("*") && btn[13].getText().toString().equals("*") && btn[17].getText().toString().equals("*") && btn[21].getText().toString().equals("*") && x12 == 1) {
            x12 = 0;
            temp++;
        }

        if (temp == 1)
            b1.setText("#");
        if (temp == 2) {
            b1.setText("#");
            b2.setText("#");
        }
        if (temp == 3) {
            b1.setText("#");
            b2.setText("#");
            b3.setText("#");
        }
        if (temp == 4) {
            b1.setText("#");
            b2.setText("#");
            b3.setText("#");
            b4.setText("#");
        }
        if (temp > 4) {
            b1.setText("#");
            b2.setText("#");
            b3.setText("#");
            b4.setText("#");
            b5.setText("#");
            Toast.makeText(this, "BINGO", Toast.LENGTH_SHORT).show();
            for(i=1;i<=idarray.length;i++)
                btn[i].setEnabled(false);
            tempstatus=1;

            Firebase fb1 = url.child("lost");
            fb1.setValue("lost");

        }



    }

    public void youlost()
    {
        if(count>25 && tempstatus==0 && play==1) {
            Toast.makeText(this, "You have lost", Toast.LENGTH_SHORT).show();
            count=0;
            for (i = 1; i <= idarray.length; i++)
                btn[i].setEnabled(false);
        }

    }

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting()))
                return true;
            else return false;
        }else return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to play BINGO. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }

    public void onBackPressed(){
        final AlertDialog.Builder builder1=new AlertDialog.Builder(MainActivity.this);
        builder1.setMessage("Are you sure want to exit?");
        builder1.setCancelable(true);
        builder1.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog=builder1.create();
        alertDialog.show();
    }
}