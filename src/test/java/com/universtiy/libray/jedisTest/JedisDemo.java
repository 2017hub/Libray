package com.universtiy.libray.jedisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

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
    @Test
    public void testJedisPool(){
        //设置连接池
        JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
        //最大连接数
        jedisPoolConfig.setMaxTotal(30);
        //空闲连接数
        jedisPoolConfig.setMaxIdle(5);
        //获取jedis连接对象
        Jedis jedis=null;
        JedisPool jedisPool=new JedisPool(jedisPoolConfig,"192.168.36.128",6379);
        try {
           jedis= jedisPool.getResource();
           //保存数据
            jedis.set("name","wen");
            logger.info("------>"+jedis.get("name"));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
            if(jedisPool!=null){
                jedisPool.close();
            }
        }
    }
}
