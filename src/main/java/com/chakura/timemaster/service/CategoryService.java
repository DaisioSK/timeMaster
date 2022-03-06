package com.chakura.timemaster.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CategoryService {

    // public PageResult<CategoryDto> findPage(CategoryListForm  categoryListForm) {
    //     SearchPage searchPage =  categoryListForm.getSearchPage();
    //     QueryWrapper<Category> queryWrapper = new QueryWrapper<>();
    //     PageResult<Category> pageData = this.findPage(searchPage, queryWrapper);
    //     return this.changePageResult(pageData, CategoryDto.class);
    // }
    //
    // public void createCategory(CategoryForm categoryForm) {
    //     Category category = convertCategory(categoryForm);
    //
    //     this.save(category);
    //
    //     return this.convertCategory(category);
    // }
    //
    // public void modifyCategory(CategoryForm categoryForm) {
    //     Category category = convertCategory(categoryForm);
    //
    //     this.updateById(category);
    //
    //     return this.convertCategory(category);
    // }
}

