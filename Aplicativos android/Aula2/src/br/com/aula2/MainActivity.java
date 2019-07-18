package br.com.aula2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity {

	TextView tv1;
	Button btenviar;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tv1 =(TextView)findViewById(R.id.tv1);        
        btenviar =(Button)findViewById(R.id.btenviar);
        
        
        btenviar.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
			
				tv1.setText("Olá Mundo!!!");
				
			}
        	
        	
        	
        	
        
    });


    }}

