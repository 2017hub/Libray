package com.universtiy.libray.jedisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisDemo {
    final Logger logger=LoggerFactory.getLogger(this.getClass());
    @Test
    public void testRedis(){
        //(1)设置IP地址和端口号
        Jedis jedis=new Jedis("192.168.36.128",6379);
        //(2)保存数据
        jedis.set("name","xiaowang");
        logger.info("------------>"+jedis.get("name"));
        //（3）释放资源
        jedis.close();
    }
}
