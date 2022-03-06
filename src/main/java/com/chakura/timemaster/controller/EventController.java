package com.chakura.timemaster.controller;

import com.chakura.timemaster.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    // @PostMapping("/list")
    // public CommonRespDto<PageResult<EventDto>> findEvent(@RequestBody EventListForm eventListForm){
    //     PageResult<EventDto> pageResult = eventService.findPage(eventListForm);
    //
    //     return new CommonRespDto<>();
    // }
    //
    // @PutMapping("/create")
    // public BaseRespDto createEvent(@RequestBody EventForm eventForm){
    //     eventService.createEvent(eventForm);
    //     return new BaseRespDto();
    // }
    //
    // @PutMapping("/modify")
    // public BaseRespDto modifyEvent(@RequestBody EventForm eventForm){
    //     eventService.modifyEvent(eventForm);
    //     return new BaseRespDto();
    // }
    //
    // @DeleteMapping("/delete")
    // public BaseRespDto delete(){
    //     return new BaseRespDto();
    // }

}
