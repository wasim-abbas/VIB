package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_group.*


class GroupFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_group
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btncreatGroup.singleClick {
            currentActivity().replaceMainFragment(R.id.action_blankFragment2_to_createGroupFragment)
        }
    }

}