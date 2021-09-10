package com.example.androidroomdatabaseex;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// 일반적인 클래스로 사용하는 것이 아닌 데이터 모델

@Entity
public class User {
    // id값이 자동으로 생성(1씩 올라감)
    @PrimaryKey(autoGenerate = true)
    private int id = 0; // 하나의 사용자에 대한 고유 ID 값

    private String name;

    private String age;

    private String phoneNumber;

    // getter & setter 가져오거나... 세팅을 하기 위한 단계
    // Alt + Insert를 누르면 쉽게 사용 가능
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
