package com.chakura.timemaster.controller;

import com.chakura.timemaster.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // @PostMapping("/list")
    // public CommonRespDto<PageResult<UserDto>> findUser(@RequestBody UserListForm userListForm){
    //     PageResult<UserDto> pageResult = userService.findPage(userListForm);
    //
    //     return new CommonRespDto<>();
    // }

    // @PutMapping("/create")
    // public BaseRespDto createUser(@RequestBody UserForm userForm){
    //     userService.createUser(userForm);
    //     return new BaseRespDto();
    // }
    //
    // @PutMapping("/modify")
    // public BaseRespDto modifyUser(@RequestBody UserForm userForm){
    //     userService.modifyUser(userForm);
    //     return new BaseRespDto();
    // }
    //
    // @DeleteMapping("/delete")
    // public BaseRespDto delete(){
    //     return new BaseRespDto();
    // }

}
