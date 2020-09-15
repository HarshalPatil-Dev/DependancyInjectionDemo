package com.sample.dependancyinjectiondemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule(val memeorySize : Int) {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        Log.i("MYTAG", "Memory Card Size is $memeorySize")
        return MemoryCard()
    }
}