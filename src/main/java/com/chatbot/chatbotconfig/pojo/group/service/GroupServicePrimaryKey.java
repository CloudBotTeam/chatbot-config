package com.chatbot.chatbotconfig.pojo.group.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/** 联合主键
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Embeddable //联合主键
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupServicePrimaryKey implements Serializable {

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "service_id")
    private String serviceId;
}
