package com.example.bitcoinexpensetracker.data.local

import androidx.room.TypeConverter
import com.example.bitcoinexpensetracker.data.model.Category
import com.example.bitcoinexpensetracker.data.model.TransactionType
import java.math.BigDecimal

class Converters {
    @TypeConverter
    fun bigDecimalFromString(value: String?): BigDecimal? = value?.let { BigDecimal(it) }

    @TypeConverter
    fun bigDecimalToString(value: BigDecimal?): String? = value?.toPlainString()

    @TypeConverter
    fun categoryFromString(value: String?): Category? = value?.let { Category.valueOf(it) }

    @TypeConverter
    fun categoryToString(value: Category?): String? = value?.name

    @TypeConverter
    fun typeFromString(value: String): TransactionType = TransactionType.valueOf(value)

    @TypeConverter
    fun typeToString(value: TransactionType): String = value.name
}