package com.example.fragmentques1

import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {
   override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("FRAGMENT1_LIFECYCLE", "onCreateView")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

        Log.i("FRAGMENT1_LIFECYCLE", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("FRAGMENT1_LIFECYCLE", "onCreate")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.i("FRAGMENT1_LIFECYCLE", "onActivityCreated")
    }

    }
