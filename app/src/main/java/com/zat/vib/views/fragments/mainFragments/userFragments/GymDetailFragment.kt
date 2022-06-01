package com.zat.vib.views.fragments.mainFragments.userFragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.getPopupDialog
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_gym_detail.*
import kotlinx.android.synthetic.main.leader_board_diloge.*


class GymDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_gym_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java
    private lateinit var dialog: Dialog

    override fun observeLiveData() {
    }

    override fun init() {

        btnBack.singleClick { currentActivity().onBackPressed() }

        imgViewLeaderBoard.singleClick {
            dialog = getPopupDialog(currentActivity(), R.layout.leader_board_diloge)
            dialog.btnClose.singleClick {
                dialog.dismiss()
        }
        dialog.show()
        }
        btnJoinGym.singleClick {
            currentActivity().replaceMainFragment(R.id.action_gymDetailFragment_to_myGymFragment)
        }

    }

}