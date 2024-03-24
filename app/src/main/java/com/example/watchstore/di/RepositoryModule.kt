package com.example.watchstore.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import com.example.watchstore.data.repository.OnBoardingOperationImpl
import com.example.watchstore.data.repository.Repository
import com.example.watchstore.domain.repository.OnBoardingOperations
import com.example.watchstore.domain.usecase.UseCases
import com.example.watchstore.domain.usecase.addcartusecase.AddCartUseCase
import com.example.watchstore.domain.usecase.deletecartusecase.DeleteCartUseCase
import com.example.watchstore.domain.usecase.getallcartusecase.GetAllCartUseCase
import com.example.watchstore.domain.usecase.getallproduct.GetAllProductUseCase
import com.example.watchstore.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import com.example.watchstore.domain.usecase.readonboarding.ReadOnBoardingUseCase
import com.example.watchstore.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import com.example.watchstore.domain.usecase.saveproductusecase.InsertProductsUseCase
import com.example.watchstore.domain.usecase.searchproductusecase.SearchProductUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperation(
        @ApplicationContext context: Context
    ): OnBoardingOperations = OnBoardingOperationImpl(context = context)

    @Provides
    @Singleton
    fun provideUseCase(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            insertProductsUseCase = InsertProductsUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getSelectedProductUseCase = GetSelectedProductUseCase(repository),
            getAllProductUseCase = GetAllProductUseCase(repository),
            getAllCartUseCase = GetAllCartUseCase(repository),
            addCartUseCase = AddCartUseCase(repository),
            deleteCart = DeleteCartUseCase(repository),
            searchProductUseCase = SearchProductUseCase(repository)
        )
    }

}