package com.example.tipcalculator;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

@SuppressLint("DefaultLocale") 
	
public class MainActivity extends Activity {
	private EditText outputField;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputField = (EditText)findViewById(R.id.editTextOutput);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    

    public void onTenPercentTip(View view) {
    	String tipStr = String.format("%.2f", getCurrentAmount()*0.1);
    	outputField.setText("$" + tipStr);
    }

    public void onFifteenPercentTip(View view) {
    	String tipStr = String.format("%.2f", getCurrentAmount()*0.15);
    	outputField.setText("$" + tipStr);
    }

    public void onTwentyPercentTip(View view) {
    	String tipStr = String.format("%.2f", getCurrentAmount()*0.2);
    	outputField.setText("$" + tipStr);
    }

    
    public double getCurrentAmount() {
    	EditText inputField = (EditText)findViewById(R.id.editTextInput);
    	if (inputField.getText().toString().isEmpty()) {
    		return 0;
    	}
    	return Double.parseDouble(inputField.getText().toString());
    }
}
