package cn.chatbot.chatbotconfig.controller;

import cn.chatbot.chatbotconfig.service.ServiceService;
import cn.chatbot.chatbotconfig.entity.Result;
import cn.chatbot.chatbotconfig.entity.StatusCode;
import cn.chatbot.chatbotconfig.pojo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
@CrossOrigin
@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    /**
     * 获取所有 service
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        List<Service> services = serviceService.findAll();
        return new Result(StatusCode.OK, "查找成功", services);
    }

    /**
     * 添加/更新一个 service
     * @param service
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Service service) {
        serviceService.add(service);
        return new Result(StatusCode.OK, "添加成功");
    }

//    /**
//     * 更新一个 service
//     * @param service
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.POST)
//    public Result update(@RequestBody Service service) {
//        serviceService.update(service);
//        return new Result(StatusCode.OK, "更新成功");
//    }

    /**
     * 删除一个 service
     * @param serviceId
     * @return
     */
    @RequestMapping(value = "/{serviceId}", method = RequestMethod.DELETE)
    public Result deleteByBotName(@PathVariable String serviceId) {
        serviceService.deleteByBotName(serviceId);
        return new Result(StatusCode.OK, "删除成功");
    }

    /**
     * 删除所有 service
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public Result deleteAll() {
        serviceService.deleteAll();
        return new Result(StatusCode.OK, "删除成功");
    }
}
