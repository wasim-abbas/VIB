package com.zat.vib.views.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.zat.vib.views.fragments.mainFragments.userFragments.ChatFragmentFragment
import com.zat.vib.views.fragments.mainFragments.userFragments.GroupFragment


class ViewPagerAdapter2 (fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 2


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatFragmentFragment()
            }
            1 -> {
              GroupFragment()
            }

            else -> {
                Fragment()
            }
        }
    }
}