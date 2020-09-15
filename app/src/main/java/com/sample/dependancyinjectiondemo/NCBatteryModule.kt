package com.sample.dependancyinjectiondemo

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NCBatteryModule {

    /*This way also we can create dependancy injection for Interface another way is below. make class and function abstract

    @Provides
    fun providesNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery{
        return nickelCadmiumBattery
    }*/

    @Binds
    abstract fun BindsNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery
}