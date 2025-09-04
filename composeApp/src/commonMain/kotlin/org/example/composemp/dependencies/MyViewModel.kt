package org.example.composemp.dependencies

import androidx.lifecycle.ViewModel
import org.example.composemp.dependencies.MyRepository

class MyViewModel(
    private val repository: MyRepository
): ViewModel() {

    fun getHelloWorldString(): String {
        return repository.helloWorld()
    }
}