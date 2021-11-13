package com.example.textcircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

class TextViewCircle extends View {
    private Paint myPaint;
    private Paint myTextPaint;
    private Path myPathCircle;

    public TextViewCircle(Context context) {
        super(context);

        myPaint = new Paint();
        myTextPaint = new Paint();
        myPathCircle = new Path();

    }
    protected void onDraw(Canvas canvas){
        setBackgroundResource(R.drawable.background);

        myPaint.setColor(Color.BLUE);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeWidth(2.0f);
        myPaint.setAntiAlias(true);

        myTextPaint.setTextSize(30);
        myTextPaint.setAntiAlias(true);
        myTextPaint.setColor(Color.RED);

        myPathCircle.addCircle(240,240,110,Path.Direction.CW);
        canvas.drawPath(myPathCircle,myPaint);
        canvas.drawTextOnPath("Всем привет от Александра*", myPathCircle,0,30,myTextPaint);


        setLayerType(View.LAYER_TYPE_SOFTWARE,null);

    }
}




