package com.anng.recyclerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList: List<User> = listOf(
            User("Saint Petersburg", "Russian Federation"),
            User("Rim", "Italy"),
            User("Helsinki", "Finland"),
            User("Havana", "Cuba"),
            User("Madrid", "Spain")


        )

        userRecyclerView = findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
            )

        userRecyclerView.adapter = UserAdapter(userList)

    }
}


// RecyclerView<- Adapter<-ViewHolder<- layout