package org.techtown.lineup.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.techtown.lineup.R

class AlarmFragment : Fragment () {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity)
            .inflate(R.layout.fragmernt_alarm,container,false)
        return view
    }
}