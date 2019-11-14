package e.hp.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.source);
        e1.setText("US Dollar");
        e2=(EditText)findViewById(R.id.desti);
        e3=(EditText)findViewById(R.id.currency);
        r=(TextView)findViewById(R.id.result);

    }

    public void find(View view) {
        Log.i("info","enter on click");
        String e4=e1.getText().toString();
        String e5=e2.getText().toString();
        String []currency={"US Dollar","Euro","Swedish Krona","Rupees"};


        /* String f="us dollar";
        if(e4.equals(e6)&&e5.equals(e7))
            Toast.makeText(this,"chl gya",Toast.LENGTH_SHORT).show();*/
        if(e4.equals(currency[0]))
        {
            if(e5.equals(currency[3])){
            Log.i("info","enter in if statement");
            int c=Integer.parseInt(e3.getText().toString());
            float d=c*70.48f;
                String s=String.format("%.2f",d);
                r.setText(s);
            Log.i("info","complete");}
            else if(e5.equals(currency[2])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*8.86f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[1])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.86f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[0])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
        }
        if(e4.equals(currency[1]))
        {
            if(e5.equals(currency[3])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*81.44f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[2])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*10.25f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[1])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[0])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*1.16f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
        }
        if(e4.equals(currency[2]))
        {
            if(e5.equals(currency[3])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*7.95f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[2])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[1])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.098f;
                String s=String.format("%.3f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[0])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.11f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
        }
        if(e4.equals(currency[3]))
        {
            if(e5.equals(currency[3])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[2])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.13f;
                String s=String.format("%.2f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[1])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.012f;
                String s=String.format("%.3f",d);
                r.setText(s);
                Log.i("info","complete");}
            else if(e5.equals(currency[0])){
                Log.i("info","enter in if statement");
                int c=Integer.parseInt(e3.getText().toString());
                float d=c*0.014f;
                String s=String.format("%.3f",d);
                r.setText(s);
                Log.i("info","complete");}
        }
    }

    public void option1(View view) {
        LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView=inflater.inflate(R.layout.pop_up_currency_type,null);
        int width= RelativeLayout.LayoutParams.WRAP_CONTENT;
        int height=RelativeLayout.LayoutParams.WRAP_CONTENT;
        boolean focus=true;
        final PopupWindow popup=new PopupWindow(popupView,width,height,focus);
        popup.showAtLocation(view, Gravity.CENTER,0,0);
    }

    public void type2(View view) {
        e1.setText("Euro");
    }

    public void type3(View view) {
        e1.setText("Swedish Krona");
    }

    public void type4(View view) {
        e1.setText("Rupees");
    }

    public void type1(View view) {
        e1.setText("US Dollar");
    }

    public void option2(View view) {
        LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView=inflater.inflate(R.layout.pop_up_currency_type1,null);
        int width= RelativeLayout.LayoutParams.WRAP_CONTENT;
        int height=RelativeLayout.LayoutParams.WRAP_CONTENT;
        boolean focus=true;
        final PopupWindow popup=new PopupWindow(popupView,width,height,focus);
        popup.showAtLocation(view, Gravity.CENTER,0,0);
    }

    public void typ2(View view) {
        e2.setText("Euro");
    }

    public void typ3(View view) {
        e2.setText("Swedish Krona");
    }

    public void typ4(View view) {
        e2.setText("Rupees");
    }

    public void typ1(View view) {
        e2.setText("US Dollar");
    }
}
