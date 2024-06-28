package ru.anura.dependencyinjectionstart.example2.di

import dagger.Module
import dagger.Provides
import ru.anura.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import ru.anura.dependencyinjectionstart.example2.domain.ExampleRepository

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}