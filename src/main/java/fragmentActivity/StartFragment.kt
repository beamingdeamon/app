package fragmentActivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R

class StartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }


    override fun onStart() {
        super.onStart()
        this.view?.findViewById<Button>(R.id.fragment_button)?.setOnClickListener{
            val action = StartFragmentDirections.actionStartFragmentToFinishFragment("555", "Text2")
            findNavController().navigate(action)
        }
    }
}