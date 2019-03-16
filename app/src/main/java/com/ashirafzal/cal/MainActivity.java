package com.ashirafzal.cal;

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
            btnShift,btnModulo;

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
        btnModulo = findViewById(R.id.btnModulo);

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
                String expression = tvExpression.getText().toString();
                Expression e = new Expression(expression);
                String result = String.valueOf(e.calculate());

                tvResult.setText(result);
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
                writeExpression("*");
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
                processor = tvExpression.getText().toString();
                processor = processor.substring(0 , processor.length()-1);
                tvExpression.setText(processor);
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

        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("arsin");
            }
        });

        btnShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  btnCos.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          writeExpression("acos");
                      }
                  });
                btnSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("asin");
                    }
                });
                btnTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("atan");
                    }
                });
                btnCsc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("acsc");
                    }
                });

                btnCot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("acot");
                    }
                });

                btnSec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("asec");
                    }
                });

                btnCosec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("acosec");
                    }
                });
                btnTg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        writeExpression("atg");
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