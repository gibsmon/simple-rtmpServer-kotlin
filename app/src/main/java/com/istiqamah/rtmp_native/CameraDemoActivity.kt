package com.istiqamah.rtmp_native

import android.os.Bundle
import android.os.Handler
import android.view.SurfaceView
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class CameraDemoActivity : AppCompatActivity() {

    lateinit var surfaceView: SurfaceView
    lateinit var a: RtmpServer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContentView(R.layout.activity_camera_demo)

        surfaceView = findViewById(R.id.surfaceView)
//        activity, surfaceView
        a = RtmpServer(this, surfaceView)
//        context
        a.initSurfaceView(applicationContext)
//        url rtmp
        a.startStreaming("rtmp://global-live.mux.com:5222/app/f703a09d-0b4d-83c3-b826-8977e329c56c")
    }


}