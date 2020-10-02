package com.stfalcon.sample.common.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.stfalcon.sample.R

class ScaledPostersGridView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : PostersGridView(context, attrs, defStyleAttr) {

    override fun inflateView() {
        View.inflate(context, R.layout.view_scaled_posters_grid, this)
    }
}