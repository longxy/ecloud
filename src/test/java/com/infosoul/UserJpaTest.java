package com.infosoul;

import com.infosoul.domain.User;
import com.infosoul.repo.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author longxy
 * @version V1.0
 * @date 2016-11-05 15:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserJpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{

        // 创建2条记录
        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));

        // 测试findAll，查询所有记录
        Assert.assertEquals(2, userRepository.findAll().size());

        // 测试findByName，查询姓名为AAA的User
        Assert.assertEquals(10, userRepository.findByName("AAA").getAge().intValue());

        // 测试findUser，查询姓名为AAA的User
        Assert.assertEquals(10, userRepository.findUser("AAA").getAge().intValue());

        // 测试findByNameAndAge, 查询姓名为AAA并且年龄为10的User
        Assert.assertEquals("AAA", userRepository.findByNameAndAge("AAA", 10).getName());

        // 测试删除姓名为AAA的User
        userRepository.delete(userRepository.findByName("AAA"));

        // 测试findAll，查询所有记录，验证上面的删除是否成功
        Assert.assertEquals(1, userRepository.findAll().size());
    }
}
