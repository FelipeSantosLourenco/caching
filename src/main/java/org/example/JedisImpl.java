package org.example;

import redis.clients.jedis.Jedis;

public class JedisImpl {
    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis("localhost", 6379);
            System.out.println(jedis.ping());
        } catch (Exception e) {
            System.out.println("Erro ao conectar com jedis: " + e.getMessage());
        }
    }
}
