package ru.anura.dependencyinjectionstart.example2.di

import dagger.BindsInstance
import dagger.Subcomponent
import ru.anura.dependencyinjectionstart.example2.di.annotations.IdQualifier
import ru.anura.dependencyinjectionstart.example2.di.annotations.NameQualifier
import ru.anura.dependencyinjectionstart.example2.presentation.MainActivity
import ru.anura.dependencyinjectionstart.example2.presentation.MainActivity2

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory{
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}