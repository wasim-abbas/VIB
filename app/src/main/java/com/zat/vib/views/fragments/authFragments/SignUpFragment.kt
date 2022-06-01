package com.zat.vib.views.fragments.authFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.*
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_sign_up
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        val fragmentName = getStringArgument(FRAGMENT_NAME)
        val role = getStringArgument(ROLE)

        if (fragmentName == "LoginFragment") {
            textUser.visible()
            txtGymAdmi.gone()
            btnSignUp.text = getString(R.string.sign_up)
            btnSubsription.gone()
        } else {
            txtGymAdmi.visible()
            textUser.gone()
            edBio.gone()
        }
        btnBack.singleClick { currentActivity().onBackPressed() }

        textSignin.singleClick { currentActivity().onBackPressed() }

        btnSubsription.singleClick {
            val bundle = Bundle()
            bundle.putString(ROLE, role)
            currentActivity().replaceFragmentInAuth(R.id.action_signUpFragment_to_OTPVerificationFragment,bundle)
        }

        btnSignUp.singleClick {
            val bundle = Bundle()
            bundle.putString(ROLE, role)
            currentActivity().replaceFragmentInAuth(
                R.id.action_signUpFragment_to_OTPVerificationFragment,
                bundle
            )
        }
    }

}