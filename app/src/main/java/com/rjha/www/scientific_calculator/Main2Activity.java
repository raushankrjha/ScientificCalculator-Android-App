package com.rjha.www.scientific_calculator;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{
    EditText e1,e2;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bac,bequal,badd,bsub,bmult,be,bE,bdiv,bpercentage,bpowxy,bcancel,bsin,bcos,btan,bstd,binv,bln,bpow10x,bpowex,bsquare,bpie,bopenbracket,bclosebracket,blog,b00,bpoint,bsqrt;
    boolean madd,msub,mmult,mdiv,mE,mpowex,msquare,mper,mpowxy,msin;
    boolean doublebacktoexit=false;

    float mval1,mval2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b00=(Button)findViewById(R.id.button00);
        badd=(Button)findViewById(R.id.buttonadd);
        bsub=(Button)findViewById(R.id.buttonsub);
        bmult=(Button)findViewById(R.id.buttonmult);
        bdiv=(Button)findViewById(R.id.buttondiv);
        bequal=(Button)findViewById(R.id.buttonequal);
        bcancel=(Button)findViewById(R.id.buttoncancel);
        bac=(Button)findViewById(R.id.buttonac);
        bpercentage=(Button)findViewById(R.id.buttonpercent);
        bsin=(Button)findViewById(R.id.buttonsin);
        bcos=(Button)findViewById(R.id.buttoncos);

        btan=(Button)findViewById(R.id.buttontan);
        bstd=(Button)findViewById(R.id.buttonscientific);
        bpoint=(Button)findViewById(R.id.buttonpoint);
        bstd=(Button)findViewById(R.id.buttonstd);

        binv=(Button)findViewById(R.id.buttonsquare);
        bpie=(Button)findViewById(R.id.buttonpie);
        bclosebracket=(Button)findViewById(R.id.buttonclosebracket);
        bopenbracket=(Button)findViewById(R.id.buttonopenbracket);
        blog=(Button)findViewById(R.id.buttonlog);
        bsqrt=(Button)findViewById(R.id.buttonsqrt);
        bpowxy=(Button)findViewById(R.id.buttonpowxy);
        bln=(Button)findViewById(R.id.buttonln);
        be=(Button)findViewById(R.id.buttone);
        bE=(Button)findViewById(R.id.buttonE);
        bsquare=(Button)findViewById(R.id.buttonsquare);
        bpow10x=(Button)findViewById(R.id.button10x);
        bpowex=(Button)findViewById(R.id.buttonex);








        //listener
        bac.setOnClickListener(new View.OnClickListener()
        {
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

        //number input listener

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

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"sin");
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
        bpowex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+".");
            }
        });
        bpow10x.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            e1.setText(e1.getText()+"");
        }
    });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"");
            }
        });
        bpowxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"");
            }
        });
        bpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"");
            }
        });
        //operator listener

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
                if (e1 == null)
                {
                    e2.setText("");
                }else
                {
                    mval1=Float.parseFloat(e1.getText()+"");
                    mmult=true;
                    e1.setText(null);
                }

            }
        });
        bpowxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (e1 == null)
                {
                    e2.setText("");
                }else
                {
                    mval1=Float.parseFloat(e1.getText()+"");
                    mpowxy=true;
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
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                mval1=Float.parseFloat(e1.getText()+"");
                mE=true;
                e1.setText(null);
            }
        });
        bpowex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                mval1=Float.parseFloat(e1.getText()+"");
                mpowex=true;
                e1.setText(null);
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                mval1=Float.parseFloat(e1.getText()+"");
                msquare=true;
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


        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)

            {
                mval1=Float.parseFloat(e1.getText()+"");
                msin=true;
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
                else if(mmult==true)
                {
                    e1.setText("");
                    e2.setText(mval1*mval2+"");
                    mmult=false;
                }

                else if(mdiv==true)
                {
                    e1.setText("");
                    e2.setText(mval1/mval2+"");
                    mdiv=false;
                }
                else if(mpowxy==true)
                {
                    e1.setText("");
                    e2.setText(Math.pow(mval1,mval2)+"");
                    mpowxy=false;
                }

                else if(mE==true)
                {
                    e1.setText("");
                    e2.setText(Math.exp(mval1)+"");
                    mdiv=false;
                }
                else if(mper==true)
                {
                    e1.setText("");
                    e2.setText((mval1*mval2)/100+"");
                    mper=false;
                }
                else if(mper==true)
                {
                    e1.setText("");
                    e2.setText((mval1*mval2)/100+"");
                    mper=false;
                }


            }
        });


        //trigonometric function listener


        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e2.setText(Math.sin(mval1)+"");
                e1.setText("");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e2.setText(Math.cos(mval1)+"");
                e1.setText("");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e2.setText(Math.tan(mval1)+"");
                e1.setText("");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e2.setText(Math.log10(mval1)+"");
                e1.setText(null);
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e2.setText(Math.log(mval1)+"");
                e1.setText(null);
            }
        });




        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e1.setText("");
                e2.setText(Math.sqrt(mval1) + "");


            }
        });


        bpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
             e1.setText("3.14159");
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText("2.71828");
            }
        });


        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e1.setText(null);
                e2.setText(Math.pow(mval1,2)+"");


            }
        });

        bpow10x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e1.setText(null);
                e2.setText(Math.pow(10,mval1)+"");

            }
        });
        bpowex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e1.setText(null);
                e2.setText(Math.pow(2.71828,mval1)+"");

            }
        });
        bstd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               finish();
            }
        });
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mval1=Float.parseFloat(e1.getText()+"");
                e1.setText(null);
                e2.setText(Math.exp(mval1)+"");

            }
        });





        // hide soft input
        e1.setInputType(InputType.TYPE_NULL);
        e2.setInputType(InputType.TYPE_NULL);




    }


}
