package com.neocaptainnemo.layouts19thmay

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class MotionFragment : Fragment(R.layout.fragment_motion) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val someText: TextView = view.findViewById(R.id.some_text)

//        ObjectAnimator.ofFloat(someText, "translationX",200f).apply {
//            duration = 3000L
//            start()
//        }
//
//        val animationX = ObjectAnimator.ofFloat(someText, "x", 400f)
//        val animationY = ObjectAnimator.ofFloat(someText, "y", 800f)
//
//        AnimatorSet()
//            .apply {
//                playTogether(animationX, animationY)
//                start()
//            }

        ValueAnimator.ofFloat(0f, 200f).apply {
            duration = 3000L
            addUpdateListener {
                someText.translationX = it.animatedValue as Float
            }
        }.start()
    }

}