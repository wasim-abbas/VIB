package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick
import kotlinx.android.synthetic.main.item_view_work_out_type.view.*

class WorkOutAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<WorkOutAdapter.WorkOutViewHolder, String>() {

    var row_index = -1

    class WorkOutViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_work_out_type

    override fun setData(holder: WorkOutViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {
            view.txtWorkOut.isActivated = true
            row_index = position
            onClick(model)
            notifyDataSetChanged()
        }

        view.txtWorkOut.isActivated = row_index ==position
    }


}
