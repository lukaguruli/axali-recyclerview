package com.example.myapplicationrecyclerbiewaxaliii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var ListView : ListView
    private lateinit var UsersAdapter : UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListView = findViewById(R.id.listview)
        val userList = ArrayList<user>()
        userList.add(user("c programming", "https://www.circuitbasics.com/wp-content/uploads/2015/12/C-Programming.png"))
        userList.add(user("c ++", "https://i.redd.it/31b2ii8hchi31.jpg"))
        userList.add(user("java", "https://cdn.worldvectorlogo.com/logos/java.svg"))
        userList.add(user("python", "https://qph.fs.quoracdn.net/main-qimg-28cadbd02699c25a88e5c78d73c7babc"))
        userList.add(user("bootstrap", "https://getbootstrap.com/docs/5.0/assets/brand/bootstrap-social-logo.png"))
        userList.add(user("asp.net", "https://static.gunnarpeipman.com/wp-content/uploads/2020/09/aspnet-featured.png"))
        userList.add(user("php", "https://cdn.worldvectorlogo.com/logos/php.svg"))
        userList.add(user("unix", "https://upload.wikimedia.org/wikipedia/commons/3/3c/UniX_Logo.png"))

        UsersAdapter = UsersAdapter(this,userList)
        ListView.adapter = UsersAdapter
    }
}