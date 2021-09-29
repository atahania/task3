package com.example.task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    lateinit var names: ArrayList<String>
    lateinit var ed: EditText
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.rv)
        btn = findViewById(R.id.btn)
        ed =findViewById(R.id.ed)

        names = ArrayList()
        names.add("Tahani")
        names.add("ghj")
        names.add("ghj")
        names.add("ghjkl")
        names.add("fghjkl")
        names.add("fghj")
        names.add("fghjk")

        recyclerView.adapter = MyAdapter(names)
        recyclerView.layoutManager =LinearLayoutManager(this)

        btn.setOnClickListener {
            val name = ed.text.toString()
            names.add(name)
            ed.text.clear()
            recyclerView.adapter?.notifyDataSetChanged()
        }

    }
}