package com.infosoul;

import com.infosoul.domain.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * redis 测试类
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-09 10:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

    /*@Autowired
    private StringRedisTemplate stringRedisTemplate;*/

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate<String, Person> redisTemplate;

    @Test
    public void test() throws Exception{
        /*stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));*/

        //  保存对象
        /*Person person = new Person("超人", 20);
        redisTemplate.opsForValue().set(person.getName(), person);
        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().intValue());*/

    }
}
