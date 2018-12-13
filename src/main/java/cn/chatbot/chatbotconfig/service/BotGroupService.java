package cn.chatbot.chatbotconfig.service;

import cn.chatbot.chatbotconfig.pojo.bot.group.BotGroup;
import cn.chatbot.chatbotconfig.dao.BotGroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/

@Service
@Transactional
public class BotGroupService {

    @Autowired
    private BotGroupDao botGroupDao;

    /**
     * 增加一组bot和group的对应关系
     * @param botGroup
     */
    public void add(BotGroup botGroup) {
        botGroupDao.save(botGroup);
    }

    /**
     * 删除一组bot和group的对应关系
     * @param botGroup
     */
    public void delete(BotGroup botGroup) {
        botGroupDao.delete(botGroup);
    }

//    /**
//     * 修改一组bot和group的对应关系
//     * @param botGroup
//     */
//    public void update(BotGroup botGroup) {
//        botGroupDao.save(botGroup);
//    }

    /**
     * 通过bot_name查找对应的所有group
     * @param botName
     * @return
     */
    public List<String> findGroupsByBotName(String botName) {
        return botGroupDao.findGroupsByBotName(botName);
    }
}
