package ru.anura.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceTestImpl
import ru.anura.dependencyinjectionstart.example2.di.annotations.RealDataQualifier
import ru.anura.dependencyinjectionstart.example2.di.annotations.TestDataQualifier

@Module
interface DataModule {

    @Binds
     fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

     @RealDataQualifier
    @Binds
     fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

     @TestDataQualifier
    @Binds
     fun bindRemoteDataSourceTest(impl: ExampleRemoteDataSourceTestImpl): ExampleRemoteDataSource
}