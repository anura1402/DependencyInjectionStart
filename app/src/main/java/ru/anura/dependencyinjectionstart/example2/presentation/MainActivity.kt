package ru.anura.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.anura.dependencyinjectionstart.R
import ru.anura.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy{
//        DaggerApplicationComponent.builder()
//            .context(application)
//            .time(System.currentTimeMillis())
//            .build()
        DaggerApplicationComponent.factory()
            .create(System.currentTimeMillis(), application)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}