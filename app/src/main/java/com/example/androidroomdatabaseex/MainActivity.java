package com.example.androidroomdatabaseex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private UserDAO mUserDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "user_db")
                .fallbackToDestructiveMigration()   // 스키마(Database) 버젼 변경 가능
                .allowMainThreadQueries()           // Main Thread에서 DB에 IO(입출력, Input/Output)를 가능하게 함
                .build();

        mUserDAO = database.userDAO();   // 인터페이스 객체 할당

        // 데이터 삽입
        User user = new User();   // 객체 인스턴스 생성
        user.setName("Test");
        user.setAge("20");
        user.setPhoneNumber("01012341234");

        mUserDAO.setInsertUser(user);


        List<User> userList = mUserDAO.getUserAll();
        // 데이터 조히
        for (int i = 0; i < userList.size(); i++) {
            Log.d("Test", userList.get(i).getName() + "\n" +
                    userList.get(i).getAge() + "\n" +
                    userList.get(i).getPhoneNumber());
        }

    }
}
