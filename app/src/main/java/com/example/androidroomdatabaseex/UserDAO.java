package com.example.androidroomdatabaseex;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

// Data Access Object

@Dao
public interface UserDAO {
    @Insert // 삽입
    void setInsertUser(User user);

    @Update // 수정
    void setUpdateUser(User user);

    @Delete // 삭제
    void setDeleteUser(User user);

    // 조회
    @Query("select * from user") // 쿼리 : 데이터베이스에 요청하는 명령문
    List<User> getUserAll();

}
