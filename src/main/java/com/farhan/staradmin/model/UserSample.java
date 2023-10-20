package com.farhan.staradmin.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class UserSample {
    Integer id;
    String familyName;
    String firstName;
    String familyKanaName;
    String firstKanaName;
    LocalDate birthday;
    String gender;
    String office;
    String tel;
    String mail;
    Boolean isQuit;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
