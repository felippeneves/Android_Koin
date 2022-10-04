package br.com.felippeneves.androidkoin

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
): ViewModel() {

    fun doNetworkCall(context: Context) {
        Toast.makeText(context, "TEST", 5000).show();
    }

}