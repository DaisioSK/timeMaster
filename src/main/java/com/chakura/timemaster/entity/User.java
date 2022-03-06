package com.chakura.timemaster.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

@Data
@TableName("user")
public class User {

	@TableId(type = IdType.AUTO)
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
	@TableField(fill = FieldFill.INSERT)
	private Date createTime;
	@TableField(fill = FieldFill.UPDATE)
	private Date modifyTime;

}
