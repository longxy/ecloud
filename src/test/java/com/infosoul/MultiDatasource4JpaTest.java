package com.infosoul;

import com.infosoul.domain.p.User;
import com.infosoul.domain.p.UserRepository;
import com.infosoul.domain.s.Message;
import com.infosoul.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Jpa多数据源测试
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-08 15:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MultiDatasource4JpaTest {

    //@Autowired
    //@Qualifier("userRepository4Jpa")
    //private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception{

        /*userRepository.save(new User("aa", 10));
        Assert.assertEquals(1, userRepository.findAll().size());*/

        messageRepository.save(new Message("01", "test"));
        Assert.assertEquals(1, messageRepository.findAll().size());

    }

}
