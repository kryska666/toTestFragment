package com.example1301.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example1301.testfragment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapters = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.pagerTest.adapter = adapters
        TabLayoutMediator(binding.tabDemo, binding.pagerTest){
            tab,pos->when(pos){
                0->{tab.text="Pic 1"}
                1->{tab.text="Pic 2"}
                2->{tab.text="Pic 3"}
                3->{tab.text="Pic 4"}
            }
        }.attach()
    }
}