package com.example.lenovo.congyunlong20170710;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/7/10 8:57
 */

public class AddView extends LinearLayout implements View.OnClickListener{

    private BaseOnClickListener.OnClickListener listener;
    private Button add;
    private Button rem;
    private EditText ed;
    private int num =0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        ed.setText(num+"");
    }

    public void setListener(BaseOnClickListener.OnClickListener listener) {
        this.listener = listener;
    }

    public AddView(Context context) {
        this(context,null);
    }

    public AddView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public AddView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = View.inflate(context,R.layout.lin,this);
        add = (Button) findViewById(R.id.add);
        rem = (Button) findViewById(R.id.rem);
        ed = (EditText) findViewById(R.id.ed1);
        rem.setOnClickListener(this);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()){//View点击事件选择使用
        case R.id.add:
            num--;
            if (num>0){
                ed.setText(num+"");
                listener.OnClick(num);
            }
        break;
        case R.id.rem:
            num++;
            if (num<20){
                ed.setText(num+"");
                listener.OnClick(num);
            }
            break;
        default :
        break;
    }
    }
}
