package ru.anura.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import ru.anura.dependencyinjectionstart.R
import ru.anura.dependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $time $this")

    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
