package com.zat.vib.views.fragments.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.ViewPagerAdapter
import com.zat.vib.views.adapters.ViewPagerAdapter2
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment2 : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_blank2
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var viewPagerAdapter2: ViewPagerAdapter2

    override fun observeLiveData() {
    }

    override fun init() {


        viewPagerAdapter2 = ViewPagerAdapter2(currentActivity().supportFragmentManager, lifecycle)
        viewPAger.adapter = viewPagerAdapter2

        TabLayoutMediator(feedTabs, viewPAger) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "MY CHAT"
                }
                1 -> {
                    tab.text = "Groups"
                }
            }
        }.attach()
    }

}


