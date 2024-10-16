package ru.anura.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    @Inject
    lateinit var computer: Computer


    //доставка зависимостей
    init {
        DaggerNewComponent.create().inject(this) //inject через dagger
    }

}