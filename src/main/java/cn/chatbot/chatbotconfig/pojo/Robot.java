package cn.chatbot.chatbotconfig.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
@Entity
@Table(name="robot")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Robot {

    @Id
    private String name;

    private String status;

    private String type;
}
