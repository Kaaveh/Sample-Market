package ir.kaaveh.samplemarket.repository

import androidx.lifecycle.MutableLiveData
import ir.kaaveh.samplemarket.model.Item

fun makeData(): List<Item> = listOf(
    Item("Designer Collections", "UP TO 70%", "#6D4C41"),
    Item("Woman's Suit", "UP TO 50%", "#90A4AE")
)