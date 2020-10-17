package ir.kaaveh.samplemarket.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ir.kaaveh.samplemarket.model.Item
import ir.kaaveh.samplemarket.repository.ItemRepository

class ExploreViewModel @ViewModelInject constructor(
    itemRepository: ItemRepository
) : ViewModel() {
    private val _itemList = MutableLiveData<List<Item>>()

    val itemList: LiveData<List<Item>>
        get() = _itemList

    init {
        itemRepository.itemList.observeForever {
            _itemList.postValue(it)
        }
    }
}