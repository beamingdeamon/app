package fragmentActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.frame_layout, StartFragment(),"id1")
            .commit()
    }

    fun onNext(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, FinishFragment.newInstance("Text1", "Text2"))
            .commit()
    }
}