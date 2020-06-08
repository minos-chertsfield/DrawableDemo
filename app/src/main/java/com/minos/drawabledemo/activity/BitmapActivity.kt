package com.minos.drawabledemo.activity

import android.graphics.BitmapFactory
import android.graphics.Shader
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import com.minos.drawabledemo.R
import kotlinx.android.synthetic.main.activity_bitmap.*

class BitmapActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitmap)

        //获取bitmap
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.bitmap_demo)
        val bitmapDrawable = BitmapDrawable(bitmap)
        //设置抗锯齿
        bitmapDrawable.setAntiAlias(true)
        //设置抖动平滑
        bitmapDrawable.setDither(true)
        //设置过滤平滑
        bitmapDrawable.isFilterBitmap = true
        bitmapDrawable.gravity = Gravity.START

        //复制边缘色彩
        bitmapDrawable.setTileModeXY(Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        //重复
        bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT)
        //镜像
        bitmapDrawable.setTileModeXY(Shader.TileMode.MIRROR, Shader.TileMode.MIRROR)

        frame1.background = bitmapDrawable
    }
}
