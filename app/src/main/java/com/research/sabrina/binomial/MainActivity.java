package com.research.sabrina.binomial;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {
  private TextView randInt1;
  private TextView randInt2;
  private Button selectRand1;
  private Button selectRand2;
  private Button beginTest;

  boolean[] ba = new boolean[10];
  int[] n1 = new int[10];
  int[] n2 = new int[10];
  long tStart;
  long tEnd;
  long[] timer = new long[10];
  int counter = 0;

  private static final Random rand = new Random();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);

    beginTest = (Button) findViewById(R.id.button3);
    randInt1 = (TextView) findViewById(R.id.textView);
    randInt2 = (TextView) findViewById(R.id.textView2);
    selectRand1 = (Button) findViewById(R.id.button);
    selectRand2 = (Button) findViewById(R.id.button2);

    beginTest.setOnClickListener(new View.OnClickListener(){
      public void onClick(View v) {
        int randIntL = rand.nextInt(2000000 - 1000000) + 1000000;
        int randIntR = rand.nextInt(2000000 - 1000000) + 1000000;
        n1[0] = randIntL;
        n2[0] = randIntR;
        counter = 0;
        randInt1.setText(String.valueOf(randIntL));
        randInt2.setText(String.valueOf(randIntR));
        tStart = System.currentTimeMillis();
      }
    });

    selectRand1.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        timer[counter] = tDelta;
        tStart = System.currentTimeMillis();
        int ri1 = Integer.valueOf(randInt1.getText().toString());
        int ri2 = Integer.valueOf(randInt2.getText().toString());
        if(ri1 > ri2){
          ba[counter] = true;
        } else {
          ba[counter] = false;
        }
        int randIntL = rand.nextInt(2000000 - 1000000) + 1000000;
        int randIntR = rand.nextInt(2000000 - 1000000) + 1000000;
        randInt1.setText(String.valueOf(randIntL));
        randInt2.setText(String.valueOf(randIntR));
        System.out.println(ba[counter]);
        if(counter < 9) {
          n1[counter + 1] = randIntL;
          n2[counter + 1] = randIntR;
        }
        counter++;
        if(counter == 10){
          myIntent.putExtra("ba", ba);
          myIntent.putExtra("n1", n1);
          myIntent.putExtra("n2", n2);
          myIntent.putExtra("timer", timer);
          MainActivity.this.startActivity(myIntent);
        }
      }
    });
    selectRand2.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        timer[counter] = tDelta;
        tStart = System.currentTimeMillis();
        int ri1 = Integer.valueOf(randInt1.getText().toString());
        int ri2 = Integer.valueOf(randInt2.getText().toString());
        if(ri2 > ri1){
          ba[counter] = true;
        } else {
          ba[counter] = false;
        }
        int randIntL = rand.nextInt(2000000 - 1000000) + 1000000;
        int randIntR = rand.nextInt(2000000 - 1000000) + 1000000;
        randInt1.setText(String.valueOf(randIntL));
        randInt2.setText(String.valueOf(randIntR));
        System.out.println(ba[counter]);
        if(counter < 9) {
          n1[counter + 1] = randIntL;
          n2[counter + 1] = randIntR;
        }
        counter++;
        if(counter == 10){
          myIntent.putExtra("ba", ba);
          myIntent.putExtra("n1", n1);
          myIntent.putExtra("n2", n2);
          myIntent.putExtra("timer", timer);
          MainActivity.this.startActivity(myIntent);
        }
      }
    });
  }
}
