package com.zat.vib.views.adapters

import android.content.Context
import android.view.View
import com.zat.vib.R
import com.zat.vib.base.BaseAdapter
import com.zat.vib.base.BaseViewHolder
import com.zat.vib.utils.singleClick
import kotlinx.android.synthetic.main.item_view_edit_images.view.*

class EditProfileImagesAdapter(var context: Context, var onClick: (String) -> Unit) :
    BaseAdapter<EditProfileImagesAdapter.EditProfileImagesViewHolder, String>() {

    class EditProfileImagesViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_edit_images

    override fun setData(holder: EditProfileImagesViewHolder, model: String, position: Int) {
        var view = holder.itemView
        view.singleClick {
            onClick(model)
        }

        view.camera.singleClick {

        }
    }
}