package com.chatbot.chatbotconfig.service.impl;

import com.chatbot.chatbotconfig.entity.Config;
import com.chatbot.chatbotconfig.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigServiceImpl implements IConfigService {
    // TODO: implement config service
    @Override
    public List<Config> findConfigByGroupId(String groupId) {
        return null;
    }

    @Override
    public List<Config> findAllConfig() {
        return null;
    }

    @Override
    public boolean insertConfig(Config config) {
        return false;
    }
}
