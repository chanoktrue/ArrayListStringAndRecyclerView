package com.trueddns.homenano.coffe

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val bindTextValue: TextView? = itemView.findViewById(R.id.textView)
    var bindContentValue: TextView? = itemView.findViewById(R.id.contentTextView)
    var bindImageView: ImageView? = itemView.findViewById(R.id.imageView)
    var bindCardView: CardView? = itemView.findViewById(R.id.cardView)
}
