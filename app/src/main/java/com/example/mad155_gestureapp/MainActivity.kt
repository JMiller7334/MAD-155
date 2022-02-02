package com.example.mad155_gestureapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener { //setup Gesture Listeners
    var gDetector: GestureDetectorCompat? = null //variable for the lister

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this) //enable the listener for this activity
        gDetector?.setOnDoubleTapListener(this) //enable the double tap listener for this activity
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event) //seems like a connection
        return super.onTouchEvent(event)
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        //Toast.makeText(this, "onDown", Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onShowPress(p0: MotionEvent?) {
        Toast.makeText(this, "onPress", Toast.LENGTH_SHORT).show()
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onScroll"
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onLongPress"
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        Toast.makeText(this, "onDoubleTap", Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        var gestureText = findViewById<TextView>(R.id.getGestureText)
        gestureText.text = "onDoubleTapEvent"
        return true
    }
}