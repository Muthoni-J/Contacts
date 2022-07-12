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
        displayContacts()

    }
    fun displayContacts(){
        var contacts = Contacts("Joan","07123456","joan@gmail.com","https://cdn.pixabay.com/photo/2015/08/05/04/25/people-875617__340.jpg","123 kenya")
        var contacts1 = Contacts("Oure","07234567","oure@gmail.com","https://cdn.pixabay.com/photo/2016/11/29/13/14/attractive-1869761__340.jpg","234 Tanzania")
        var contacts2 = Contacts("Queenzy","07345678","queenzy@gmail.com","https://cdn.pixabay.com/photo/2017/02/16/23/10/smile-2072908__340.jpg","456 Rwanda")
        var contacts3 = Contacts("Wachera","07456789","wachera@gmail.com","https://cdn.pixabay.com/photo/2017/02/16/23/10/smile-2072908__340.jpg","678 Sudan")
        var contacts4 = Contacts("Kanini","075678910","kanini@gmail.com","https://cdn.pixabay.com/photo/2017/02/16/23/10/smile-2072908__340.jpg","910 Uganda")

        var contactsLists = listOf(contacts,contacts1,contacts2,contacts3,contacts4)
        var contactsAdapter = ContactRvAdapter(contactsLists)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}