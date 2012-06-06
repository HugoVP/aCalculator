package com.CalculadoraGersain;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CalculadoraGersainActivity extends Activity {
    /** Called when the activity is first created. */
	
	
	Button boton1,boton2, boton3,boton4,boton5,boton6,boton7,
			boton8,boton9,boton0,botonborrar,botonpunto,
			botonresta,botonmultiplicar,botonsuma,botondivision,botonigual,clear;
	
	Toast mensaje;
	
	EditText texto;
	boolean bandera = false;
	String cadenatexto="",aux="";
	
	float resultadoint=0;
	float auxiliarint=0;
	
	char operador='0';
	
    //@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        boton0 = (Button) findViewById(R.id.btn0);
        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton3 = (Button) findViewById(R.id.btn3);
        boton4 = (Button) findViewById(R.id.btn4);
        boton5 = (Button) findViewById(R.id.btn5);
        boton6 = (Button) findViewById(R.id.btn6);
        boton7 = (Button) findViewById(R.id.btn7);
        boton8 = (Button) findViewById(R.id.btn8);
        boton9 = (Button) findViewById(R.id.btn9);
        clear =  (Button) findViewById(R.id.clear);
       
        
        botonsuma = (Button) findViewById(R.id.btnsum);
        botonresta = (Button) findViewById(R.id.btnmenos);
        botonmultiplicar = (Button) findViewById(R.id.btnmul);
        botondivision = (Button) findViewById(R.id.btndivision);
        
        botonborrar = (Button) findViewById(R.id.btnborrar);
        botonpunto = (Button) findViewById(R.id.btnpunto);
        botonigual = (Button) findViewById(R.id.btnigual);
        
        texto = (EditText) findViewById(R.id.texto);
        texto.setText("");
        
        clear.setOnClickListener(new OnClickListener() {
			
			//@Override
			public void onClick(View v) {
				cadenatexto="";
				texto.setText(cadenatexto);
				operador='0';
				aux="";
				auxiliarint=0;
				resultadoint=0;
				bandera = false;
			}
		});
        
        boton0.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=0;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton1.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=1;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton2.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=2;
				texto.setText(cadenatexto);	
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton3.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=3;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton4.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=4;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton5.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=5;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton6.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=6;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton7.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=7;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton8.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=8;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        boton9.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(cadenatexto=="")
				{
					texto.setText(cadenatexto);
				}
				if(operador!='0' && bandera == false)
				{
					texto.setText("");
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					bandera =true;
				}
				cadenatexto+=9;
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});

        botonsuma.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				
				if(!verificarOp(aux))
				{
					String auxiliar="";
					int tamanio = aux.length();
					
					for(int i=0;i<aux.length();i++)
					auxiliar += aux.charAt(i);
					
					if(auxiliarint==0)
					{
						auxiliarint = Float.parseFloat(auxiliar);
						operador='+';
					}
					else
					{
						botonigual.performClick();
						botonsuma.performClick();
					}
					
					//mensaje = Toast.makeText(getApplicationContext(), auxiliarint+" "+operador, Toast.LENGTH_SHORT);
					//mensaje.show();
					cadenatexto="";
				}
				
				texto.setSelection(texto.length());
			}
		});
        
        botonresta.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				
				if(!verificarOp(aux))
				{
					String auxiliar="";
					int tamanio = aux.length();
					
					for(int i=0;i<aux.length();i++)
					auxiliar += aux.charAt(i);
					
					if(auxiliarint==0)
					{
						auxiliarint = Float.parseFloat(auxiliar);
						operador='-';
					}
					else
					{
						botonigual.performClick();
						botonresta.performClick();
					}
						
					//mensaje = Toast.makeText(getApplicationContext(), auxiliarint+" "+operador, Toast.LENGTH_SHORT);
					//mensaje.show();
					cadenatexto="";
				}
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        botonmultiplicar.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				
				if(!verificarOp(aux))
				{
					String auxiliar="";
					int tamanio = aux.length();
					
					for(int i=0;i<aux.length();i++)
					auxiliar += aux.charAt(i);
					
					if(auxiliarint==0)
					{
						auxiliarint = Float.parseFloat(auxiliar);
						operador='*';
					}
					else
					{
						botonigual.performClick();
						botonmultiplicar.performClick();
					}
					
					//mensaje = Toast.makeText(getApplicationContext(), auxiliarint+" "+operador, Toast.LENGTH_SHORT);
					//mensaje.show();
					cadenatexto="";
					
					
					
				}
				
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        botondivision.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(!verificarOp(aux))
				{
					String auxiliar="";
					int tamanio = aux.length();
					
					for(int i=0;i<aux.length();i++)
					auxiliar += aux.charAt(i);
					
					if(auxiliarint==0)
					{
						auxiliarint = Float.parseFloat(auxiliar);
						operador='/';
					}
					else
					{
						botonigual.performClick();
						botondivision.performClick();
					}
					
					//mensaje = Toast.makeText(getApplicationContext(), auxiliarint+" "+operador, Toast.LENGTH_SHORT);
					//mensaje.show();
					cadenatexto="";				
				}

				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        botonpunto.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				if(!verificarPunto(aux))
				{
					cadenatexto+=".";
				}
				
				texto.setText(cadenatexto);
				aux=texto.getText().toString();
				texto.setSelection(texto.length());
			}
		});
        
        
        botonborrar.setOnClickListener(new OnClickListener() 
        {
			public void onClick(View arg0) 
			{
				String borrar= "";
				for(int i=0;i<aux.length();i++)
				{
					borrar = aux.substring(0, aux.length()-1);
				}
				
				texto.setText(borrar+"");
				aux=texto.getText().toString();
				cadenatexto = aux;
				texto.setSelection(texto.length());
				
			}
		});

        
        
        botonigual.setOnClickListener(new OnClickListener() 
        {
        	
			public void onClick(View arg0) 
			{
				
				String auxiliar="";
				int tamanio = aux.length();
				
				for(int i=0;i<aux.length();i++)
				auxiliar += aux.charAt(i);
				
				resultadoint = Float.parseFloat(auxiliar);
				
				mensaje = Toast.makeText(getApplicationContext(), auxiliarint+" "+operador+" "+resultadoint, Toast.LENGTH_SHORT);
				mensaje.show();
				
				if(operador=='+')
				{
					resultadoint = auxiliarint + resultadoint;
					
					cadenatexto=resultadoint+"";
				
					texto.setText(cadenatexto);
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					operador='0';
					auxiliarint = 0;
					resultadoint=0;
					bandera = false;
					
				}
				
				if(operador=='-')
				{
					resultadoint = auxiliarint - resultadoint;
					
					cadenatexto=resultadoint+"";
				
					texto.setText(cadenatexto);
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					operador='0';
					auxiliarint = 0;
					resultadoint=0;
					bandera = false;
				}
				
				if(operador=='*')
				{
					resultadoint = auxiliarint * resultadoint;
					
					cadenatexto=resultadoint+"";
				
					texto.setText(cadenatexto);
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					operador='0';
					auxiliarint = 0;
					resultadoint=0;
					bandera = false;
				}
				
				if(operador=='/')
				{
					resultadoint = auxiliarint / resultadoint;
					
					cadenatexto=resultadoint+"";
				
					texto.setText(cadenatexto);
					aux=texto.getText().toString();
					texto.setSelection(texto.length());
					operador='0';
					auxiliarint = 0;
					resultadoint=0;
					bandera = false;
				}				
				cadenatexto="";	
			}
		});    
    }

    public boolean verificarOp(String resul)
    {
    	int tamanio = resul.length();
    	tamanio--;
    	
		try{
			if(resul.charAt(tamanio)=='x' || resul.charAt(tamanio)=='+' || resul.charAt(tamanio)=='-' || resul.charAt(tamanio)=='/')
			{
				if(tamanio>=1)
		    	{
					mensaje = Toast.makeText(getApplicationContext(), "Error dos operaciones juntas!", Toast.LENGTH_SHORT);
					mensaje.show();
		    	}
				return true;
			}
			else
			{
				return false;
			}
		}catch(Exception e)
		{
			mensaje = Toast.makeText(getApplicationContext(), "No puede empezar con operacion", Toast.LENGTH_SHORT);
    		mensaje.show();
			return true;
		}

    }
    
    public boolean realizarOp(String resul)
    {
    	
    	int tamanio = resul.length();
    	tamanio--;
    	
    	if(resul.charAt(tamanio)=='.' || resul.charAt(tamanio)==verificarFinal(resul))
    	{
    		mensaje = Toast.makeText(getApplicationContext(), "No esta completa", Toast.LENGTH_SHORT);
    		mensaje.show();
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
    
    public char verificarFinal(String cadena)
    {
    	int tamanio = cadena.length();
    	tamanio--;
    	
    	if(cadena.charAt(tamanio)=='x' || cadena.charAt(tamanio)=='+' || cadena.charAt(tamanio)=='-' || cadena.charAt(tamanio)=='/')
    	return cadena.charAt(tamanio);
    	else    	
    	return '1';
    }
    
    public boolean verificarPunto(String resul)
    {
    	
    	int tamanio = resul.length();
    	tamanio--;
    	int indicador = 0;
    	
    	try{
			if(resul.charAt(tamanio)=='.')
			{
				if(tamanio>=1)
		    	{
					mensaje = Toast.makeText(getApplicationContext(), "Error dos puntos seguidos", Toast.LENGTH_SHORT);
					mensaje.show();
		    	}
				return true;
			}
			else
			{
				
				for(int i=0;i<resul.length();i++)
				{
					if(resul.charAt(i)=='.')
					{
						indicador++;
					}
					
				}
				if(indicador>=1)
					return true;
				else 
					return false;
			}
		}catch(Exception e)
		{
			cadenatexto+="0.";
			return true;
		}

    }
    
}