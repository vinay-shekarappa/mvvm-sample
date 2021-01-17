package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel
import timber.log.Timber

class GameViewModel : ViewModel() {

    init {
        Timber.i("GameViewModel called")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("GameViewModel onCleared")
    }
}