package com.ifyezedev.cps_251lifecycleawarenessapp.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainViewModel: ViewModel() {


    companion object {
        var eventText = MutableLiveData<String>()

        fun lifecycleEventChanged(event : String, time : String) {

            if(eventText.value == null) {
                eventText.value = "$event was fired on $time\n"
            }
            else {
                eventText.value += "$event was fired on $time\n"
            }

            if (event == "onResume" || event == "onPause" || event == "onDestroy"){
                eventText.value += "************\n"
            }

        }
    }
}