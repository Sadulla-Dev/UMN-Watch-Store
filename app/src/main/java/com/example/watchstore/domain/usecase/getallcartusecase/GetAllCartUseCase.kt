package com.example.watchstore.domain.usecase.getallcartusecase

import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

class GetAllCartUseCase(
    private val repository: Repository
) {

    operator fun invoke(isCart: Boolean): Flow<List<ProductItem>> =
        repository.getAllProductCart(isCart)

}