package com.example.mobiklinik

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class recyclerview_adaptery(

    private var mList: ArrayList<ItemsViewModel>,
    private val context: Context
) : RecyclerView.Adapter<recyclerview_adaptery.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): recyclerview_adaptery.ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)

        return ViewHolder(view)
    }


    // method for filtering our recyclerview items.
    fun filterList(filterlist: ArrayList<ItemsViewModel>) {
        // below line is to add our filtered
        // list in our course array list.
        mList = filterlist
        // below line is to notify our adapter
        // as change in recycler view data.
        notifyDataSetChanged()
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: recyclerview_adaptery.ViewHolder, position: Int) {

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(mList.get(position).image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = mList.get(position).text

        holder.imageView.setOnClickListener(View.OnClickListener {

//            Toast.makeText(context, mList.get(position).image, Toast.LENGTH_SHORT).show()
            val intent = Intent(context, Customer_info::class.java)
                context.startActivity(intent)
        })

    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}