package cn.chatbot.chatbotconfig.service;

import cn.chatbot.chatbotconfig.dao.GroupServiceDao;
import cn.chatbot.chatbotconfig.pojo.group.service.GroupService;
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
public class GroupServiceService {

    @Autowired
    private GroupServiceDao groupServiceDao;

    /**
     * 增加一组group和service的对应关系
     * @param groupService
     */
    public void add(cn.chatbot.chatbotconfig.pojo.group.service.GroupService groupService) {
        groupServiceDao.save(groupService);
    }

    /**
     * 删除一组group和service的对应关系
     * @param groupService
     */
    public void delete(GroupService groupService) {
        groupServiceDao.delete(groupService);
    }

//    /**
//     * 修改一组group和service的对应关系
//     * @param groupService
//     */
//    public void update(GroupService groupService) {
//        groupServiceDao.save(groupService);
//    }

    /**
     * 通过group_id查找对应的所有服务
     * @param groupId
     * @return
     */
    public List<String> findServicesByGroupId(String groupId) {
        return groupServiceDao.findServicesByGroupId(groupId);
    }

}
