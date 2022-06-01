package com.zat.vib.views.fragments.mainFragments.userFragments

import android.app.Dialog
import com.zat.vib.R
import com.zat.vib.base.BaseFragment
import com.zat.vib.utils.getPopupDialog
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import com.zat.vib.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_user_activity.*
import kotlinx.android.synthetic.main.popup_personal_record.*

class UserActivityFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_user_activity
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java
    private lateinit var dialog: Dialog

    override fun observeLiveData() {
    }

    override fun init() {

        txtPerRecoerd.singleClick {
            dialog = getPopupDialog(currentActivity(),R.layout.popup_personal_record)
            dialog.btnClose.singleClick {
                dialog.dismiss()
            }
            dialog.show()
        }

        llEdit.singleClick {
            myCalender.visible()
        }
    }

}