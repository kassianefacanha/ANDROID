package br.com.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.View;

public class Main extends Activity {

	EditText etnum1;
	EditText etnum2;
	EditText soma;
	Button somaa;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etnum1 =(EditText)findViewById(R.id.etnum1);
        etnum2 =(EditText)findViewById(R.id.etnum2);
        soma =(EditText)findViewById(R.id.soma);
       somaa =(Button)findViewById(R.id.somaa);
        
        
        soma.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
			
				Double n1,n2,result;
				
				n1 = Double.parseDouble(etnum1.getText().toString());
				n2 = Double.parseDouble(etnum2.getText().toString());
				
				result = n1 + n2;
				
				soma.setText("Resultado da soma ----> " +String.valueOf(result));
				
			}
        	
        	
        	
        	
        
    });


    }}

