package com.alian.notes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alian.notes.R
import com.alian.notes.model.User
import kotlinx.android.synthetic.main.rv_item.view.*

class UserAdapter(
    private val user: List<User>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var firstName = itemView.tvFirstName.toString()
        private var lastName = itemView.tvLastName.toString()

        fun changeName(user: User) {
            firstName = user.firstName.toString()
            lastName = user.lastName.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.changeName(user[position])
    }

    override fun getItemCount(): Int {
        return user.size
    }
}