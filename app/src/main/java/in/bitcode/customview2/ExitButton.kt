package `in`.bitcode.customview2

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.provider.SyncStateContract
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button

@SuppressLint("AppCompatCustomView")
class ExitButton(context: Context, attributeSet: AttributeSet?) : Button(context, attributeSet) {

    init {
        setText("Exit Application")
        setOnClickListener(ExitButtonClickListener())
    }

    var exitable = true


    constructor(context: Context) : this(context, null) {
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        Log.e("TAG", "onDraw: called" )

        var paint = Paint()
        paint.color = Color.RED

        canvas?.drawLine(150F, 0F, 150F, height.toFloat(), paint)
        canvas?.drawLine(170F, 0F, 170F, height.toFloat(), paint)
    }


    private inner class ExitButtonClickListener : View.OnClickListener {
        override fun onClick(v: View?) {
            if(exitable == true) {
                System.exit(0)
            }
        }
    }
}