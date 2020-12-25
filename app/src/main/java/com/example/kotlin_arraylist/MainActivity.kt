package com.example.kotlin_arraylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nameList = ArrayList<String>()
        nameList.add("Max")
        nameList.add("Misha")
        nameList.add("Danya")
        nameList.add("Serega")
        nameList.add("Dima")
        nameList.add("Ilia")

        //адаптер (кэп)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView.adapter = adapter

    }
}