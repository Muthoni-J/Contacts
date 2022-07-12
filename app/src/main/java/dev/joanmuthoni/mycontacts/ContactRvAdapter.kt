package dev.joanmuthoni.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactRvAdapter(var  contactsList: List<Contacts>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_lists_items,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
       var currentContacts = contactsList.get(position)
        holder.tvName.text = currentContacts.name
        holder.tvEmail.text = currentContacts.email
        holder.tvPhonenumber.text = currentContacts.phone
        holder.tvAddress.text = currentContacts.address

    }

    override fun getItemCount(): Int {
          return contactsList.size
    }
}

class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber = itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
    var imgContacts = itemView.findViewById<ImageView>(R.id.imgContacts)
}
