package example.com.compoundviewex;


import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class compview extends LinearLayout {

    EditText et;
    Button bnext,bprev;
    public compview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.comp_view,this);
         et=(EditText)findViewById(R.id.editText);
         bnext=(Button)findViewById(R.id.next);
         bprev=(Button)findViewById(R.id.prev);
         fun1();
    }
    private void fun1()
    {
        bnext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                String s=et.getText().toString();
                 s="http://www."+s+ ".com";
                 et.setText(s);
            }
        });
    }
}
