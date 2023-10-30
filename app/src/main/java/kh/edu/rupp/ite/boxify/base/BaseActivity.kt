package kh.edu.rupp.ite.boxify.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun gotoActivity(activity: Activity, intent: Intent){
        activity.startActivity(intent)
    }
}