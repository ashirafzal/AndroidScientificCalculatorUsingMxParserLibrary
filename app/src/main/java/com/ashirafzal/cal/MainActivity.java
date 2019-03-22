package com.ashirafzal.cal;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    /*****************
                         ***************** Created by Ashir Afzal *****************
                         ***************** Dated : 15-March-2019 ******************
                ****************** EmailAddress : ashirafzal96@gmail.com ******************
                ********************* WhatsApp Contact : +923423351437 *********************
     ***************/

    String processor;
    TextView tvExpression,tvResult;
    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,
            btnClear,btnDecimal,btnAdd,btnMinus,btnMultiply,btnDivide,btnEqual,btnPower,
            btnBack,btnDoubleZero,btnOpenBracket,btnCloseBracket,btnPie,btnTg,btnRad,btnTan,
            btnLn,btnExp,btnLog2,btnLog10,btnCsc,btnCot,btnSec,btnCosec,btnFactorial,btnSin,btnCos,
            btnShift,btnDeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                            /**** TV Screens ****/

        tvExpression = findViewById(R.id.tvExpression);
        tvResult = findViewById(R.id.tvResult);

                            /**** Special operators and Functions ****/

        btnOpenBracket = findViewById(R.id.btnOpenBracket);
        btnCloseBracket = findViewById(R.id.btnCloseBracket);
        btnPie = findViewById(R.id.btnPie);
        btnTg = findViewById(R.id.btnTg);
        btnRad = findViewById(R.id.btnRad);
        btnTan = findViewById(R.id.btnTan);
        btnLn = findViewById(R.id.btnLn);
        btnExp = findViewById(R.id.btnExp);
        btnLog2 = findViewById(R.id.btnLog2);
        btnLog10 = findViewById(R.id.btnLog10);
        btnCsc = findViewById(R.id.btnCsc);
        btnCot = findViewById(R.id.btnCot);
        btnSec = findViewById(R.id.btnSec);
        btnCosec = findViewById(R.id.btnCosec);
        btnFactorial = findViewById(R.id.btnFactorial);
        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnShift = findViewById(R.id.btnShift);
        btnDeg = findViewById(R.id.btnDeg);

                            /**** Number buttons and common operators ****/

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnClear = findViewById(R.id.btnClear);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnBack = findViewById(R.id.btnBack);
        btnDoubleZero = findViewById(R.id.btnDoubleZero);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnEqual = findViewById(R.id.btnEqual);
        btnPower = findViewById(R.id.btnPower);
        btnDivide = findViewById(R.id.btnDivide);


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();

                btnCos.setText(" cos");
                btnSin.setText("sin");
                btnTan.setText("tan");
                btnCsc.setText("csc");
                btnCot.setText("cot");
                btnCosec.setText("cosec");
                btnSec.setText("sec");
                btnTg.setText("tg");

                btnCos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cos");
                    }
                });

                btnSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sin");
                    }
                });
                btnTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tan");
                    }
                });
                btnCsc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("csc");
                    }
                });

                btnCot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cot");
                    }
                });

                btnSec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sec");
                    }
                });

                btnCosec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cosec");
                    }
                });
                btnTg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tg");
                    }
                });
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnCos.setText(" cos");
                btnSin.setText("sin");
                btnTan.setText("tan");
                btnCsc.setText("csc");
                btnCot.setText("cot");
                btnCosec.setText("cosec");
                btnSec.setText("sec");
                btnTg.setText("tg");

                btnCos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cos");
                    }
                });

                btnSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sin");
                    }
                });
                btnTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tan");
                    }
                });
                btnCsc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("csc");
                    }
                });

                btnCot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cot");
                    }
                });

                btnSec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sec");
                    }
                });

                btnCosec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cosec");
                    }
                });
                btnTg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tg");
                    }
                });

                String expression = tvExpression.getText().toString();

                expression = expression.replaceAll("X","*");
                expression = expression.replaceAll("cos-1","cosh");
                expression = expression.replaceAll("sin-1","sinh");
                expression = expression.replaceAll("tan-1","tanh");
                expression = expression.replaceAll("csc-1","csch");
                expression = expression.replaceAll("cot-1","coth");
                expression = expression.replaceAll("cosec-1","cosech");
                expression = expression.replaceAll("sec-1","sech");
                expression = expression.replaceAll("tg-1","tgh");

                try{

                    Expression e = new Expression(expression);
                    String result = String.valueOf(e.calculate());

                    if(result.substring(result.length() - 2).equals(".0")){
                        result = result.substring(0, result.length()-2);
                    }

                    if(result == "NaN"){
                        tvExpression.setText("SYNTAX ERROR");
                        tvResult.setText("");
                    }else{
                        tvResult.setText(result);
                    }

                    if(expression == ""){
                        tvExpression.setText("");
                        tvResult.setText("");
                    }

                }catch (Exception ex){

                    tvExpression.setText("SYNTAX ERROR");
                    tvResult.setText("");

                }
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("X");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });

        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("^");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(".");
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    processor = tvExpression.getText().toString();
                    processor = processor.substring(0 , processor.length()-1);
                    tvExpression.setText(processor);

                }catch (Exception e){
                    tvExpression.setText("");
                }
            }
        });


        btnDoubleZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("00");
            }
        });

                    /****** Special characters and functions buttons Coding *****/

        btnOpenBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("(");
            }
        });

        btnCloseBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(")");
            }
        });


        btnPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("Pi");
            }
        });

        btnTg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("tg");
            }
        });

        btnRad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("rad");
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("tan");
            }
        });

        btnLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("ln");
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("exp");
            }
        });

        btnLog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("log2");
            }
        });

        btnLog10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("log10");
            }
        });


        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("csc");
            }
        });

        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("cot");
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("sec");
            }
        });

        btnCosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("cosec");
            }
        });

        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("!");
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("sin");
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("cos");
            }
        });

        btnDeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("deg");
            }
        });

        btnShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 btnCos.setText(" cos-1");
                 btnSin.setText("sin-1");
                 btnTan.setText("tan-1");
                 btnCsc.setText("csc-1");
                 btnCot.setText("cot-1");
                 btnCosec.setText("cosec-1");
                 btnSec.setText("sec-1");
                 btnTg.setText("tg-1");

                 btnCos.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          writeExpression("cos-1");
                      }
                  });
                btnSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sin-1");
                    }
                });
                btnTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tan-1");
                    }
                });
                btnCsc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("csc-1");
                    }
                });

                btnCot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cot-1");
                    }
                });

                btnSec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("sec-1");
                    }
                });

                btnCosec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("cosec-1");
                    }
                });
                btnTg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("tg-1");
                    }
                });
            }
        });

    }

    void writeExpression(String value){
        String expression = tvExpression.getText().toString();
        expression = expression + value;

        tvExpression.setText(expression);
    }

    void clearScreen(){
        tvExpression.setText("");
        tvResult.setText("0");
    }


}