package com.example.myapplication

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.core.content.ContextCompat
import java.util.ArrayList

class RecyclerAdapter(private val data: ArrayList<Item>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        private val textView: TextView
        private val imageView: ImageView

        init {
            textView = view.findViewById(R.id.recycler_title)
            imageView = view.findViewById(R.id.recycler_image)
        }
        fun setData(item: Item){
            textView.text = item.title
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.context, item.imageId))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
    class   Item(
         val title: String,
         val imageId: Int
    )
}