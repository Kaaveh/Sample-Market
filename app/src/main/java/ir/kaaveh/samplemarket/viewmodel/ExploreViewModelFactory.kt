package ir.kaaveh.samplemarket.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.kaaveh.samplemarket.repository.ItemRepository

class ExploreViewModelFactory(private val repository: ItemRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(ItemRepository::class.java).newInstance(repository)
    }
}