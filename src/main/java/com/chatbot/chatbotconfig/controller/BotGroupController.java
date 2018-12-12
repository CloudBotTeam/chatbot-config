package com.chatbot.chatbotconfig.controller;

import com.chatbot.chatbotconfig.entity.Result;
import com.chatbot.chatbotconfig.entity.StatusCode;
import com.chatbot.chatbotconfig.pojo.bot.group.BotGroup;
import com.chatbot.chatbotconfig.pojo.bot.group.BotGroupPrimaryKey;
import com.chatbot.chatbotconfig.pojo.group.service.GroupService;
import com.chatbot.chatbotconfig.pojo.group.service.GroupServicePrimaryKey;
import com.chatbot.chatbotconfig.service.BotGroupService;
import com.sun.org.glassfish.external.statistics.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@CrossOrigin
@RestController
@RequestMapping("/bot")
public class BotGroupController {

    @Autowired
    private BotGroupService botGroupService;

    /**
     * 添加一对 bot group
     * @param botName
     * @param groupId
     * @return
     */
    @RequestMapping(value = "/{botName}/group/{groupId}", method = RequestMethod.POST)
    public Result add(@PathVariable String botName, @PathVariable String groupId) {
        BotGroupPrimaryKey botGroupPrimaryKey = new BotGroupPrimaryKey(botName, groupId);
        BotGroup botGroup = new BotGroup(botGroupPrimaryKey);
        botGroupService.add(botGroup);
        return new Result(StatusCode.OK, "添加成功");
    }

    /**
     * 删除一对 bot group
     * @param botName
     * @param groupId
     * @return
     */
    @RequestMapping(value = "/{botName}/group/{groupId}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable String botName, @PathVariable String groupId) {
        BotGroupPrimaryKey botGroupPrimaryKey = new BotGroupPrimaryKey(botName, groupId);
        BotGroup botGroup = new BotGroup(botGroupPrimaryKey);
        botGroupService.delete(botGroup);
        return new Result(StatusCode.OK, "删除成功");
    }

    /**
     * 通过botName找到它对应的所有group
     * @param botName
     * @return
     */
    @RequestMapping(value = "{botName}", method = RequestMethod.GET)
    public Result findGroupsByBotName(@PathVariable String botName) {
        List<String> groupIds = botGroupService.findGroupsByBotName(botName);
        return new Result(StatusCode.OK, "查找成功", groupIds);
    }
}
