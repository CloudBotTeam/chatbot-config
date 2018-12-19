package cn.chatbot.chatbotconfig.controller;

import cn.chatbot.chatbotconfig.pojo.Group;
import cn.chatbot.chatbotconfig.entity.Result;
import cn.chatbot.chatbotconfig.entity.StatusCode;
import cn.chatbot.chatbotconfig.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@RestController
@CrossOrigin
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    /**
     * 获取所有 group
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Group> findAll() {
        List<Group> groups = groupService.findAll();
        return groups;
    }

    /**
     * 添加/更新一个 group
     * @param group
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Group group) {
        groupService.add(group);
        return new Result(StatusCode.OK, "添加成功");
    }

//    /**
//     * 更新一个 group
//     * @param group
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.POST)
//    public Result update(@RequestBody Group group) {
//        groupService.update(group);
//        return new Result(StatusCode.OK, "更新成功");
//    }

    /**
     * 删除一个 group
     * @param groupId
     * @return
     */
    @RequestMapping(value = "/{groupId}", method = RequestMethod.DELETE)
    public Result deleteByBotName(@PathVariable String groupId) {
        groupService.deleteByBotName(groupId);
        return new Result(StatusCode.OK, "删除成功");
    }

    /**
     * 删除所有 group
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteAll() {
        groupService.deleteAll();
        return new Result(StatusCode.OK, "删除成功");
    }
}
