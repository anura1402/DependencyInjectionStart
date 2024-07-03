package ru.anura.dependencyinjectionstart.example2.data.repository

import ru.anura.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.anura.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.anura.dependencyinjectionstart.example2.di.annotations.RealDataQualifier
import ru.anura.dependencyinjectionstart.example2.di.annotations.TestDataQualifier
import ru.anura.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @RealDataQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method() //db
        remoteDataSource.method() //loadData
    }
}
