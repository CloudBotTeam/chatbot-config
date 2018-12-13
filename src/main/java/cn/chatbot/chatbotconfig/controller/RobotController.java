package cn.chatbot.chatbotconfig.controller;

import cn.chatbot.chatbotconfig.entity.Result;
import cn.chatbot.chatbotconfig.entity.StatusCode;
import cn.chatbot.chatbotconfig.pojo.Robot;
import cn.chatbot.chatbotconfig.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@CrossOrigin
@RestController
@RequestMapping("/bots")
public class RobotController {

    @Autowired
    private RobotService robotService;

    /**
     * 获取所有robot
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        List<Robot> robots = robotService.findAll();
        return new Result(StatusCode.OK, "查找成功", robots);
    }

    /**
     * 添加/更新一个 robot
     * @param robot
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Robot robot) {
        robotService.add(robot);
        return new Result(StatusCode.OK, "添加成功");
    }
//
//    /**
//     * 更新一个 robot
//     * @param robot
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.POST)
//    public Result update(@RequestBody Robot robot) {
//        robotService.update(robot);
//        return new Result(StatusCode.OK, "更新成功");
//    }

    /**
     * 删除一个 robot
     * @param botName
     * @return
     */
    @RequestMapping(value = "/{botName}", method = RequestMethod.DELETE)
    public Result deleteByBotName(@PathVariable String botName) {
        robotService.deleteByBotName(botName);
        return new Result(StatusCode.OK, "删除成功");
    }

    /**
     * 删除所有 robot
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteAll() {
        robotService.deleteAll();
        return new Result(StatusCode.OK, "删除成功");
    }

}
