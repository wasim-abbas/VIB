package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.CheckedInUserImagesAdapter
import kotlinx.android.synthetic.main.fragment_my_gym_detail.*


class MyGymDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_my_gym_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var checkedInUserImagesAdapter: CheckedInUserImagesAdapter

    override fun observeLiveData() {
    }

    override fun init() {

        btnBack.singleClick { currentActivity().onBackPressed() }
        checkedInUserImagesAdapter = CheckedInUserImagesAdapter(currentActivity()) {
            currentActivity().replaceMainFragment(R.id.action_myGymDetailFragment_to_userDetailFragment)
        }

        checkedInUserImagesAdapter.updateData(dummyList)

        rvUploadImages.let {
            it.adapter = checkedInUserImagesAdapter
        }

    }


}