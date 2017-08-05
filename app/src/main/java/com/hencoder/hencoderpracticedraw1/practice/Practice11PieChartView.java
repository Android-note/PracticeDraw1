package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        @SuppressLint("DrawAllocation")
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector1));
            canvas.drawArc(400, 150, 1000, 750,
                    -5, -70, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector2));
            canvas.drawArc(400, 150, 1000, 750,
                    -5, 20, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector3));
            canvas.drawArc(400, 150, 1000, 750,
                    15, 60, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector4));
            canvas.drawArc(400, 150, 1000, 750,
                    75, 40, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector5));
            canvas.drawArc(400, 150, 1000, 750,
                    115, 20, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector6));
            canvas.drawArc(400, 150, 1000, 750,
                    135, 55, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector7));
            canvas.drawArc(400, 150, 1000, 750,
                    190, 30, true, paint);

            paint.setColor(ContextCompat.getColor(getContext(), R.color.sector8));
            canvas.drawArc(410, 90, 980, 730,
                    220, 60, true, paint);

            paint.setColor(Color.WHITE);
            paint.setTextSize(110);
            canvas.drawText("饼图", 600, 900, paint);
        }
    }
}
