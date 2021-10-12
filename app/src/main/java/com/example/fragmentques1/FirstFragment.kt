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
    
      override fun onStart() {
        super.onStart()

        Log.i("FRAGMENT1_LIFECYCLE", "onStart")


    }

    override fun onResume() {
        super.onResume()

        Log.i("FRAGMENT1_LIFECYCLE", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("FRAGMENT1_LIFECYCLE", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("FRAGMENT1_LIFECYCLE", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.i("FRAGMENT1_LIFECYCLE", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("FRAGMENT1_LIFECYCLE", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()

        Log.i("FRAGMENT1_LIFECYCLE", "onDetach")
    }

    }
