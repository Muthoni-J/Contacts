package dev.joanmuthoni.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.joanmuthoni.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun displayContacts(){
        var contacts = Contacts("Joan","07123456","joan@gmail.com","","123 kenya")
        var contacts1 = Contacts("Oure","07234567","oure@gmail.com","","234 Tanzania")
        var contacts2 = Contacts("Queenzy","07345678","queenzy@gmail.com","","456 Rwanda")
        var contacts3 = Contacts("Wachera","07456789","wachera@gmail.com","","678 Sudan")
        var contacts4 = Contacts("Kanini","075678910","","kanini@gmail.com","910 Uganda")

        var contactsLists = listOf(contacts,contacts1,contacts2,contacts3,contacts4)
        var contactsAdapter = ContactRvAdapter(contactsLists)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}