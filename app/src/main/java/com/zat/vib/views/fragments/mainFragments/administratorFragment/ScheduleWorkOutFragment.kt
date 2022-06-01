package com.zat.vib.views.fragments.mainFragments.administratorFragment


import android.app.Dialog
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.dummyList
import com.zat.vib.utils.getPopupDialog
import com.zat.vib.utils.singleClick
import com.zat.vib.viewModels.BaseViewModel
import com.zat.vib.views.adapters.WorkOutAdapter
import kotlinx.android.synthetic.main.calander_view.*
import kotlinx.android.synthetic.main.fragment_schedule_work_out.*


class ScheduleWorkOutFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_schedule_work_out
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java
    private lateinit var dialog: Dialog

    private lateinit var workOutAdapter: WorkOutAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        workOutAdapter = WorkOutAdapter(currentActivity()) {id->

        }

        workOutAdapter.updateData(dummyList)

        rvWorkout.let {
            it.adapter = workOutAdapter
        }


        btnBack.singleClick { currentActivity().onBackPressed() }

        txtCalender.singleClick {
            dialog = getPopupDialog(currentActivity(), R.layout.calander_view)
            dialog.btnSave.singleClick {
                dialog.dismiss()
                txtTime.text = "09-04-2022"
            }
            dialog.show()
        }
    }

}