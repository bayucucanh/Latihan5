package id.ac.unpas.modul3.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.modul3.model.SetoranSampah

@Database(entities = [SetoranSampah::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranSampahDao(): SetoranSampahDao
}