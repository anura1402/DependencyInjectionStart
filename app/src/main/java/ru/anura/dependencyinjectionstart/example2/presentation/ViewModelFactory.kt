package ru.anura.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.anura.dependencyinjectionstart.example2.di.ApplicationScope
import ru.anura.dependencyinjectionstart.example2.domain.ExampleRepository
import ru.anura.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>,Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T
    }
}