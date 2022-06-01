package com.zat.vib.views.fragments.authFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.FRAGMENT_NAME
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_forgot_password.*


class ForgotPasswordFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_forgot_password
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btnBack.singleClick { currentActivity().onBackPressed() }

        btnResetPass.singleClick {
            val bundle = Bundle()
            bundle.putString(FRAGMENT_NAME,ForgotPasswordFragment::class.java.simpleName)
            currentActivity().replaceFragmentInAuth(
            R.id.action_forgotPasswordFragment_to_OTPVerificationFragment,bundle) }


    }

}