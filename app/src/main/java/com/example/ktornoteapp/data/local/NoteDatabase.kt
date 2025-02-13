package com.example.ktornoteapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ktornoteapp.data.local.dao.NoteDao
import com.example.ktornoteapp.data.local.models.LocalNote


@Database(
    entities = [LocalNote::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun getNoteDao(): NoteDao
}