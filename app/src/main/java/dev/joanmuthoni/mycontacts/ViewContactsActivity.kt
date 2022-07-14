package dev.joanmuthoni.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.joanmuthoni.mycontacts.databinding.ActivityViewContactsBinding

class ViewContactsActivity : AppCompatActivity() {
    lateinit var  binding:ActivityViewContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras(){
        val extras = intent.extras
        var name = extras?.getString("NAME","")
        var phone = extras?.getString("PHONE_NUMBER","")
        var email = extras?.getString("EMAIL","")
        var address = extras?.getString("ADDRES","")
        var image = binding.imgPic

        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()

        binding.tvContactName.text=name
        binding.tvContactName.text=phone
        binding.tvContactName.text=email
        binding.tvContactName.text=address

        Picasso.get().load(intent.getStringExtra("Image")).into(image)
    }
    }
}