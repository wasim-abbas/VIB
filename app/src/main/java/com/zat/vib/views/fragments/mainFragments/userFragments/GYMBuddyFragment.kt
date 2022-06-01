package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.FRAGMENT_NAME
import com.zat.vib.utils.dummyList
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.GymMemberAdapter
import kotlinx.android.synthetic.main.fragment_g_y_m_buddy.*


class GYMBuddyFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_g_y_m_buddy
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var gymMemberAdapter: GymMemberAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        val bundle = Bundle()
        bundle.putString(FRAGMENT_NAME, GYMBuddyFragment::class.java.simpleName)
        gymMemberAdapter = GymMemberAdapter(currentActivity()) {
            currentActivity().replaceMainFragment(
                R.id.action_GYMBuddyFragment_to_userDetailFragment, bundle
            )
        }

        gymMemberAdapter.updateData(dummyList)

        rv_gymBuddy.let {
            it.adapter = gymMemberAdapter
        }

    }

}