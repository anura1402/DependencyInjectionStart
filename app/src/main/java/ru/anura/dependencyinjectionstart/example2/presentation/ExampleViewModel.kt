package ru.anura.dependencyinjectionstart.example2.presentation

import ru.anura.dependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
