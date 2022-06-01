package com.zat.vib.views.fragments.authFragments

import android.os.Bundle
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.ROLE
import com.zat.vib.utils.USER
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_payment_done.*


class PaymentDoneFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_payment_done
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnProceed.singleClick {
            val bundle = Bundle()
            bundle.putString(ROLE, USER)
            currentActivity().replaceFragmentInAuth(
                R.id.action_paymentDoneFragment_to_loginFragment, bundle
            )
        }
    }

}