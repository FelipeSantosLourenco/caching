package org.example;

import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis("localhost", 6379);

            String response = jedis.ping();
            System.out.println(response);

            jedis.set("chave1", "valor1");

            System.out.println(jedis.get("chave1"));
        } catch (Exception e) {
            System.out.println("Erro ao conectar com jedis: " + e.getMessage());
        }
    }
}