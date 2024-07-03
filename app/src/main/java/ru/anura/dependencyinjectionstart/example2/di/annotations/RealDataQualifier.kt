package ru.anura.dependencyinjectionstart.example2.di.annotations

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class RealDataQualifier
