package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.zat.vib.R
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick

class ImagesAdapter(var context: Context, var onClick: (String) -> Unit) :
    com.zat.vib.base.BaseAdapter<ImagesAdapter.ImagesViewHolder,String>() {
    class ImagesViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_images

    override fun setData(holder: ImagesViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {
            onClick(model)
        }
    }
}
