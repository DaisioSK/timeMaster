package com.chakura.timemaster.controller;

import com.chakura.timemaster.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // @PostMapping("/list")
    // public CommonRespDto<PageResult<CategoryDto>> findCategory(@RequestBody CategoryListForm categoryListForm){
    //     PageResult<CategoryDto> pageResult = categoryService.findPage(categoryListForm);
    //
    //     return new CommonRespDto<>();
    // }
    //
    // @PutMapping("/create")
    // public BaseRespDto createCategory(@RequestBody CategoryForm categoryForm){
    //     categoryService.createCategory(categoryForm);
    //     return new BaseRespDto();
    // }
    //
    // @PutMapping("/modify")
    // public BaseRespDto modifyCategory(@RequestBody CategoryForm categoryForm){
    //     categoryService.modifyCategory(categoryForm);
    //     return new BaseRespDto();
    // }
    //
    // @DeleteMapping("/delete")
    // public BaseRespDto delete(){
    //     return new BaseRespDto();
    // }

}
