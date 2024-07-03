package ru.anura.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.anura.dependencyinjectionstart.example2.domain.ExampleRepository
import ru.anura.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
):ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel", "ExampleViewModel $this")
    }
}
