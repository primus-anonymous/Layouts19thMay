package com.neocaptainnemo.layouts19thmay

import android.os.Bundle
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.google.android.material.behavior.SwipeDismissBehavior
import com.google.android.material.behavior.SwipeDismissBehavior.SWIPE_DIRECTION_ANY
import com.google.android.material.card.MaterialCardView

class CoordinatorFragment : Fragment(R.layout.fragment_coordinator) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val card: MaterialCardView = view.findViewById(R.id.card)

        val swipeBehavior: SwipeDismissBehavior<MaterialCardView> = SwipeDismissBehavior<MaterialCardView>().apply {
            setSwipeDirection(SWIPE_DIRECTION_ANY)
            listener = object : SwipeDismissBehavior.OnDismissListener {
                override fun onDismiss(view: View?) {

                }

                override fun onDragStateChanged(state: Int) {

                }

            }
        }

        val layoutParams = card.layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = swipeBehavior


    }

}