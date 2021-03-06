package com.minos.drawabledemo.activity

import android.graphics.drawable.LevelListDrawable
import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.minos.drawabledemo.R
import kotlinx.android.synthetic.main.activity_level.*

class LevelActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

        seek_bar_level.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val max = seekBar.max
                val drawable = level_img.drawable as LevelListDrawable
                drawable.level = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {


            }
        })
    }
}
