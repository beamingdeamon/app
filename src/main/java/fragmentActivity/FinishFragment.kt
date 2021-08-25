package fragmentActivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentFinishBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FinishFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FinishFragment : Fragment() {
    // TODO: Rename and change types of parameters
   val args: FinishFragmentArgs by navArgs()
    private lateinit var binding:FragmentFinishBinding

    override fun onStart() {
        super.onStart()
        binding.title.text =args.title
        binding.subTitle.text = args.subTitle
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentFinishBinding.inflate(layoutInflater)
        return binding.root
    }
}