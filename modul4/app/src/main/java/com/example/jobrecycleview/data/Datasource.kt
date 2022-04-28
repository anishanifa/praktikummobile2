package com.example.jobrecycleview.data

import com.example.jobrecycleview.R
import com.example.jobrecycleview.model.Pekerjaan
import com.example.jobrecycleview.model.Work

class Datasource {
    fun loadPekerjaan(): List<Pekerjaan> {
        return listOf<Pekerjaan>(
            Work("Actor","$82,867", "$39.84*",image = R.drawable.actor),
            Work("Barber", "29,900", "$14.38*",image = R.drawable.barber),
            Work("Chef","$47,390", "$22.78*",image = R.drawable.chef),
            Work("Chemist", "76,850", "$36.95*",image = R.drawable.chemist),
            Work("Dancer","$38,043", "$18.29*",image = R.drawable.dancer),
            Work("Doctor", "$173,860", "$83.59*",image = R.drawable.doctor),
            Work("Farmer", "$75,790", "$36.44*",image = R.drawable.farmer),
            Work("Firefighter","$38,630", "$18.57*",image = R.drawable.firefighter),
            Work("Model", "$36,560", "$17.58*",image = R.drawable.model),
            Work("Musician","$60,630", "$29.15*",image = R.drawable.musician),
            Work("Photographer", "$93,840", "$45.12*",image = R.drawable.photographer),
            Work("Police", "$88,400","$42.50*",image = R.drawable.police)
        )
    }
}