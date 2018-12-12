package com.chatbot.chatbotconfig.service;

import com.chatbot.chatbotconfig.entity.Config;

import java.util.List;

public interface IConfigService {

    List<Config> findConfigByGroupId(String groupId);

    List<Config> findAllConfig();

    boolean insertConfig(Config config);
}
