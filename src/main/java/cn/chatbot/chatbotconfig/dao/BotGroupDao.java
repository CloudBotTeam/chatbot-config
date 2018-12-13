package cn.chatbot.chatbotconfig.dao;

import cn.chatbot.chatbotconfig.pojo.bot.group.BotGroup;
import cn.chatbot.chatbotconfig.pojo.bot.group.BotGroupPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
public interface BotGroupDao extends JpaRepository<BotGroup, BotGroupPrimaryKey>, JpaSpecificationExecutor<BotGroup> {

    @Modifying
    @Query(value = "select group_id from group_service where bot_name = ?", nativeQuery = true)
    public List<String> findGroupsByBotName(String botName);
}
