package com.minos.drawabledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.minos.drawabledemo.activity.BitmapActivity
import com.minos.drawabledemo.activity.NinePatchActivity
import com.minos.drawabledemo.activity.ShapeActivity
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
