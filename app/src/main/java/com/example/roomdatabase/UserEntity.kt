package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val Id: Long = 0,
    val name: String,
    val phoneNumber: Number,
    val email: String
){

}
