package com.zat.vib.views.fragments.authFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_payment
    override val viewModelClass: Class<BaseViewModel>
        get() =BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnBack.singleClick { currentActivity().onBackPressed() }

        btnPaySubscription.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_paymentFragment_to_paymentDoneFragment)
        }
    }

}