package cn.chatbot.chatbotconfig.dao;

import cn.chatbot.chatbotconfig.pojo.group.service.GroupService;
import cn.chatbot.chatbotconfig.pojo.group.service.GroupServicePrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
public interface GroupServiceDao extends JpaRepository<GroupService, GroupServicePrimaryKey>, JpaSpecificationExecutor<GroupService> {

    @Modifying
    @Query(value = "select service_id from group_service where group_id = ?", nativeQuery = true)
    public List<String> findServicesByGroupId(String groupId);

}
