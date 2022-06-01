package com.zat.vib.views.fragments.mainFragments.administratorFragment

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.getPopupDialog
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_gym_profile.*
import kotlinx.android.synthetic.main.pop_gym_profile.*

class GymProfileFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_gym_profile
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var dialogue: Dialog

    override fun observeLiveData() {
    }

    override fun init() {

        btnProceed.isEnabled = false

        llShowGymActivity.singleClick {
            dialogue = getPopupDialog(currentActivity(), R.layout.pop_gym_profile)
            dialogue.rbYes.singleClick {

                dialogue.rbYes.isActivated = !dialogue.rbYes.isActivated
            }
            dialogue.rbNo.singleClick {
                dialogue.rbNo.isActivated = !dialogue.rbNo.isActivated
            }
            dialogue.rbYes2.singleClick {
                dialogue.rbYes2.isActivated = !dialogue.rbYes2.isActivated
            }
            dialogue.rbNo2.singleClick {
                dialogue.rbNo2.isActivated = !dialogue.rbNo2.isActivated
            }
            dialogue.btnSave.singleClick {
                dialogue.dismiss()
                btnProceed.setBackgroundResource(R.drawable.main_btn_selected_bg)
                btnProceed.isEnabled = true
            }
            dialogue.show()
        }

        btnProceed.singleClick {
            currentActivity().replaceFragmentInGYMAmins(R.id.action_gymProfileFragment_to_administratorHomeFragment2)
        }


    }

}