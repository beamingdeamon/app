package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.RecyclerAdapter.Item

class RecyclerViewActivity : AppCompatActivity() {
    val recyclerlist: ArrayList<Item> = arrayListOf(
        Item("Item 1", R.drawable.ic__coal),
        Item("Item 2", R.drawable.ic_donjondetournebut)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        var recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapter(recyclerlist)
        recyclerview.adapter = adapter
    }

}