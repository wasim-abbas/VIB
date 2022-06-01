package com.zat.vib.views.fragments.mainFragments.userFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.FRAGMENT_NAME
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.PeopleAdapter
import kotlinx.android.synthetic.main.fragment_add_participant.*


class AddParticipantFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_add_participant
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var peopleAdapter: PeopleAdapter

    override fun observeLiveData() {
    }

    override fun init() {

        btnAddParticipants.singleClick {
            val bundle = Bundle()
            bundle.putString(FRAGMENT_NAME, AddParticipantFragment::class.java.simpleName)
            currentActivity().replaceMainFragment(
                R.id.action_addParticipantFragment_to_groupDetailFragment, bundle
            )
        }

        peopleAdapter = PeopleAdapter(currentActivity()) {}
        peopleAdapter.updateData(dummyList)
        RVPeople.let {
            it.adapter = peopleAdapter
        }
    }

}