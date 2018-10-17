package com.rjha.www.scientific_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;


public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bac, bequal, badd, bsub, bmult, bdiv, bpercentage, bcancel, bopenbracket, bclosebracket, bab,bsc,b00, bpoint;
    boolean madd, msub, mmul, mdiv, mper;
    float mval1, mval2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.ed1);
        e2=(EditText)findViewById(R.id.ed2);
        b2=(Button)findViewById(R.id.button2);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b00=(Button)findViewById(R.id.button00);
        badd=(Button)findViewById(R.id.buttonsum);
        bsub=(Button)findViewById(R.id.buttonsub);
        bmult=(Button)findViewById(R.id.buttonmult);
        bdiv=(Button)findViewById(R.id.buttondiv);
        bpercentage=(Button)findViewById(R.id.buttonpercent);
        bpoint=(Button)findViewById(R.id.buttonpoint);
        bab=(Button)findViewById(R.id.buttonabout);
        bcancel=(Button)findViewById(R.id.buttoncancel);
        bac=(Button)findViewById(R.id.buttonac);
        bclosebracket=(Button)findViewById(R.id.buttonclosebracket);
        bopenbracket=(Button)findViewById(R.id.buttonopenbracket);
        bequal=(Button)findViewById(R.id.buttonequal);
        bsc=(Button)findViewById(R.id.buttonscientific);
        bab=(Button)findViewById(R.id.buttonabout);




        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"0");


            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText("2");
                e1.getText();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"9");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"00");
            }
        });
        bopenbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"(");
            }
        });
        bclosebracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+")");
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (e1 == null)
                {
                    e2.setText("");
                }else
                {
                    mval1=Float.parseFloat(e1.getText()+"");
                    madd=true;
                    e1.setText(null);
                }

            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e2.setText("");
                }else {
                    mval1 = Float.parseFloat(e1.getText() + "");
                    msub = true;
                    e1.setText(null);
                }

            }
        });
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e2.setText("");
                }
                else
                {
                    mval1=Float.parseFloat(e1.getText()+"");
                    mmul=true;
                    e1.setText(null);
                }

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                mval1=Float.parseFloat(e1.getText()+"");
                mdiv=true;
                e1.setText(null);
            }
        });
        bpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                mper=true;
                e1.setText(null);

            }
        });



        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval2=Float.parseFloat(e1.getText()+"");
                if(madd==true)
                {
                    e1.setText("");
                    e2.setText(mval1+mval2+"");
                    madd=false;
                }
                else if(msub==true)
                {
                    e1.setText("");
                    e2.setText(mval1-mval2+"");
                    msub=false;
                }
                else if(mmul==true)
                {
                    e1.setText("");
                    e2.setText(mval1*mval2+"");
                    mmul=false;
                }

                else if(mdiv==true)
                {
                    e1.setText("");
                    e2.setText(mval1/mval2+"");
                    mdiv=false;
                }
                else if(mper==true)
                {

                    char ch='a';
                    e1.setText(null);
                    e2.setText((mval1*mval2)/100+"");
                    mper=false;
                }
            }
        });


        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                e1.setText(null);
                e2.setText(null);

            }
        });

        bcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String enterInput=e1.getText().toString();
                if(enterInput.length()>0)
                {
                    enterInput=enterInput.substring(0,enterInput.length()-1);
                    e1.setText(enterInput);

                }


            }
        });
        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

            }
        });
        bab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });


        //hide soft keyboard

        e1.setInputType(InputType.TYPE_NULL);
        e2.setInputType(InputType.TYPE_NULL);








    }
}
