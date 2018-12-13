package cn.chatbot.chatbotconfig.pojo.bot.group;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Embeddable
@Data
@AllArgsConstructor
public class BotGroupPrimaryKey implements Serializable {

    @Column(name = "bot_name")
    private String botName;

    @Column(name = "group_id")
    private String groupId;

}
