package com.chatbot.chatbotconfig.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GroupService implements Serializable {
    private String group_id;
    private String service_id;

    GroupService(String group_id, String service_id){
        this.group_id = group_id;
        this.service_id = service_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public String getService_id() {
        return service_id;
    }

    @Override
    public String toString() {
        return "GroupService [groupID=" + group_id +", serviceID=" + service_id + "]";
    }
}
