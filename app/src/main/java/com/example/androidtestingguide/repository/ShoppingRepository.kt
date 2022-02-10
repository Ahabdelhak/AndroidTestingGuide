package com.example.androidtestingguide.repository

import androidx.lifecycle.LiveData
import com.example.androidtestingguide.data.local.ShoppingItem
import com.example.androidtestingguide.data.remote.responses.ImageResponse
import com.example.androidtestingguide.utils.Resource

interface ShoppingRepository {
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}