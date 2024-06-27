package ru.anura.dependencyinjectionstart.example1

class Activity {

    //val computer:Computer = Component().getComputer()

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    //доставка зависимостей
    init {
        Component().inject(this)
    }

}