package com.example.fragmentques1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        var btn1 = findViewById<View>(R.id.btnFragment1) as Button
        var btn2 = findViewById<View>(R.id.btnFragment2) as Button

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, firstFragment)
            commit()
        }

        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }
        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flfragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
                                                                                   
    override fun onStart() {                                                   
        super.onStart()                                                        
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onStart")                                
    }                                                                          
                                                                               
    override fun onResume() {                                                  
        super.onResume()                                                       
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onResume")                               
    }                                                                          
                                                                               
    override fun onPause() {                                                   
        super.onPause()                                                        
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onPause")                                
    }                                                                          
                                                                               
    override fun onStop() {                                                    
        super.onStop()                                                         
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onStop")                                 
    }                                                                          
                                                                               
    override fun onDestroyView() {                                             
        super.onDestroyView()                                                  
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onDestroyView")                          
    }                                                                          
                                                                               
    override fun onDestroy() {                                                 
        super.onDestroy()                                                      
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onDestroy")                              
    }                                                                          
                                                                               
    override fun onDetach() {                                                  
        super.onDetach()                                                       
                                                                               
        Log.i("FRAGMENT4_LIFECYCLE", "onDetach")                               
}
