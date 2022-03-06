package com.chakura.timemaster.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {

    // public PageResult<UserDto> findPage(UserListForm  userListForm) {
    //     SearchPage searchPage =  userListForm.getSearchPage();
    //     QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    //     PageResult<User> pageData = this.findPage(searchPage, queryWrapper);
    //     return this.changePageResult(pageData, UserDto.class);
    // }
    //
    // public void createUser(UserForm userForm) {
    //     User user = convertUser(userForm);
    //
    //     this.save(user);
    //
    //     return this.convertUser(user);
    // }
    //
    // public void modifyUser(UserForm userForm) {
    //     User user = convertUser(userForm);
    //
    //     this.updateById(user);
    //
    //     return this.convertUser(user);
    // }
}

