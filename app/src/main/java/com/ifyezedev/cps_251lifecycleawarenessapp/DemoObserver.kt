package com.ifyezedev.cps_251lifecycleawarenessapp

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.ifyezedev.cps_251lifecycleawarenessapp.ui.MainViewModel
import java.text.SimpleDateFormat
import java.util.*

class DemoObserver : LifecycleObserver {

    val sdf = SimpleDateFormat("hh:mm:ss:SSS")
    val currentDate = sdf.format(Date())

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
       MainViewModel.lifecycleEventChanged( "onResume", currentDate)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        MainViewModel.lifecycleEventChanged( "onPause", currentDate)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        MainViewModel.lifecycleEventChanged( "onCreate", currentDate)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        MainViewModel.lifecycleEventChanged( "onStart", currentDate)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        MainViewModel.lifecycleEventChanged( "onStop", currentDate)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        MainViewModel.lifecycleEventChanged( "onDestroy", currentDate)
    }

}