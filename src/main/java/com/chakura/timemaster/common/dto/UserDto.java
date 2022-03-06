package com.chakura.timemaster.common.dto;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private Integer id;
        private String name;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String phone;
        private String encryptPwd;
        private String hashedPwd;
        private Date dateOfBirth;
        private Integer status;
        private String locale;
        private String country;
        private Integer timezone;
        private String avatarPath;
        private String lastLoginAddr;
        private Date lastLoginTime;
        private Date createTime;
        private Date modifyTime;
    }