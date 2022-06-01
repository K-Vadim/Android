package com.example.myapplication.recadapters

import android.media.Image
import com.example.myapplication.R

data class feel(val image: Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.calm,""),
    feel(R.drawable.relax,"Расслабленным"),
    feel(R.drawable.focus,"Сосредоточеным"),
    feel(R.drawable.anxious,"Взволнованным")
)
}
data class state(val title:String, val text_state:String, val image_state: Int)
class MyState{
    val state_list = arrayListOf(state("Заголовок статьи","Краткое описание",R.drawable.calm))
}
