package br.com.felippeneves.androidkoin

import org.koin.core.qualifier.named
import org.koin.dsl.module

val activityModule = module {
    //Only live as long as the activity they are injected into
    scope<MainActivity> {
        scoped(qualifier = named("hello")) { "Hello" }
        scoped(qualifier = named("bye")) { "Bye" }

    }
}