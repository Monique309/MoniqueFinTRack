package com.example.fintrack

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.fintrack.Data.Expense

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv_list = findViewById<RecyclerView>(R.id.rv_list)
    }
}

private val expense = listOf(

    Expense(
        name = "Wifi",
        category = "House",
        price = 100

    ),
    Expense(
        name = "Gas",
        category = "car",
        price = 50

    ),

    Expense(
        name = "Grossary",
        category = "House",
        price = 300

    ),
    Expense(
        name = "Wifi",
        category = "House",
        price = 100 )

)
