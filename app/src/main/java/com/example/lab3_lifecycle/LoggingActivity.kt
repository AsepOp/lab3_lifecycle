package com.example.lab3_lifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LoggingActivity : AppCompatActivity(){
    private val tag get() = "LC" + javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "On create (saved sate = ${savedInstanceState != null}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "On restart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "On pause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "On resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "OnDestroy (isFinishing = $isFinishing, changingConfig = $isChangingConfigurations")
    }
}