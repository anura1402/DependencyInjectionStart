package ru.anura.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {
    val component = DaggerNewComponent.create()
    @Inject
     var keyboard: Keyboard = component.getKeyboard() //геттер через даггер
    val mouse: Mouse = component.getMouse()
    val monitor: Monitor = component.getMonitor()

    //доставка зависимостей
    init {
        DaggerNewComponent.create().inject(this) //inject через dagger
    }

}