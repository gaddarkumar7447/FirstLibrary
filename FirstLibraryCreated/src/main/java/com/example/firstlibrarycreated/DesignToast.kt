package com.example.firstlibrarycreated

import android.content.Context
import android.widget.Toast

object DesignToast {
    fun smartToast(context: Context, message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}