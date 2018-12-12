package com.chatbot.chatbotconfig.controller;

import com.chatbot.chatbotconfig.entity.Result;
import com.chatbot.chatbotconfig.entity.StatusCode;
import com.chatbot.chatbotconfig.pojo.group.service.GroupService;
import com.chatbot.chatbotconfig.pojo.group.service.GroupServicePrimaryKey;
import com.chatbot.chatbotconfig.service.GroupServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@CrossOrigin
@RestController
@RequestMapping("/group")
public class GroupServiceController {

    @Autowired
    private GroupServiceService groupServiceService;

    /**
     * 添加一对 group service
     * @param groupId
     * @param serviceId
     * @return
     */
    @RequestMapping(value = "/{groupId}/service/{serviceId}", method = RequestMethod.POST)
    public Result add(@PathVariable String groupId, @PathVariable String serviceId) {
        GroupServicePrimaryKey groupServicePrimaryKey = new GroupServicePrimaryKey(groupId, serviceId);
        GroupService groupService = new GroupService(groupServicePrimaryKey);
        groupServiceService.add(groupService);
        return new Result(StatusCode.OK, "添加成功");
    }


    /**
     * 删除一对 group service
     * @param groupId
     * @param serviceId
     * @return
     */
    @RequestMapping(value = "/{groupId}/service/{serviceId}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable String groupId, @PathVariable String serviceId) {
        GroupServicePrimaryKey groupServicePrimaryKey = new GroupServicePrimaryKey(groupId, serviceId);
        GroupService groupService = new GroupService(groupServicePrimaryKey);
        groupServiceService.delete(groupService);
        return new Result(StatusCode.OK, "删除成功");
    }

    /**
     * 获取某个 group 对应的所有服务
     * @param groupId
     * @return
     */
    @RequestMapping(value = "/{groupId}", method = RequestMethod.GET)
    private Result findServicesByGroupId(@PathVariable String groupId) {
        List<String> serviceIds = groupServiceService.findServicesByGroupId(groupId);
        return new Result(StatusCode.OK, "查找成功", serviceIds);
    }

}
