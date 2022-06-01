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
import com.zat.vib.views.adapters.UserNotificationAdapter
import kotlinx.android.synthetic.main.fragment_user_notification.*


class UserNotificationFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_user_notification
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var userNotificationAdapter: UserNotificationAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        userNotificationAdapter = UserNotificationAdapter(currentActivity()) {

        }
        userNotificationAdapter.updateData(dummyList)

        rvNotify.let {
            it.adapter = userNotificationAdapter
        }

    }

}