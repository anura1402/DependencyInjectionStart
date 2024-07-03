package ru.anura.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.anura.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @Named("id") private val id: String,
    @Named("name") private val name: String
):ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "ExampleViewModel $this $id $name")
    }
}
