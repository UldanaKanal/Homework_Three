package com.example.homeworkthree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList : ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.paneer_butter_masala ,"Paneer Butter Masala"))
        foodList.add(Food(R.drawable.pizza ,"Pizza"))
        foodList.add(Food(R.drawable.dosa ,"Dosa"))
        foodList.add(Food(R.drawable.veg_biryani,"Veg Biryani"))
        foodList.add(Food(R.drawable.pasta,"Pasta"))
        foodList.add(Food(R.drawable.noodles,"Noodles"))

        foodList.add(Food(R.drawable.paneer_butter_masala ,"Paneer Butter Masala"))
        foodList.add(Food(R.drawable.pizza ,"Pizza"))
        foodList.add(Food(R.drawable.dosa ,"Dosa"))
        foodList.add(Food(R.drawable.veg_biryani,"Veg Biryani"))
        foodList.add(Food(R.drawable.pasta,"Pasta"))
        foodList.add(Food(R.drawable.noodles,"Noodles"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter
    }
}