package dev.joanmuthoni.mycontacts

import android.provider.ContactsContract

data class Contacts(
    var name: String,
    var phone:String,
    var email:String,
    var image:String,
    var address:String
)