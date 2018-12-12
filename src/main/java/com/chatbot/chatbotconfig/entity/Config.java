package com.chatbot.chatbotconfig.entity;

import javax.persistence.*;

@Entity
@Table(name = "configuration")
public class Config {
    @EmbeddedId
    private GroupService group_service;

    @Column
    private String service_type;

    @Column
    private String service_name;

    public Config(String group_id, String service_id, String service_type, String service_name) {
        this.group_service = new GroupService(group_id, service_id);
        this.service_type = service_type;
        this.service_name = service_name;
    }

    public String getGroupId() {
        return group_service.getGroup_id();
    }

    public String getServiceId() {
        return group_service.getService_id();
    }

    public GroupService getGroup_service() {
        return group_service;
    }

    public String getService_type() {
        return service_type;
    }

    public String getService_name() {
        return service_name;
    }

    @Override
    public String toString() {
        return "Config [groupId=" + group_service.getGroup_id()+", serviceId=" + group_service.getService_id() +
                ", serviceType=" + service_type + ", serviceName=" + service_name + "]";
    }
}
