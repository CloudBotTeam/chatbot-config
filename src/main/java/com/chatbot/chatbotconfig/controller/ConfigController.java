package com.chatbot.chatbotconfig.controller;


import com.chatbot.chatbotconfig.entity.Config;
import com.chatbot.chatbotconfig.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Config微服务Controller
 *
 * @author Chudi-LAN
 *
 * @version 0.0.1
 *
 * @date 2018-12-11
 *
 */

@RestController
public class ConfigController {

    @Autowired
    private IConfigService iConfigService;

    @GetMapping("/config/{groupID}")
    public List<Config> findConfigByGroupId(@PathVariable String groupID) {
        return this.iConfigService.findConfigByGroupId(groupID);
    }

    @PostMapping("/config/addConfig")
    public Config addConfig(@RequestParam(value = "groupId") String groupId,
                            @RequestParam(value = "serviceID") String serviceId,
                            @RequestParam(value = "serviceType") String serviceType,
                            @RequestParam(value = "serviceName") String serviceName) {
        Config config = new Config(groupId, serviceId, serviceType, serviceName);

        if(iConfigService.insertConfig(config)) {
            return config;
        }

        return null;
    }
}
