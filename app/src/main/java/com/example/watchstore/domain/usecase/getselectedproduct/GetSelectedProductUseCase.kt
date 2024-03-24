package com.example.watchstore.domain.usecase.getselectedproduct

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem

class GetSelectedProductUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productId: Int): ProductItem {
        return repository.getSelectedProduct(productId = productId)
    }

}