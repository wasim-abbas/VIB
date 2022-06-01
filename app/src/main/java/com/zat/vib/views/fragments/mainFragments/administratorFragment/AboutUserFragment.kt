package com.zat.vib.views.fragments.mainFragments.administratorFragment

import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyLis3
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.AboutUserImagesAdapter
import kotlinx.android.synthetic.main.fragment_about_user.*


class AboutUserFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_about_user
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var profileImagesAdapter: AboutUserImagesAdapter
    override fun observeLiveData() {
    }

    override fun init() {

        btnBack.singleClick {
            currentActivity().onBackPressed()
        }

        profileImagesAdapter = AboutUserImagesAdapter(currentActivity()) {}

        profileImagesAdapter.updateData(dummyLis3)

        rvUploadImages.let {
            it.adapter = profileImagesAdapter
        }

    }

}