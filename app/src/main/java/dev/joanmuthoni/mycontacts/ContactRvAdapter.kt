package dev.joanmuthoni.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.joanmuthoni.mycontacts.databinding.ActivityMainBinding
import dev.joanmuthoni.mycontacts.databinding.ContactsListsItemsBinding

class ContactRvAdapter(var contactsList: List<Contacts>) :
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactsListsItemsBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val context = holder.itemView.context
        var currentContacts = contactsList.get(position)
        with(holder.binding) {
            tvName.text = currentContacts.name
            tvEmail.text = currentContacts.email
            tvPhonenumber.text = currentContacts.phone
            tvAddress.text = currentContacts.address

            Picasso.get()
                .load(currentContacts.image)
                .resize(300,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_account_circle_24)
                .error(R.drawable.ic_baseline_account_circle_24)
                .into(holder.binding.imgContacts);
            holder.binding.cvContacts.setOnClickListener {
                val context = holder.itemView.context
                val intent = Intent(context,ViewContactsActivity::class.java)
                intent.putExtra("Name",currentContacts.name)
                intent.putExtra("PHONENUMBER",currentContacts.phone)
                context.startActivity(intent)
            }
            holder.binding.imgContacts.setOnClickListener {
                Toast.makeText(context,"You have clicked on my face",Toast.LENGTH_LONG)
                     .show()
            }
        }
    }


    override fun getItemCount(): Int {
        return contactsList.size
    }
}



class ContactViewHolder(var binding: ContactsListsItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {

}
