package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewActivity : AppCompatActivity() {

    private var list: ArrayList<ItemsViewModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        showRecycler()
    }

    private fun showRecycler(){
        val recyclerView = findViewById<RecyclerView>(R.id.rv_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val foodAdapter = RecyclerViewAdapter(list)
        recyclerView.adapter = foodAdapter

        list.addAll(UserData.listData)
    }
}