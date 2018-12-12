package com.chatbot.chatbotconfig.dao;

import com.chatbot.chatbotconfig.pojo.Robot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
public interface RobotDao extends JpaRepository<Robot, String>, JpaSpecificationExecutor<Robot> {

}
