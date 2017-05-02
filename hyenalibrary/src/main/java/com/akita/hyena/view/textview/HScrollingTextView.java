package com.akita.hyena.view.textview;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;

/**
 * 简介:横向跑马灯
 * GitHub https://github.com/zapailaohei
 * 邮箱 378741819@qq.com
 * Created by Akita on 2017/5/2.
 */
public class HScrollingTextView extends AppCompatTextView {

    public HScrollingTextView(Context context) {
        super(context,null);
    }

    public HScrollingTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        //设置跑马灯
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //设置单行模式
        setSingleLine(true);
    }

    @Override
    public boolean isFocused() {
        //总是获得焦点
        return true;
    }
}
