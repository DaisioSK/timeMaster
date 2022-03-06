package com.chakura.timemaster.controller;

import com.chakura.timemaster.service.RelnEventCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/relnEvencategory")
public class RelnEventCategoryController {

    @Autowired
    private RelnEventCategoryService relnEventCategoryService;

    // @PostMapping("/list")
    // public CommonRespDto<PageResult<RelnEvencategoryDto>> findRelnEvencategory(@RequestBody RelnEvencategoryListForm relnEvencategoryListForm){
    //     PageResult<RelnEvencategoryDto> pageResult = relnEvencategoryService.findPage(relnEvencategoryListForm);
    //
    //     return new CommonRespDto<>();
    // }
    //
    // @PutMapping("/create")
    // public BaseRespDto createRelnEvencategory(@RequestBody RelnEvencategoryForm relnEvencategoryForm){
    //     relnEvencategoryService.createRelnEvencategory(relnEvencategoryForm);
    //     return new BaseRespDto();
    // }
    //
    // @PutMapping("/modify")
    // public BaseRespDto modifyRelnEvencategory(@RequestBody RelnEvencategoryForm relnEvencategoryForm){
    //     relnEvencategoryService.modifyRelnEvencategory(relnEvencategoryForm);
    //     return new BaseRespDto();
    // }
    //
    // @DeleteMapping("/delete")
    // public BaseRespDto delete(){
    //     return new BaseRespDto();
    // }

}
