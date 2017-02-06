package com.wong.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by waterway on 2017/2/5.
 */
public class FanShapedView extends View {

    private Paint mPaint;

   // private Rect mBounds;

    public FanShapedView(Context context, AttributeSet attrs) {
        super(context,attrs);
      //  mBounds = new Rect();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 创建画笔
        mPaint = new Paint();
        mPaint.setColor(Color.RED);// 设置红色
        Shader mShader = new LinearGradient(0, 0, 100, 100,
                new int[] {Color.rgb(135,206,250),Color.rgb(0,191,255),
                        Color.rgb(30,144,255) }, null, Shader.TileMode.CLAMP); // 一个材质,打造出一个线性梯度沿著一条线。
        mPaint.setShader(mShader);
        mPaint.setAntiAlias(true);
        RectF oval2 = new RectF(0, 0, getWidth(), getHeight());// 设置个新的长方形，扫描测量
        canvas.drawArc(oval2, 200, 130, true, mPaint);
    }
}
