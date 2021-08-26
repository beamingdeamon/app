package lesson_6

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TestBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        StringBuilder().apply {
            append("#Academy Action: ${intent?.action}\n ")
            append("#Academy Data: ${intent?.data}\n ")
            append("#Academy Extras: ${intent?.extras}\n ")

            toString().also {
                    data-> println(data)
            }
        }
    }
}