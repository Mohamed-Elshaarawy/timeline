package dev.elshaarawy.timeline.features.timeline.viewholders

import android.view.ViewGroup
import androidx.databinding.Bindable
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import dev.elshaarawy.timeline.R
import dev.elshaarawy.timeline.databinding.ItemTimelineImgBinding
import dev.elshaarawy.timeline.extensions.inflate

/**
 * @author Mohamed Elshaarawy on Jan 03, 2020.
 */
class ImgViewHolder private constructor(private val itemBinding: ItemTimelineImgBinding) :
    ViewHolder<TimelineItemViewModel>(itemBinding.root) {

    override fun bind(viewModel: TimelineItemViewModel) {
        super.bind(viewModel)
        itemBinding.viewModel = viewModel
    }

    companion object : (ViewGroup, LifecycleOwner) -> ImgViewHolder {
        override fun invoke(parent: ViewGroup, lifecycleOwner: LifecycleOwner): ImgViewHolder =
            ImgViewHolder(parent.inflate(R.layout.item_timeline_img, lifecycleOwner))
    }
}