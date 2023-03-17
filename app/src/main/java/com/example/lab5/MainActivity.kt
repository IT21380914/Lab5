package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imgHome: ImageView = findViewById(R.id.imgHome)
        val imgUser:ImageView = findViewById(R.id.imgUser)
        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()

        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.unselected_user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.homefragmentcontainer, fragmentUser)
                commit()
            }
        }
        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selected_homes)
            imgUser.setImageResource(R.drawable.unselected_user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.user_fragment, fragmentHome)
                commit()
            }
        }
    }





}