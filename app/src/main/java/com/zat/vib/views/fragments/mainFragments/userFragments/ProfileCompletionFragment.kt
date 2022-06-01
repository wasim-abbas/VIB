package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyLis3
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.ImagesAdapter
import kotlinx.android.synthetic.main.fragment_profile_completion.*


class ProfileCompletionFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_profile_completion
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var imagesAdapter: ImagesAdapter

    override fun observeLiveData() {
    }

    override fun init() {

        btnProceed.singleClick {
            currentActivity().replaceMainFragment(
                R.id.action_profileCompletionFragment_to_profileCompletion2Fragment
            )
        }
        imagesAdapter = ImagesAdapter(currentActivity(), {})
        imagesAdapter.updateData(dummyLis3)

        rvUploadImages.let {
            it.adapter = imagesAdapter
        }
    }

}