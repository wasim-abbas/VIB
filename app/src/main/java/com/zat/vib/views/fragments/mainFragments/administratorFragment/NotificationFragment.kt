package com.zat.vib.views.fragments.mainFragments.administratorFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.GymNotificationAdapter
import kotlinx.android.synthetic.main.fragment_notification.*


class NotificationFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_notification
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var gymNotificationAdapter: GymNotificationAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        gymNotificationAdapter = GymNotificationAdapter(currentActivity()) {}

        gymNotificationAdapter.updateData(dummyList)
        rv_gymNotification.let {
            it.adapter = gymNotificationAdapter
        }
    }

}