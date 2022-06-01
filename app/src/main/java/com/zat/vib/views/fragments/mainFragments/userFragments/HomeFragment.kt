package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_home
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        sideBAr.singleClick {
            (currentActivity() as MainActivity).toggleDrawer()
        }

        btnApply.singleClick {
            currentActivity().replaceMainFragment(R.id.action_homeFragment2_to_gymListFragment)
        }
    }

}