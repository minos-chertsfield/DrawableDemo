package com.minos.drawabledemo.activity

import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scale.*
import android.graphics.drawable.ScaleDrawable




class ScaleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.minos.drawabledemo.R.layout.activity_scale)

        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val max = seekBar.max
                val scale = progress.toDouble() / max
                val drawable = scale_img.drawable as ScaleDrawable
                drawable.level = ((10000 * scale).toInt())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
    }
}
