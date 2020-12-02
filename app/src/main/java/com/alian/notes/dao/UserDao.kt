package com.alian.notes.dao

import androidx.room.*
import com.alian.notes.model.User


@Dao
interface UserDao {

    @Query("SELECT * FROM user ORDER BY id ASC")
    fun getAllUser(): List<User>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user: User)

    @Query("DELETE FROM user")
    suspend fun deleteAll()
}