package com.chakura.timemaster.common.dto;
import lombok.Data;

import java.util.Date;

@Data
public class EventDto {

    private Integer id;
        private String uuid;
        private String name;
        private Integer userId;
        private String ringtoneId;
        private String notificationMsg;
        private String location;
        private String description;
        private Date startTime;
        private Date endTime;
        private Date createTime;
        private Date modifyTime;
    }