package com.example.watchstore.presentation.screen.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.database.database
import dagger.hilt.android.lifecycle.HiltViewModel
import com.example.watchstore.domain.model.ProductItem
import com.example.watchstore.domain.usecase.UseCases
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val useCases: UseCases
) : ViewModel() {

    private val isCart = true

    private val database = Firebase.database
    private val myRef = database.getReference("Watch Store")


    private val _productCartList = MutableStateFlow<List<ProductItem>>(emptyList())
    val productCartList = _productCartList.asStateFlow()

    init {
        getAllProductCartList()
    }

    private fun getAllProductCartList() {
        viewModelScope.launch(Dispatchers.IO) {
            useCases.getAllCartUseCase.invoke(isCart).collect { values ->
                _productCartList.value = values
            }
        }
    }

    fun deleteCart(productItem: ProductItem) {
        viewModelScope.launch(Dispatchers.IO) {
            useCases.deleteCart.invoke(productItem)
        }
    }

    fun cartSelectedItem(productItem: ProductItem) {
        val messagePref = myRef.child(productItem.title)
        messagePref.setValue(productItem)
    }
}