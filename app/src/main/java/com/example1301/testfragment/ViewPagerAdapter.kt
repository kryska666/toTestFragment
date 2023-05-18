package com.example1301.testfragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmemntManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmemntManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{fragment1()}
            1->{fragment2()}
            2->{fragment3()}
            else->{fragment4()}
        }
    }
}