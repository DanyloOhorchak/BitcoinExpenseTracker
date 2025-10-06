package com.example.bitcoinexpensetracker.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TransactionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: TransactionEntity): Long

    @Query("SELECT * FROM transactions ORDER BY timestamp DESC")
    fun pagingSource(): PagingSource<Int, TransactionEntity>

    @Query("SELECT SUM(CASE WHEN type = 'TOP_UP' THEN amountBtc ELSE -amountBtc END) FROM transactions")
    suspend fun getBalance(): Double?
}
