package com.example.watchstore.domain.usecase.getallproduct

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

class GetAllProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<List<ProductItem>> = repository.getAllProduct()

}