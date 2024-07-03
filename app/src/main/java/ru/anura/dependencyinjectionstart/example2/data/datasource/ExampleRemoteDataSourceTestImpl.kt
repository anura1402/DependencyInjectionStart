package ru.anura.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import ru.anura.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceTestImpl @Inject constructor(
) : ExampleRemoteDataSource {

    override fun method() {
        Log.d("ExampleRemoteDataSource", "It's test")
    }
}
