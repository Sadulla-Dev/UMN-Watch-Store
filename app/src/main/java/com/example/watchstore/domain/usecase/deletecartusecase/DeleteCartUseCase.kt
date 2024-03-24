package com.example.watchstore.domain.usecase.deletecartusecase

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem

class DeleteCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.deleteCart(productItem)

}