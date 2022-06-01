package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick

class ChatAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<ChatAdapter.ChatViewHolder, String>() {
    class ChatViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_chatt

    override fun setData(holder: ChatViewHolder, model: String, position: Int) {

        var view = holder.itemView
        view.singleClick {
            onClick(model)
        }
    }
}