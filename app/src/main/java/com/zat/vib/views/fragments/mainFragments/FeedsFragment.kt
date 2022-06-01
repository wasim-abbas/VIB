package com.zat.vib.views.fragments.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyLis3
import com.zat.vib.utils.feedsList
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.FeedsAdapter
import com.zat.vib.views.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_feeds.*


class FeedsFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_feeds
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

        private lateinit var feedsAdapter: FeedsAdapter

   // private var tabIndex: Int? = 0


    override fun observeLiveData() {
    }

    override fun init() {


//        feedTabs.removeAllTabs()
//        for (i in 0 until feedsList.size) {
//            feedTabs.addTab(feedTabs.newTab().setText(feedsList[i]))
//        }
//        feedTabs.selectTab(feedTabs.getTabAt(tabIndex!!))

        feedsAdapter = FeedsAdapter(currentActivity(), {})

        feedsAdapter.updateData(dummyLis3)

        RVFeeds.let {
            it.adapter = feedsAdapter
        }

    }

}