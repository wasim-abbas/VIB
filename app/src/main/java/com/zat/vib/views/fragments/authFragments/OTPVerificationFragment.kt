package com.zat.vib.views.fragments.authFragments

import android.os.Bundle
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.*
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_o_t_p_verification.*


class OTPVerificationFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_o_t_p_verification
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        val fragmentNAme = getStringArgument(FRAGMENT_NAME)
        val role = getStringArgument(ROLE)
        if (fragmentNAme == "ForgotPasswordFragment") {
            textVerification.text = getString(R.string.forgot_password2)
        }

        btnBack.singleClick {
            currentActivity().onBackPressed()
        }

        btnProceed.singleClick {
            if (fragmentNAme == "ForgotPasswordFragment") {
                currentActivity().replaceFragmentInAuth(R.id.action_OTPVerificationFragment_to_newPasswordFragment)
            } else if (role == LEADER) {
                val bundle = Bundle()
                bundle.putString(ROLE, LEADER)
                currentActivity().replaceFragmentInAuth(
                    R.id.action_OTPVerificationFragment_to_loginFragment,
                    bundle
                )
            } else {
                currentActivity().replaceFragmentInAuth(R.id.action_OTPVerificationFragment_to_paymentDetailFragment)
            }
        }
    }

}