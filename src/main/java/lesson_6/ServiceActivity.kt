package lesson_6

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.session.PlaybackState.ACTION_STOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import java.lang.Exception

class ServiceActivity : AppCompatActivity() {

    private val reciever = TestBroadcastReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        findViewById<Button>(R.id.intent_button).setOnClickListener{
            val intent = Intent(this, TestForegroundService::class.java)
            startService(intent)
//            val intent= Intent()
//            intent.setAction("lesson6.NOTIFICATION")
//            intent.putExtra("data","TestData")
//            sendBroadcast(intent)
            updateStatus()
        }
        findViewById<Button>(R.id.button_stop).setOnClickListener{
            val intent = Intent(this, TestForegroundService::class.java)
            intent.action = TestForegroundService.ACTION_STOP
            startService(intent)
            Handler().postDelayed({updateStatus()},100)

        }
//
//        val filter = IntentFilter("lesson6.NOTIFICATION")
//        registerReceiver(reciever, filter)
    }
    private fun updateStatus(){
        if (isServiceRunning(TestForegroundService::class.java)){
            findViewById<TextView>(R.id.service_title).setText("Service is running")
        }else{
            findViewById<TextView>(R.id.service_title).setText("Service is close")
        }
    }
    @SuppressWarnings("deprecation")
    private fun isServiceRunning(serviceClass: Class<*>): Boolean{
        try {
            val manager= getSystemService(Context.ACTIVITY_SERVICE)as ActivityManager
            for (service in manager.getRunningServices(Int.MAX_VALUE)){
                if(service.service.className == serviceClass.name){
                    return true
                }
            }
        }
        catch (e: Exception){
            return false
        }
        return false
    }

    override fun onDestroy(){
        super.onDestroy()
        unregisterReceiver(reciever)
    }
}