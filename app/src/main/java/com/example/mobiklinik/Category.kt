package com.example.mobiklinik

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager

class Category : AppCompatActivity() {

    lateinit var photoRV: RecyclerView
    lateinit var recyclerviewAdaptery: recyclerview_adaptery
    lateinit var mList: ArrayList<ItemsViewModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)

        // on below line we are creating variables for
        // our swipe to refresh layout,
        // recycler view, adapter and list.

        // on below line we are initializing
        // our views with their ids.
        photoRV = findViewById(R.id.recyclerview)

        // on below line we are
        // initializing our list
        mList = ArrayList()


        // on below line we are setting layout manager for our recycler view
        val layoutManager = GridLayoutManager(this, 2)

        photoRV.layoutManager = layoutManager

        recyclerviewAdaptery = recyclerview_adaptery(mList, this)

        // on below line we are setting
        // adapter to our recycler view.
        photoRV.adapter = recyclerviewAdaptery

        mList.add(ItemsViewModel(R.drawable.camera, "Camera "))
        mList.add(ItemsViewModel(R.drawable.broken_screen, "LCD Screen "))
        mList.add(ItemsViewModel(R.drawable.charging_port, "Charging Port "))
        mList.add(ItemsViewModel(R.drawable.motherboard, "Motherboard/IC "))
        mList.add(ItemsViewModel(R.drawable.mic, "Microphone "))
        mList.add(ItemsViewModel(R.drawable.button, "Button "))
        mList.add(ItemsViewModel(R.drawable.rear_glass, "Rear Glass Repair "))
        mList.add(ItemsViewModel(R.drawable.speaker, "Speaker "))
        mList.add(ItemsViewModel(R.drawable.home_button, "Home Button "))
        mList.add(ItemsViewModel(R.drawable.water_damage, "Water Damage "))
        mList.add(ItemsViewModel(R.drawable.no_signal, "No Wifi/Signal "))
        mList.add(ItemsViewModel(R.drawable.others, "Button "))

        recyclerviewAdaptery.notifyDataSetChanged()




    }

}




