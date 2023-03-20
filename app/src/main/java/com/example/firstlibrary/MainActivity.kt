package com.example.firstlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.DesignTool
import com.example.firstlibrarycreated.DesignToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DesignToast.smartToast(this, "This is main mainActivity")

    }
}