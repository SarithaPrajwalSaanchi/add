package com.example.add;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText x,y;
    private Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        x=(EditText)findViewById(R.id.number1);
        y=(EditText)findViewById(R.id.number2);
        buttonSum=(Button)findViewById(R.id.button);
        buttonSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String a=x.getText().toString();
                String b=y.getText().toString();
                int n1=Integer.parseInt(a);
                int n2=Integer.parseInt(b);
                int sum=n1+n2;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

            }

        });
    }
}