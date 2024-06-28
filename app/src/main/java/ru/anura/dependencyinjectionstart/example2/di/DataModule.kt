package ru.anura.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
     fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
     fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}