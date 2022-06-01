package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.FRAGMENT_NAME
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_group_detail.*


class GroupDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_group_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {

    }

    override fun init() {

        llParticipant.gone()
        val fragmentName = getStringArgument(FRAGMENT_NAME)

        if (fragmentName == "AddParticipantFragment") {
            llParticipant.visible()
        }


        llSetting.singleClick { txtgroupSetting.visible() }
        txtgroupSetting.singleClick {
            currentActivity().replaceMainFragment(R.id.action_groupDetailFragment_to_editGroupFragment)
        }
        btnAddParticipants.singleClick {
            currentActivity().replaceMainFragment(R.id.action_groupDetailFragment_to_addParticipantFragment)
        }
    }

}