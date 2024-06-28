package ru.anura.dependencyinjectionstart.example2.di

import dagger.Module
import dagger.Provides
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
class DataModule {

    @Provides
    fun provideExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideExampleRemoteDataSource(impl:ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}