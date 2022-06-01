package com.zat.vib.views.fragments.authFragments

import android.app.role.RoleManager
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.*
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.activities.AdministratorActivity
import com.zat.vib.views.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_login
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java


    override fun observeLiveData() {
    }

    override fun init() {
        val role = getStringArgument(ROLE)
        txtForgotPassword.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_loginFragment_to_forgotPasswordFragment)
        }

        textSignUp.singleClick {
            val bundle = Bundle()
            bundle.putString(ROLE, USER)
            bundle.putString(FRAGMENT_NAME, LoginFragment::class.java.simpleName)
            currentActivity().replaceFragmentInAuth(
                R.id.action_loginFragment_to_signUpFragment,
                bundle
            )
        }
        btnLogin.singleClick {
            if (role == USER) {
                startActivity(Intent(currentActivity(), MainActivity::class.java))
                currentActivity().finish()
            } else if (role == LEADER) {
                startActivity(Intent(currentActivity(), AdministratorActivity::class.java))
                currentActivity().finish()
            }else
            {
                startActivity(Intent(currentActivity(), MainActivity::class.java))
                currentActivity().finish()
            }
        }
        txtAdministaror.singleClick {
            val bundle = Bundle()
            bundle.putString(ROLE, LEADER)
            bundle.putString(FRAGMENT_NAME, LoginFragment::class.java.simpleName)
            currentActivity().replaceFragmentInAuth(
                R.id.action_loginFragment_to_signUpFragment,
                bundle
            )
        }
    }

}