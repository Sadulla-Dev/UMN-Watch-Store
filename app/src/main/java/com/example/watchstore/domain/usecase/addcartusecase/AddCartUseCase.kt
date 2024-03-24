package com.example.watchstore.domain.usecase.addcartusecase

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem

class AddCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.addCart(productItem)

}