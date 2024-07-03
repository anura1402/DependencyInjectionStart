package ru.anura.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.anura.dependencyinjectionstart.example2.di.annotations.IdQualifier
import ru.anura.dependencyinjectionstart.example2.di.annotations.NameQualifier
import ru.anura.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
):ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "ExampleViewModel $this $id $name")
    }
}
