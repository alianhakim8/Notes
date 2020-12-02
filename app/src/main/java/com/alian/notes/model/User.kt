package com.alian.notes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
//
//    @PrimaryKey(autoGenerate = true)
//    var id: Int,
    @ColumnInfo(name = "first_name")
    var firstName: String?,
    @ColumnInfo(name = "last_name")
    var lastName: String?
)