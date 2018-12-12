package com.chatbot.chatbotconfig.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Entity
@Table(name = "group")
public class Group {

    @Id
    @Column(name = "group_id")
    private String groupId;

    @Column(name = "group_type")
    private String groupType;
}
