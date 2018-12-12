package com.chatbot.chatbotconfig.service;

import com.chatbot.chatbotconfig.dao.RobotDao;
import com.chatbot.chatbotconfig.pojo.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Service
@Transactional
public class RobotService {

    @Autowired
    private RobotDao robotDao;

    /**
     * 获取所有robot
     */
    public List<Robot> findAll() {
        return robotDao.findAll();
    }

    /**
     * 添加一个robot
     */
    public void add(Robot robot) {
        robotDao.save(robot);
    }

    /**
     * 更新一个robot
     */
    public void update(Robot robot) {
        robotDao.save(robot);
    }

    /**
     * 删除一个robot
     */
    public void deleteByBotName(String botName) {
        robotDao.deleteById(botName);
    }

    /**
     * 删除所有bot
     */
    public void deleteAll() {
        robotDao.deleteAll();
    }

}
