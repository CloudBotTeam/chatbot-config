package cn.chatbot.chatbotconfig.dao;

import cn.chatbot.chatbotconfig.pojo.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
public interface GroupDao extends JpaRepository<Group, String>, JpaSpecificationExecutor<Group> {


}
