package com.anng.recyclerapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    private val countryTextView: TextView = itemView.findViewById(R.id.country_text_view)

    fun bind(user: User) {
        nameTextView.text = "Название - ${user.name}"
        countryTextView.text = "Страна  - ${user.country}"

    }


}
