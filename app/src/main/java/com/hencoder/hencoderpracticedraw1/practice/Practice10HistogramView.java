package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        @SuppressLint("DrawAllocation") Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(5);

        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100, 600, 1400, 600, paint);

        paint.setColor(ContextCompat.getColor(getContext(), R.color.green));
        canvas.drawRect(150, 550, 250, 600, paint);

        canvas.drawRect(300, 400, 400, 600, paint);
        canvas.drawRect(450, 200, 550, 600, paint);
        canvas.drawRect(600, 550, 700, 600, paint);
        canvas.drawRect(750, 10, 850, 600, paint);
        canvas.drawRect(900, 450, 1000, 600, paint);
        canvas.drawRect(1050, 290, 1150, 600, paint);
        canvas.drawRect(1200, 580, 1300, 600, paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(80);
        canvas.drawText("直方图", 600, 750,  paint);
    }
}
