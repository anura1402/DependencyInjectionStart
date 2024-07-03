package ru.anura.dependencyinjectionstart.example2.data.database

import android.content.Context
import ru.anura.dependencyinjectionstart.example2.di.annotations.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method() {
        //Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $time $this")

    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
