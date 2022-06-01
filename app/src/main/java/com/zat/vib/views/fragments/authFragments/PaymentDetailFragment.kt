package com.zat.vib.views.fragments.authFragments

import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_payment_detail.*

class PaymentDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_payment_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnBack.singleClick { currentActivity().onBackPressed() }

        btnProceed.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_paymentDetailFragment_to_paymentFragment)
        }
    }

}