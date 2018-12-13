package cn.chatbot.chatbotconfig.service;

import cn.chatbot.chatbotconfig.dao.ServiceDao;
import cn.chatbot.chatbotconfig.pojo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: Chen Yulei
 * @since: 2018-12-12
 **/
@org.springframework.stereotype.Service
@Transactional
public class ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    /**
     * 获取所有service
     */
    public List<Service> findAll() {
        return serviceDao.findAll();
    }

    /**
     * 添加一个service
     */
    public void add(Service service) {
        serviceDao.save(service);
    }

    /**
     * 更新一个service
     */
    public void update(Service service) {
        serviceDao.save(service);
    }

    /**
     * 删除一个service
     */
    public void deleteByBotName(String serviceId) {
        serviceDao.deleteById(serviceId);
    }

    /**
     * 删除所有service
     */
    public void deleteAll() {
        serviceDao.deleteAll();
    }

}
