package com.example.listapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listapp.models.ListModel

class ListViewModel : ViewModel() {
    private val _lists = MutableLiveData<MutableList<ListModel>>(mutableListOf())
    val lists: LiveData<MutableList<ListModel>> get() = _lists

    fun addList(list: ListModel) {
        _lists.value?.add(list)
        _lists.value = _lists.value
    }
}
