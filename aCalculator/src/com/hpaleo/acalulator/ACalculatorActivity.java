package com.hpaleo.acalulator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.ConsoleMessage;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ACalculatorActivity extends Activity {
	private TextView txtFormula, txtValue;
	private EditText editFormula, editValue;
	private Button btnClear,btnDot, btnParentesisLeft, btnParentesisRight;
	private Button btnAdd, btnSub, btnDiv, btnMul, btnSign, btnEqual;
	private Button[] btnNumbers;
	private Toast message;
	
	private String value, formula;
	
	private double value1, value2, res;	
	private final int NULL = -1, ADD = 0, SUB = 1, DIV = 2, MUL = 3, SIGN = 4;
	private int operator;
	
	private void initVals() {
		// Text fields
		editFormula	= (EditText) findViewById(R.id.editFormula);
		editValue	= (EditText) findViewById(R.id.edtValue);
		
		//txtFormula	= (TextView) findViewById(R.id.txtFormula);
		//txtValue	= (TextView) findViewById(R.id.txtValue);			
		
		// Special function buttons
		btnClear			= (Button) findViewById(R.id.btnClear);
		btnDot				= (Button) findViewById(R.id.btnDot);
		btnParentesisLeft	= (Button) findViewById(R.id.btnParentesisLeft);
		btnParentesisRight	= (Button) findViewById(R.id.btnParentesisRight);
		
		// Operator function buttons
		btnAdd		= (Button) findViewById(R.id.btnAdd);
		btnSub		= (Button) findViewById(R.id.btnSub);
		btnMul		= (Button) findViewById(R.id.btnMul);
		btnDiv		= (Button) findViewById(R.id.btnDiv);
		btnSign		= (Button) findViewById(R.id.btnSign);
		btnEqual	= (Button) findViewById(R.id.btnEqual);
		
		btnNumbers = new Button[10];
		btnNumbers[0]	= (Button) findViewById(R.id.btn0);
		btnNumbers[1]	= (Button) findViewById(R.id.btn1);
		btnNumbers[2]	= (Button) findViewById(R.id.btn2);
		btnNumbers[3]	= (Button) findViewById(R.id.btn3);
		btnNumbers[4]	= (Button) findViewById(R.id.btn4);
		btnNumbers[5]	= (Button) findViewById(R.id.btn5);
		btnNumbers[6]	= (Button) findViewById(R.id.btn6);
		btnNumbers[7]	= (Button) findViewById(R.id.btn7);
		btnNumbers[8]	= (Button) findViewById(R.id.btn8);
		btnNumbers[9]	= (Button) findViewById(R.id.btn9);
		
		value = formula = "";
		
		// Mensaje usando objeto toast
		message = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
		
		value1 = value2 = 0;
		operator = ADD;
	}
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        initVals();	// Initialize variables
        
        // Set event click for clear button
        btnClear.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		editFormula.setText("");
        		editValue.setText("0");
        		editValue.setSelection(editValue.length());
        		setOperation(NULL);
        	}
        });
        
        // Set event click for number buttons
        for (int i = 0; i < btnNumbers.length; i++) {
        	final int ii = i;
        	btnNumbers[i].setOnClickListener(new OnClickListener() {
        		public void onClick(View v) {
        			// Verify if current value on EditValue object is "0"
        			if (editValue.getText().toString().equals("0")) {
        				// Verify if pressed button was "0" 
        				if (btnNumbers[ii].getText().toString().equals("0")) {
        					return;	// Exit operation 'cause we are clicking "0" when there's alredy a "0"
        				}
        				
        				editValue.setText(btnNumbers[ii].getText().toString());	// Replace content of EditValue
        				editValue.setSelection(editValue.length());				// Set selection at the last position of EditValue
        				//editFormula.setText(editValue.getText().toString());	// Set content of EditFormula by the same content of EditValue
        				return;													// Exit operation 
        			}
        			
        			if (editFormula.length() > 0 && !editValue.getText().toString().equals("0")) {
        				editValue.setText(btnNumbers[ii].getText().toString());	// Replace content of EditValue
        				editValue.setSelection(editValue.length());				// Set selection at the last position of EditValue
        				return;
        			}
        			// When there's alredy another value on EditValue
        			
        			editValue.setText(editValue.getText().toString() + btnNumbers[ii].getText());
        			editValue.setSelection(editValue.length());
        			//editFormula.setText(editFormula.getText().toString() + btnNumbers[ii].getText().toString());
        		}
        	});
        }  
        
        btnAdd.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				operator = ADD;
				
				if (editValue.getText().toString().equals("0")) {
					value1 = 0;
					editFormula.setText("0 + ");
					return;
				}
				
				if (editFormula.length() == 0) {
					value1 = Double.parseDouble(editValue.getText().toString());	// Set value1 to the value into EditVal
					editFormula.setText(editValue.getText().toString() + " + ");	// Set content of EditFormula by the same content of EditValue
					//editValue.setText("0");											// Reset content of EditValue
					editValue.setSelection(editValue.length());						// Set selection at the last position of EditValue
					return;															// Exit operation
				}
								
				value1 += Double.parseDouble(editValue.getText().toString());
				editFormula.setText(editFormula.getText().toString() + editValue.getText().toString() + " + ");
				editValue.setText(value1 + "");
				editValue.setSelection(editValue.length());
				
				/*if (editValue.getText().toString().equals("0")) {
					return;
				}*/
				
				/*if (editValue.getText().equals("0")) {
					message.setText("Type a value before an operation");
					message.show();
					return;
				}
				
				if (editValue.length() > 0) {
					value1 += Double.parseDouble(editValue.getText().toString());
					editFormula.setText(editValue.getText().toString() + " + ");
					editValue.setText("");					
					return;
				}*/
			}     	
        });
        
        btnEqual.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		value2 = Double.parseDouble(editValue.getText().toString());
        		
        		if (operator == ADD) {
        			res = value1 + value2;
        		}
        		
        		editFormula.setText(res + "");
        	}
        });
    }
    
    private void setOperation(int operator) {
    	this.operator = operator;
    }
}