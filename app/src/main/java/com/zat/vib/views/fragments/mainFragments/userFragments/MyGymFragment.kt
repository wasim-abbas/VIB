package com.zat.vib.views.fragments.mainFragments.userFragments

import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_my_gym.*


class MyGymFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_gym
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btnProceed.singleClick {
            btnStopWatch.visible()
        }

        txtGymName.singleClick {
            currentActivity().replaceMainFragment(R.id.action_myGymFragment_to_myGymDetailFragment)
        }
    }

}