package com.example.classassignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int leftNo = 0,rightNo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView leftTextView = (TextView) findViewById(R.id.left_button_layout);
        TextView rightTextView = (TextView) findViewById(R.id.right_button_layout);
        Random random = new Random();
        leftNo = random.nextInt(10);
        rightNo = random.nextInt(10);
        leftTextView.setText("" +leftNo);
        rightTextView.setText(""+rightNo);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.ans_layout);
        quantityTextView.setText("" + number);
    }

    public void LeftButtonCheck(View view){
        TextView result = (TextView) findViewById(R.id.result_layout);
        if (leftNo>rightNo){
            result.setText("You are correct!");
        }
        else if(leftNo<rightNo){
            result.setText("You are wrong!");
        }
        else {
            result.setText("Equal");
        }

    }

    public void refresh(View view){
        TextView leftTextView = (TextView) findViewById(R.id.left_button_layout);
        TextView rightTextView = (TextView) findViewById(R.id.right_button_layout);
        Random random = new Random();
        leftNo = random.nextInt(10);
        rightNo = random.nextInt(10);
        leftTextView.setText("" +leftNo);
        rightTextView.setText(""+rightNo);
    }

    public void RightButtonCheck(View view){
        TextView result = (TextView) findViewById(R.id.result_layout);
        if (leftNo<rightNo){
            result.setText("You are correct!");
        }
        else if(leftNo>rightNo){
            result.setText("You are wrong!");
        }
        else {
            result.setText("Equal");
        }

    }

}
