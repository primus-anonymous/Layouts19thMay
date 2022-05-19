package com.neocaptainnemo.layouts19thmay

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.Group
import androidx.fragment.app.Fragment

class ConstraintFragment : Fragment(R.layout.fragment_constraint) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val group: Group = view.findViewById(R.id.group)

        group.visibility = View.GONE

        view.findViewById<Button>(R.id.btn_show_group).setOnClickListener {
            group.visibility = View.VISIBLE
        }
    }
}