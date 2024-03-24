package com.example.watchstore.domain.usecase.saveproductusecase

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem

class InsertProductsUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(products: List<ProductItem>) = repository.insertProducts(products)

}