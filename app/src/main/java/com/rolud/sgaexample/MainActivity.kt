package com.rolud.sgaexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rolud.solidglowanimation.SolidGlowAnimation

class MainActivity : AppCompatActivity() {

    private lateinit var animationButton1: SolidGlowAnimation
    private lateinit var animationButton2: SolidGlowAnimation
    private lateinit var animationImage1: SolidGlowAnimation
    private lateinit var animationImage2: SolidGlowAnimation
    private lateinit var animationCard: SolidGlowAnimation
    private lateinit var animateButton: Button
    private lateinit var stopButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationButton1 = findViewById(R.id.animation_view_button_1)
        animationButton2 = findViewById(R.id.animation_view_button_2)
        animationImage1 = findViewById(R.id.animation_view_1)
        animationImage2 = findViewById(R.id.animation_view_2)
        animationCard = findViewById(R.id.animation_view_complex_view)
        animateButton = findViewById(R.id.start_button)
        stopButton = findViewById(R.id.stop_button)

        animateButton.setOnClickListener {
            animationButton1.startAnimation()
            animationButton2.startAnimation()
            animationImage1.startAnimation()
            animationImage2.startAnimation()
            animationCard.startAnimation()
        }

        stopButton.setOnClickListener {
            animationButton1.stopAnimation()
            animationButton2.stopAnimation()
            animationImage1.stopAnimation()
            animationImage2.stopAnimation()
            animationCard.stopAnimation()
        }

    }
}
