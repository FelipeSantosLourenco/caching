package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisPoolImpl {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost", 6379);

        try(Jedis jedis = pool.getResource()) {
            System.out.println(jedis.ping());
        }

        pool.close();
    }
}
