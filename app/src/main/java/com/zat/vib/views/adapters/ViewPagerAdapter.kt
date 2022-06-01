package com.zat.vib.views.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zat.vib.views.fragments.mainFragments.FeedsFragment
import com.zat.vib.views.fragments.mainFragments.LikedFeedFragment
import com.zat.vib.views.fragments.mainFragments.MyFeedsFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FeedsFragment()
            }
            1 -> {
                MyFeedsFragment()
            }
            2 -> {
                LikedFeedFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}