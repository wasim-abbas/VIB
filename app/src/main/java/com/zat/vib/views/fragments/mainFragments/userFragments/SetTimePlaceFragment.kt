package com.zat.vib.views.fragments.mainFragments.userFragments

import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_set_time_place.*


class SetTimePlaceFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_set_time_place
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnBack.singleClick {
            currentActivity().onBackPressed()
        }
        btnProceed.singleClick {
            currentActivity().replaceMainFragment(
                R.id.action_setTimePlaceFragment_to_myGymFragment)
        }
    }

}