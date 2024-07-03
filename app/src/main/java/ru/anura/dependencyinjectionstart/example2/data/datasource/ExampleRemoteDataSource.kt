package ru.anura.dependencyinjectionstart.example2.data.datasource

import android.util.Log

interface ExampleRemoteDataSource {

    fun method(){
        Log.d("ExampleRemoteDataSource", "It's real")
    }
}
