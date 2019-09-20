package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btndot;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnadd;
    Button btnsub;
    Button btnmulti;
    Button btndivide;
    Button btnresult;
    Button btnclear;
    TextView showResult;
    float input1;
    float input2;
    String action="";
    int checker=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checker=1;
        btn0=(Button) findViewById(R.id.btn_0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn0_clicked();
            }
        });
        btn1=(Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1_clicked();
            }
        });
        btn2=(Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2_clicked();
            }
        });
        btn3=(Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3_clicked();
            }
        });
        btn4=(Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4_clicked();
            }
        });
        btn5=(Button) findViewById(R.id.btn_5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5_clicked();
            }
        });
        btn6=(Button) findViewById(R.id.btn_6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6_clicked();
            }
        });
        btn7=(Button) findViewById(R.id.btn_7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn7_clicked();
            }
        });
        btn8=(Button) findViewById(R.id.btn_8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn8_clicked();
            }
        });
        btn9=(Button) findViewById(R.id.btn_9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9_clicked();
            }
        });
        btndot=(Button) findViewById(R.id.btn_dot);
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btndot_clicked();
            }
        });
        btnadd=(Button) findViewById(R.id.btn_add);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnadd_clicked();
            }
        });
        btnsub=(Button) findViewById(R.id.btn_subtract);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnsub_clicked();
            }
        });
        btnmulti=(Button) findViewById(R.id.btna_multiply);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnmulti_clicked();
            }
        });
        btndivide=(Button) findViewById(R.id.btn_divide);
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btndivide_clicked();
            }
        });
        btnresult=(Button) findViewById(R.id.btn_getResult);
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnresult_clicked();
            }
        });
        btnclear=(Button) findViewById(R.id.btn_clear);
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnclear_clicked();
            }
        });
        showResult=(TextView) findViewById(R.id.txt_result);

    }
    void btn0_clicked()
    {
         showResult.setText(showResult.getText().toString() + "0");
         checker=0;
    }
    void btn1_clicked()
    {
        showResult.setText(showResult.getText().toString() + "1");
        checker=0;
    }
    void btn2_clicked()
    {
        showResult.setText(showResult.getText().toString() + "2");
        checker=0;
    }
    void btn3_clicked(){
        showResult.setText(showResult.getText().toString() + "3");
        checker=0;
    }
    void btn4_clicked()
    {
        showResult.setText(showResult.getText().toString() + "4");
        checker=0;
    }
    void btn5_clicked()
    {
        showResult.setText(showResult.getText().toString() + "5");
        checker=0;
    }
    void btn6_clicked()
    {
        showResult.setText(showResult.getText().toString() + "6");
        checker=0;
    }
    void btn7_clicked()
    {
        showResult.setText(showResult.getText().toString() + "7");
        checker=0;
    }
    void btn8_clicked()
    {
        showResult.setText(showResult.getText().toString() + "8");
        checker=0;
    }
    void btn9_clicked()
    {
        showResult.setText(showResult.getText().toString() + "9");
        checker=0;
    }
    void btndot_clicked()
    {
        showResult.setText(showResult.getText().toString() + ".");
        checker=0;
    }
    void btnadd_clicked()
    {
        try{
        if(checker==0) {
            if(showResult.getText().toString().equals("."))
            {
                Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                toast.show();
                showResult.setText("");
            }
            else {
                if (action.isEmpty()) {
                    input1 = Float.parseFloat(showResult.getText().toString());
                    action = "+";
                    showResult.setText("");
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Operator Already Exist", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }
        else if(checker==1) {
            Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
            toast.show();
        }}
        catch (Exception e)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT);
            toast.show();
            showResult.setText("");
        }

    }
    void btnsub_clicked()
    {
        try{
            if(checker==0) {
                if(showResult.getText().toString().equals("."))
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                    toast.show();
                    showResult.setText("");
                }
                else {
                    if (action.isEmpty()) {
                        input1 = Float.parseFloat(showResult.getText().toString());
                        action = "-";
                        showResult.setText("");
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Operator Already Exist", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }
            else if(checker==1) {
                Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                toast.show();
            }}
        catch (Exception e)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT);
            toast.show();
            showResult.setText("");
        }

    }
    void btnmulti_clicked()
    {
        try{
            if(checker==0) {
                if(showResult.getText().toString().equals("."))
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                    toast.show();
                    showResult.setText("");
                }
                else {
                    if (action.isEmpty()) {
                        input1 = Float.parseFloat(showResult.getText().toString());
                        action = "x";
                        showResult.setText("");
                    }  else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Operator Already Exist", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }
            else if(checker==1) {
                Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                toast.show();
            }}
        catch (Exception e)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT);
            toast.show();
            showResult.setText("");
        }

    }
    void btndivide_clicked()
    {
        try{
            if(checker==0) {
                if(showResult.getText().toString().equals("."))
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                    toast.show();
                    showResult.setText("");
                }
                else {
                    if (action.isEmpty()) {
                        input1 = Float.parseFloat(showResult.getText().toString());
                        action = "/";
                        showResult.setText("");
                    }  else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Operator Already Exist", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }
            else if(checker==1) {
                Toast toast=Toast.makeText(getApplicationContext(),"Input Number First",Toast.LENGTH_SHORT);
                toast.show();
            }}
        catch (Exception e)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT);
            toast.show();
            showResult.setText("");
        }

    }
    void btnclear_clicked()
    {
        showResult.setText("");
        input2=0.0f;
        input1=0.0f;
        action="";
        checker=1;
    }
    public void btnresult_clicked()
    {
        if(action=="")
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Select Operator First",Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            float finalResult;
            if (showResult.getText().toString() == "") {
                Toast toast = Toast.makeText(getApplicationContext(), "Input Second Number", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                try {

                    input2 = Float.parseFloat(showResult.getText().toString());
                    if (action == "+") {
                        finalResult = input1 + input2;
                        showResult.setText(Float.toString(finalResult));
                    } else if (action == "-") {
                        finalResult = input1 - input2;
                        showResult.setText(Float.toString(finalResult));
                    } else if (action == "x") {
                        finalResult = input1 * input2;
                        showResult.setText(Float.toString(finalResult));
                    } else if (action == "/") {
                        finalResult = input1 / input2;
                        showResult.setText(Float.toString(finalResult));
                    }
                    action = "";
                }
                catch (Exception e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong Second Input", Toast.LENGTH_SHORT);
                    toast.show();
                    showResult.setText("");
                    input2=0.0f;
                }
            }
        }
    }
}
