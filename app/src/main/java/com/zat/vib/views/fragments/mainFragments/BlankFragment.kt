package com.zat.vib.views.fragments.mainFragments

import com.google.android.material.tabs.TabLayoutMediator
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_blank.*


class BlankFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_blank
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var viewPagerAdapter: ViewPagerAdapter


    override fun observeLiveData() {
    }

    override fun init() {


        viewPagerAdapter = ViewPagerAdapter(currentActivity().supportFragmentManager, lifecycle)
        viewPAger.adapter = viewPagerAdapter

        TabLayoutMediator(feedTabs, viewPAger) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "FEEDS"
                }
                1 -> {
                    tab.text = "MY FEED"
                }
                2 -> {
                    tab.text = "LIKED FEEDS"
                }
            }
        }.attach()
    }

}