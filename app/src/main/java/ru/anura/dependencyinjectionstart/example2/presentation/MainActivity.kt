package ru.anura.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import ru.anura.dependencyinjectionstart.R
import ru.anura.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject
import ru.anura.dependencyinjectionstart.example2.ExampleApp

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this,viewModelFactory)[ExampleViewModel::class.java]
    }

    private val component by lazy{
        (application as ExampleApp).component
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}