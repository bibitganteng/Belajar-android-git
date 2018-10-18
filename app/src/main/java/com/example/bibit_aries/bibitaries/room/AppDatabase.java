package com.example.bibit_aries.bibitaries.room;

/**
 * Created by bibit_aries on 10/18/2018.
 */

//public class AppDatabase {
//}
@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MahasiswaDao userDao();
}
