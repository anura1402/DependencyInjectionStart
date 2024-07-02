package ru.anura.dependencyinjectionstart.example2

import android.app.Application
import ru.anura.dependencyinjectionstart.example2.di.DaggerApplicationComponent

class ExampleApp:Application(){
     val component by lazy{
//        DaggerApplicationComponent.builder()
//            .context(application)
//            .time(System.currentTimeMillis())
//            .build()
        DaggerApplicationComponent.factory()
            .create(System.currentTimeMillis(), this)
    }
}