package cn.chatbot.chatbotconfig.service;

import cn.chatbot.chatbotconfig.pojo.Group;
import cn.chatbot.chatbotconfig.dao.GroupDao;
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
public class GroupService {

    @Autowired
    private GroupDao groupDao;


    /**
     * 获取所有group
     */
    public List<Group> findAll() {
        return groupDao.findAll();
    }

    /**
     * 添加一个group
     */
    public void add(Group group) {
        groupDao.save(group);
    }

    /**
     * 更新一个group
     */
    public void update(Group group) {
        groupDao.save(group);
    }

    /**
     * 删除一个group
     */
    public void deleteByBotName(String groupId) {
        groupDao.deleteById(groupId);
    }

    /**
     * 删除所有group
     */
    public void deleteAll() {
        groupDao.deleteAll();
    }


}
