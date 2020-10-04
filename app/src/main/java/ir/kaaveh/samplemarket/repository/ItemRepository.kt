package ir.kaaveh.samplemarket.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ir.kaaveh.samplemarket.model.Item

class ItemRepository {
    private val _itemList = MutableLiveData<List<Item>>()

    val itemList: LiveData<List<Item>>
        get() = _itemList

    init {
        _itemList.postValue(makeData())
    }
}