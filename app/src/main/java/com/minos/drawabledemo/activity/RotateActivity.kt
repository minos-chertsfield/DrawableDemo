package com.minos.drawabledemo.activity

import android.graphics.drawable.RotateDrawable
import android.graphics.drawable.ScaleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.minos.drawabledemo.R
import kotlinx.android.synthetic.main.activity_rotate.*
import kotlinx.android.synthetic.main.activity_scale.*

class RotateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate)

        seek_bar_rotate.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val max = seekBar.max
                val scale = progress.toDouble() / max
                val drawable = rotate_img.drawable as RotateDrawable
                drawable.level = ((10000 * scale).toInt())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
    }
}
