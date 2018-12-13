package cn.chatbot.chatbotconfig.pojo.group.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "group_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupService implements Serializable {

    @EmbeddedId
    private GroupServicePrimaryKey groupServicePrimaryKey;
}
