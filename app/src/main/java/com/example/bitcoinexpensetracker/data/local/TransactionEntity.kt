package com.example.bitcoinexpensetracker.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.bitcoinexpensetracker.data.model.Category
import com.example.bitcoinexpensetracker.data.model.TransactionType
import java.math.BigDecimal

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val type: TransactionType,
    val amountBtc: BigDecimal,
    val category: Category?,
    val timestamp: Long,
)