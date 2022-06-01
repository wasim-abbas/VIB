package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_profile
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btnBack.gone()
        ivCamera.gone()
        camera1.gone()
        camera2.gone()

        lledit.singleClick {
            btnBack.visible()
            ivCamera.visible()
            camera1.visible()
            camera2.visible()
            btnLogout.text =getString(R.string.save_info)
        }

        btnBack.singleClick { currentActivity().onBackPressed() }
    }

}