package com.zat.vib.views.fragments.mainFragments.administratorFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyLis3
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.EditProfileImagesAdapter
import kotlinx.android.synthetic.main.fragment_administrator_profile.*


class AdministratorProfileFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_administrator_profile
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var editProfileImagesAdapter: EditProfileImagesAdapter

    override fun observeLiveData() {}

    override fun init() {
        btnNo.gone()
        btnNo2.gone()
        txtNo1.gone()
        txtNo2.gone()
        editProfileImagesAdapter = EditProfileImagesAdapter(currentActivity()) {

        }
        editProfileImagesAdapter.updateData(dummyLis3)
        rvUploadImages.let {
            it.adapter = editProfileImagesAdapter
        }


        llEdit.singleClick {
            btnNo.visible()
            btnNo2.visible()
            txtNo1.visible()
            txtNo2.visible()
        }
        btnYes.singleClick { btnYes.isActivated = !btnYes.isActivated }
        btnYes2.singleClick { btnYes2.isActivated = !btnYes2.isActivated }
        btnNo.singleClick { btnNo.isActivated = !btnNo.isActivated }
        btnNo2.singleClick { btnNo2.isActivated = !btnNo2.isActivated }

        txtNo1.gone()
        txtNo2.gone()
    }

}