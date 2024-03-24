package com.example.watchstore.domain.usecase.searchproductusecase

import com.example.watchstore.data.repository.Repository

class SearchProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(query: String) = repository.searchProduct(query)

}