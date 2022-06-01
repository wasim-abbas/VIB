package com.zat.vib.views.fragments.mainFragments.administratorFragment

import android.annotation.SuppressLint
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat.getColor
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.gone
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.activities.AdministratorActivity
import com.zat.vib.views.adapters.GymMemberAdapter
import kotlinx.android.synthetic.main.fragment_administrator_home.*
import kotlinx.android.synthetic.main.fragment_user_activity.view.*


class AdministratorHomeFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_administrator_home
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var gymMemberAdapter: GymMemberAdapter


    override fun observeLiveData() {}

    @SuppressLint("ResourceAsColor")
    override fun init() {
        myCalender.gone()
        btnMenu.singleClick { (currentActivity() as AdministratorActivity).toggleDrawer() }

        llCalander.singleClick {
            myCalender.visible()
        }

        calanderView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            myCalender.gone()
        }


        gymMemberAdapter = GymMemberAdapter(currentActivity()) {
            currentActivity().replaceFragmentInGYMAmins(R.id.action_administratorHomeFragment_to_aboutUserFragment)
        }

        gymMemberAdapter.updateData(dummyList)

        rc_gymMemeber.let {
            it.adapter = gymMemberAdapter
        }

    }

}