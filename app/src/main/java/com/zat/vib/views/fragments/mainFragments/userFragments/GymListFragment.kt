package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.GymListAdapter
import kotlinx.android.synthetic.main.fragment_gym_list.*


class GymListFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_gym_list
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var gymListAdapter: GymListAdapter
    override fun observeLiveData() {
    }

    override fun init() {
        gymListAdapter = GymListAdapter(currentActivity()) {
            currentActivity().replaceMainFragment(R.id.action_gymListFragment_to_gymDetailFragment)
        }
        gymListAdapter.updateData(dummyList)

        rv_GymList.let {
            it.adapter = gymListAdapter
        }


    }

}