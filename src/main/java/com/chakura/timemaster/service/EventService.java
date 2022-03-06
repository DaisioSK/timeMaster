package com.chakura.timemaster.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class EventService {

    // public PageResult<EventDto> findPage(EventListForm  eventListForm) {
    //     SearchPage searchPage =  eventListForm.getSearchPage();
    //     QueryWrapper<Event> queryWrapper = new QueryWrapper<>();
    //     PageResult<Event> pageData = this.findPage(searchPage, queryWrapper);
    //     return this.changePageResult(pageData, EventDto.class);
    // }
    //
    // public void createEvent(EventForm eventForm) {
    //     Event event = convertEvent(eventForm);
    //
    //     this.save(event);
    //
    //     return this.convertEvent(event);
    // }
    //
    // public void modifyEvent(EventForm eventForm) {
    //     Event event = convertEvent(eventForm);
    //
    //     this.updateById(event);
    //
    //     return this.convertEvent(event);
    // }
}

