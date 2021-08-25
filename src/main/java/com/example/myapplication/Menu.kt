package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.app.NotificationBuilderWithBuilderAccessor

class Menu : AppCompatActivity() {
    lateinit var notificationBuilder: NotificationBuilder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        notificationBuilder = NotificationBuilder(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.menu_settings-> {
                true
            }
            R.id.menu_profile-> {
                true
            }
            R.id.file_new-> {
                true
            }
            R.id.file_open-> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun showMessage(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}