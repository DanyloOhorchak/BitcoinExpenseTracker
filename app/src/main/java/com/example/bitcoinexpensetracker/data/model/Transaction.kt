package com.example.bitcoinexpensetracker.data.model

import java.math.BigDecimal

data class Transaction(
    val id: Long,
    val type: TransactionType,
    val amountBtc: BigDecimal,
    val category: Category?,
    val timestamp: Long,
)
