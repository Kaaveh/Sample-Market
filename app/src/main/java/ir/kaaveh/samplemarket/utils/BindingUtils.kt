package ir.kaaveh.samplemarket.utils

import android.graphics.Color
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter


@BindingAdapter("backColor")
fun backgroundColor(view: CardView, color: String){
    view.setCardBackgroundColor(Color.parseColor(color))
}