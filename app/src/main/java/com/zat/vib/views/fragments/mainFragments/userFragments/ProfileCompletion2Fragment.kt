package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_profile_completion2.*


class ProfileCompletion2Fragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_profile_completion2
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnProceed.singleClick {
            currentActivity().replaceMainFragment(R.id.action_profileCompletion2Fragment_to_homeFragment2)
        }

        txtTypesOFWorkOut.singleClick {
            llWorkOutTypes.visible()
        }

        txtFitnessGoal.singleClick {
            llFitnessGoal.visible()
        }

        txtWeighttGoal.singleClick {
            llWeighttGoal.visible()
        }
        txtCamera.singleClick {
            llCamera.visible()
        }
    }

}