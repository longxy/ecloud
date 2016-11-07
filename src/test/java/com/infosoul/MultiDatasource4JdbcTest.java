package com.infosoul;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 多数据源测试
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-05 17:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MultiDatasource4JdbcTest {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Before
    public void setUp() {
        jdbcTemplate1.update("DELETE FROM USER ");
        jdbcTemplate2.update("DELETE FROM USER ");
    }

    @Test
    public void test() throws Exception {

        //  往第一个数据源中插入两条数据
        jdbcTemplate1.update("INSERT INTO USER(id, name, age) VALUES(?, ?, ?)", 1, "aa", 20);
        jdbcTemplate1.update("INSERT INTO USER(id, name, age) VALUES(?, ?, ?)", 2, "bb", 30);

        // 往第二个数据库中插入一条数据
        jdbcTemplate2.update("INSERT INTO USER(id, name, age) VALUES(?, ?, ?)", 1, "aaa", 20);

        // 查一下第一个数据源中是否有两条数据
        Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from user", String.class));

        // 查一下第一个数据源中是否有两条数据
        Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
    }
}
