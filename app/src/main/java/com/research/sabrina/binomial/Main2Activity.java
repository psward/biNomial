package com.research.sabrina.binomial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    Intent intent = getIntent();

    boolean [] ba = intent.getBooleanArrayExtra("ba");
    TextView textView0 = (TextView) findViewById(R.id.nc0);
    textView0.setText(Boolean.toString(ba[0]));
    TextView textView1 = (TextView) findViewById(R.id.nc1);
    textView1.setText(Boolean.toString(ba[1]));
    TextView textView2 = (TextView) findViewById(R.id.nc2);
    textView2.setText(Boolean.toString(ba[2]));
    TextView textView3 = (TextView) findViewById(R.id.nc3);
    textView3.setText(Boolean.toString(ba[3]));
    TextView textView4 = (TextView) findViewById(R.id.nc4);
    textView4.setText(Boolean.toString(ba[4]));
    TextView textView5 = (TextView) findViewById(R.id.nc5);
    textView5.setText(Boolean.toString(ba[5]));
    TextView textView6 = (TextView) findViewById(R.id.nc6);
    textView6.setText(Boolean.toString(ba[6]));
    TextView textView7 = (TextView) findViewById(R.id.nc7);
    textView7.setText(Boolean.toString(ba[7]));
    TextView textView8 = (TextView) findViewById(R.id.nc8);
    textView8.setText(Boolean.toString(ba[8]));
    TextView textView9 = (TextView) findViewById(R.id.nc9);
    textView9.setText(Boolean.toString(ba[9]));

    int [] n1 = intent.getIntArrayExtra("n1");
    TextView n10 = (TextView) findViewById(R.id.n10);
    n10.setText(Integer.toString(n1[0]));
    TextView n11 = (TextView) findViewById(R.id.n11);
    n11.setText(Integer.toString(n1[1]));
    TextView n12 = (TextView) findViewById(R.id.n12);
    n12.setText(Integer.toString(n1[2]));
    TextView n13 = (TextView) findViewById(R.id.n13);
    n13.setText(Integer.toString(n1[3]));
    TextView n14 = (TextView) findViewById(R.id.n14);
    n14.setText(Integer.toString(n1[4]));
    TextView n15 = (TextView) findViewById(R.id.n15);
    n15.setText(Integer.toString(n1[5]));
    TextView n16 = (TextView) findViewById(R.id.n16);
    n16.setText(Integer.toString(n1[6]));
    TextView n17 = (TextView) findViewById(R.id.n17);
    n17.setText(Integer.toString(n1[7]));
    TextView n18 = (TextView) findViewById(R.id.n18);
    n18.setText(Integer.toString(n1[8]));
    TextView n19 = (TextView) findViewById(R.id.n19);
    n19.setText(Integer.toString(n1[9]));


    int [] n2 = intent.getIntArrayExtra("n2");
    TextView n20 = (TextView) findViewById(R.id.n20);
    n20.setText(Integer.toString(n2[0]));
    TextView n21 = (TextView) findViewById(R.id.n21);
    n21.setText(Integer.toString(n2[1]));
    TextView n22 = (TextView) findViewById(R.id.n22);
    n22.setText(Integer.toString(n2[2]));
    TextView n23 = (TextView) findViewById(R.id.n23);
    n23.setText(Integer.toString(n2[3]));
    TextView n24 = (TextView) findViewById(R.id.n24);
    n24.setText(Integer.toString(n2[4]));
    TextView n25 = (TextView) findViewById(R.id.n25);
    n25.setText(Integer.toString(n2[5]));
    TextView n26 = (TextView) findViewById(R.id.n26);
    n26.setText(Integer.toString(n2[6]));
    TextView n27 = (TextView) findViewById(R.id.n27);
    n27.setText(Integer.toString(n2[7]));
    TextView n28 = (TextView) findViewById(R.id.n28);
    n28.setText(Integer.toString(n2[8]));
    TextView n29 = (TextView) findViewById(R.id.n29);
    n29.setText(Integer.toString(n2[9]));

    long [] timer = intent.getLongArrayExtra("timer");
    TextView timer0 = (TextView) findViewById(R.id.timer0);
    timer0.setText(Long.toString(timer[0]));
    TextView timer1 = (TextView) findViewById(R.id.timer1);
    timer1.setText(Long.toString(timer[1]));
    TextView timer2 = (TextView) findViewById(R.id.timer2);
    timer2.setText(Long.toString(timer[2]));
    TextView timer3 = (TextView) findViewById(R.id.timer3);
    timer3.setText(Long.toString(timer[3]));
    TextView timer4 = (TextView) findViewById(R.id.timer4);
    timer4.setText(Long.toString(timer[4]));
    TextView timer5 = (TextView) findViewById(R.id.timer5);
    timer5.setText(Long.toString(timer[5]));
    TextView timer6 = (TextView) findViewById(R.id.timer6);
    timer6.setText(Long.toString(timer[6]));
    TextView timer7 = (TextView) findViewById(R.id.timer7);
    timer7.setText(Long.toString(timer[7]));
    TextView timer8 = (TextView) findViewById(R.id.timer8);
    timer8.setText(Long.toString(timer[8]));
    TextView timer9 = (TextView) findViewById(R.id.timer9);
    timer9.setText(Long.toString(timer[9]));

  }

}
