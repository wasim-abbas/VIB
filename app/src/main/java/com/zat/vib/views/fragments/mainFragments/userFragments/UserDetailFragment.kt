package com.zat.vib.views.fragments.mainFragments.userFragments

import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.FRAGMENT_NAME
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_user_detail.*


class UserDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_user_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        val fragmentName = getStringArgument(FRAGMENT_NAME)
        if (fragmentName == "GYMBuddyFragment") {
            btnProceed.text = getString(R.string.send_workout_request) }

        btnBack.singleClick { currentActivity().onBackPressed() }

        btnProceed.singleClick {
            currentActivity().replaceMainFragment(
                R.id.action_userDetailFragment_to_setTimePlaceFragment
            )
        }
    }

}