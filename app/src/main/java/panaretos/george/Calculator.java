package panaretos.george;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
    /** Called when the activity is first created. */	
	boolean dotflag=false;
	boolean errorflag=false;
	String sign="";
	Editable temp=null;
	String temp1;
	double number1=0;
	double number2=0;
	double result=0;
	String s1;
	Button zero;
	Button one;
	Button power;
	Button c;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six ;
	Button seven;
	Button eight;
	Button nine;
	Button equal;
	Button add;
	Button sub;
	Button div;
	Button multi;
	Button dot;
	EditText tx;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        power=(Button) findViewById(R.id.power);
        c=(Button) findViewById(R.id.c);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        multi=(Button) findViewById(R.id.multi);
        div=(Button) findViewById(R.id.div);
        dot=(Button) findViewById(R.id.dot);
        equal=(Button) findViewById(R.id.equal);
        nine=(Button) findViewById(R.id.nine);
        eight=(Button) findViewById(R.id.eight);
        seven=(Button) findViewById(R.id.seven);
        six=(Button) findViewById(R.id.six);
        five=(Button) findViewById(R.id.five);
        four=(Button) findViewById(R.id.four);
        three=(Button) findViewById(R.id.three);
        two=(Button) findViewById(R.id.two);
        one=(Button) findViewById(R.id.one);
        zero=(Button) findViewById(R.id.zero);
        tx=(EditText) findViewById(R.id.editText);
        
        power.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(c.isEnabled()){
				c.setEnabled(false);
				add.setEnabled(false);
				sub.setEnabled(false);
				multi.setEnabled(false);
				nine.setEnabled(false);
				eight.setEnabled(false);
				seven.setEnabled(false);
				six.setEnabled(false);
				five.setEnabled(false);
				four.setEnabled(false);
				three.setEnabled(false);
				two.setEnabled(false);
				one.setEnabled(false);
				zero.setEnabled(false);
				dot.setEnabled(false);
				equal.setEnabled(false);
				div.setEnabled(false);
				}
				else{
					c.setEnabled(true);
					add.setEnabled(true);
					sub.setEnabled(true);
					multi.setEnabled(true);
					nine.setEnabled(true);
					eight.setEnabled(true);
					seven.setEnabled(true);
					six.setEnabled(true);
					five.setEnabled(true);
					four.setEnabled(true);
					three.setEnabled(true);
					two.setEnabled(true);
					one.setEnabled(true);
					zero.setEnabled(true);
					dot.setEnabled(true);
					equal.setEnabled(true);
					div.setEnabled(true);
				}
				
				
			}
		});
        
        c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(null);		
			}
		});
        
        nine.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"9");		
			}
		});
        
        seven.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"7");		
			}
		});
        
        eight.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"8");		
			}
		});
        
        four.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"4");		
			}
		});
        
        five.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"5");		
			}
		});
        
        
        six.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"6");		
			}
		});
        
        one.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"1");		
			}
		});
        
        two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"2");		
			}
		});
        
        three.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"3");		
			}
		});
        
        zero.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tx.setText(tx.getText()+"0");		
			}
		});
        
        dot.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(dotflag==false){
		            tx.setText(tx.getText()+".");
		            dotflag=true;
		        }		
			}
		});
        
        add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				temp=tx.getText();
				temp1=String.valueOf(temp);
				number1=Double.valueOf(temp1);
				tx.setText(null);
				dotflag=false;			
		        sign="add";				
			}
		});
        
        
       sub.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				temp=tx.getText();
				temp1=String.valueOf(temp);
				number1=Double.valueOf(temp1);
				tx.setText(null);
				dotflag=false;			
		        sign="minus";				
			}
		}); 
        
       multi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				temp=tx.getText();
				temp1=String.valueOf(temp);
				number1=Double.valueOf(temp1);
				tx.setText(null);
				dotflag=false;			
		        sign="mul";				
			}
		});
       
       div.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				temp=tx.getText();
				temp1=String.valueOf(temp);
				number1=Double.valueOf(temp1);
				tx.setText(null);
				dotflag=false;			
		        sign="div";				
			}
		});
       
       
       equal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				temp=tx.getText();
				temp1=String.valueOf(temp);
				if (temp1.isEmpty()){
					if(number1==0)
		                tx.setText("0");
		            else if(number1!=0){
		                tx.setText(String.valueOf(number1));
		            }
				}
				else {
					number2= Double.valueOf(temp1);
		            if(sign.contentEquals("add")){
		            	result=number1+number2;
		            	tx.setText(String.valueOf(result));
		            }
		            else if(sign.contentEquals("minus")){ 
		            	result=number1-number2;
		            	tx.setText(String.valueOf(result));
		            }
		            else if(sign.contentEquals("mul")) {
		            	result=number1*number2;
		                tx.setText(String.valueOf(result));
				    }
		            else if(sign.contentEquals("div")){ 
		            	if(number2!=0){
		            		result=number1/number2;
		            		tx.setText(String.valueOf(result));
		            	}
		            	else if(number2==0)
		            		 s1="ERROR!!!!";
		            		 tx.setText(s1);
		            }
		        }
				
					
				
							
			}
		});
        
      
        
        
        
        
    }
}