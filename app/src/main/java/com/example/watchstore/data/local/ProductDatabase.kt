package com.example.watchstore.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.watchstore.data.local.dao.ProductDao
import com.example.watchstore.domain.model.ProductItem

@Database(entities = [ProductItem::class], version = 2)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}