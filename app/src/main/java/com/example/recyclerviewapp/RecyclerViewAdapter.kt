package com.example.recyclerviewapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class RecyclerViewAdapter(private val listUser: ArrayList<ItemsViewModel>) : RecyclerView.Adapter<RecyclerViewAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tv_name_list)
        var imageView: ImageView = itemView.findViewById(R.id.iv_item_name_list)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_name_list, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = listUser[position]

        Glide.with(holder.itemView.context)
            .load(user.image)
            .circleCrop()
            .into(holder.imageView)
        holder.textView.text = user.name

        holder.textView.setOnClickListener {
            Toast.makeText(holder.itemView.context, user.name, Toast.LENGTH_LONG).show()

            var i = Intent(holder.itemView.context, DetailActivity::class.java)
            i.putExtra("Nama", user.name)
            i.putExtra("Email", user.email)
            i.putExtra("Jurusan", user.major)
            i.putExtra("Semester", user.semester)
            i.putExtra("Foto", user.image)
            holder.itemView.context.startActivity(i)
        }
    }
}