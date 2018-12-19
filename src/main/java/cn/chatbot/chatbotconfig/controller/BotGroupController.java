package cn.chatbot.chatbotconfig.controller;

import cn.chatbot.chatbotconfig.entity.Result;
import cn.chatbot.chatbotconfig.entity.StatusCode;
import cn.chatbot.chatbotconfig.pojo.bot.group.BotGroup;
import cn.chatbot.chatbotconfig.pojo.bot.group.BotGroupPrimaryKey;
import cn.chatbot.chatbotconfig.service.BotGroupService;
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
    @RequestMapping(value = "/{botName}/group", method = RequestMethod.GET)
    public List<String> findGroupsByBotName(@PathVariable String botName) {
        List<String> groupIds = botGroupService.findGroupsByBotName(botName);
        return groupIds;
    }
}
