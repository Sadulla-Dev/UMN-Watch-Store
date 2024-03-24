package com.example.watchstore.domain.usecase

import com.example.watchstore.domain.usecase.addcartusecase.AddCartUseCase
import com.example.watchstore.domain.usecase.deletecartusecase.DeleteCartUseCase
import com.example.watchstore.domain.usecase.getallcartusecase.GetAllCartUseCase
import com.example.watchstore.domain.usecase.getallproduct.GetAllProductUseCase
import com.example.watchstore.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import com.example.watchstore.domain.usecase.readonboarding.ReadOnBoardingUseCase
import com.example.watchstore.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import com.example.watchstore.domain.usecase.saveproductusecase.InsertProductsUseCase
import com.example.watchstore.domain.usecase.searchproductusecase.SearchProductUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val insertProductsUseCase: InsertProductsUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase,
    val getAllProductUseCase: GetAllProductUseCase,
    val getAllCartUseCase: GetAllCartUseCase,
    val addCartUseCase: AddCartUseCase,
    val deleteCart: DeleteCartUseCase,
    val searchProductUseCase: SearchProductUseCase
)