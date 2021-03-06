package com.zhxh.xkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhxh.xkotlin.mvp.view.MainActivity
import kotlinx.android.synthetic.main.activity_jni.*

class JniActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jni)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()


        sample_text.setOnClickListener { startActivity(Intent(this@JniActivity, MainActivity::class.java)) }

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
