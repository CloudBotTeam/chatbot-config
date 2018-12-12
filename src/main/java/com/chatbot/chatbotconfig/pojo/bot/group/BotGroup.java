package com.chatbot.chatbotconfig.pojo.bot.group;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Entity
@Table(name = "bot_group")
@Data
@AllArgsConstructor
public class BotGroup implements Serializable {

    @EmbeddedId
    private BotGroupPrimaryKey botGroupPrimaryKey;
}
