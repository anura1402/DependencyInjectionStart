package ru.anura.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.anura.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import ru.anura.dependencyinjectionstart.example2.domain.ExampleRepository

@Module
interface DomainModule {

    //можно здесь пометить @ApplicationScope вместо ExampleDatabase, ExampleApiService и DataSources
    //означает один экземпляр репозитория и => все одни и те же зависимости для него
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}