package ru.anura.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import ru.anura.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
        Log.d("ExampleRemoteDataSource", "It's real")
    }
}
