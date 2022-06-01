package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick
import com.zat.vib.utils.visible
import kotlinx.android.synthetic.main.item_view_user_notification.view.*
import kotlinx.android.synthetic.main.item_view_work_out_type.view.*

class UserNotificationAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<UserNotificationAdapter.UserNotificationViewHolder, String>() {
    var row_index = -1

    class UserNotificationViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_user_notification

    override fun setData(holder: UserNotificationViewHolder, model: String, position: Int) {

        var view = holder.itemView
        view.singleClick {
            onClick(model)
            view.llButton.visible()
            notifyDataSetChanged()
        }

    }
}