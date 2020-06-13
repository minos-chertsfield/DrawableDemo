package com.minos.drawabledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.minos.drawabledemo.activity.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_bitmap.setOnClickListener {
            val intent = Intent(this, BitmapActivity::class.java)
            startActivity(intent)
        }

        btn_nine_patch.setOnClickListener {
            val intent = Intent(this, NinePatchActivity::class.java)
            startActivity(intent)
        }

        btn_shape.setOnClickListener {
            val intent = Intent(this, ShapeActivity::class.java)
            startActivity(intent)
        }

        btn_layer.setOnClickListener {
            val intent = Intent(this, LayerActivity::class.java)
            startActivity(intent)
        }

        btn_state.setOnClickListener {
            val intent = Intent(this, StateActivity::class.java)
            startActivity(intent)
        }

        btn_level.setOnClickListener {
            val intent = Intent(this, LevelActivity::class.java)
            startActivity(intent)
        }

        btn_transition.setOnClickListener {
            val intent = Intent(this, TransitionActivity::class.java)
            startActivity(intent)
        }

        btn_inset.setOnClickListener {
            val intent = Intent(this, InsetActivity::class.java)
            startActivity(intent)
        }

        btn_scale.setOnClickListener {
            val intent = Intent(this, ScaleActivity::class.java)
            startActivity(intent)
        }

        btn_clip.setOnClickListener {
            val intent = Intent(this, ClipActivity::class.java)
            startActivity(intent)
        }

        btn_rotate.setOnClickListener {
            val intent = Intent(this, RotateActivity::class.java)
            startActivity(intent)
        }

        btn_animation.setOnClickListener {
            val intent = Intent(this, AnimationActivity::class.java)
            startActivity(intent)
        }

        btn_ripple.setOnClickListener {
            val intent = Intent(this, RippleActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
