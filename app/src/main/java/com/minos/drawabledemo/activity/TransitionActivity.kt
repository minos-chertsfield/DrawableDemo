package com.minos.drawabledemo.activity

import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minos.drawabledemo.R
import kotlinx.android.synthetic.main.activity_transition.*

class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        val transition = resources.getDrawable(R.drawable.transition_demo) as TransitionDrawable
        transition_img.setImageDrawable(transition)
        transition.startTransition(5000)
    }
}
