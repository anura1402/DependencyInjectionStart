package ru.anura.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.anura.dependencyinjectionstart.example2.presentation.MainActivity

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun time(time: Long):ApplicationComponentBuilder

        @BindsInstance
        fun context(context: Context):ApplicationComponentBuilder

        fun build(): ApplicationComponent

    }
}