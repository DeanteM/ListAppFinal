// ListModel.kt
package com.example.listapp.models

data class ListModel(
    val id: Int,
    val name: String,
    val description: String,
    val imageUri: String,
    val isPrivate: Boolean,
    val ratingScale: String,
    val entries: MutableList<EntryModel> = mutableListOf()
)
