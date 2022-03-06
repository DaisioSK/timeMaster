package com.chakura.timemaster.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class RelnEventCategoryService {

    // public PageResult<RelnEvencategoryDto> findPage(RelnEvencategoryListForm  relnEvencategoryListForm) {
    //     SearchPage searchPage =  relnEvencategoryListForm.getSearchPage();
    //     QueryWrapper<RelnEvencategory> queryWrapper = new QueryWrapper<>();
    //     PageResult<RelnEvencategory> pageData = this.findPage(searchPage, queryWrapper);
    //     return this.changePageResult(pageData, RelnEvencategoryDto.class);
    // }
    //
    // public void createRelnEvencategory(RelnEvencategoryForm relnEvencategoryForm) {
    //     RelnEvencategory relnEvencategory = convertRelnEvencategory(relnEvencategoryForm);
    //
    //     this.save(relnEvencategory);
    //
    //     return this.convertRelnEvencategory(relnEvencategory);
    // }
    //
    // public void modifyRelnEvencategory(RelnEvencategoryForm relnEvencategoryForm) {
    //     RelnEvencategory relnEvencategory = convertRelnEvencategory(relnEvencategoryForm);
    //
    //     this.updateById(relnEvencategory);
    //
    //     return this.convertRelnEvencategory(relnEvencategory);
    // }
}

