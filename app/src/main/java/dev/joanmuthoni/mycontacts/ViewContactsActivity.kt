package dev.joanmuthoni.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ViewContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    fun getExtras(){
        val extras = intent.extras
        var name = extras?.getString("Name","")
        var phone = extras?.getString("PHONE_NUMBER","")
        Toast.makeText(this,name,Toast.LENGTH_LONG)
    }
    }
}