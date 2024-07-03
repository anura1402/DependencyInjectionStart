package ru.anura.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.anura.dependencyinjectionstart.example2.di.annotations.ApplicationScope

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun activityComponentFactory(): ActivityComponent.Factory

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun time(time: Long):ApplicationComponentBuilder
//
//        @BindsInstance
//        fun context(context: Context):ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance time: Long,
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}