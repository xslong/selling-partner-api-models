package com.amazon.SellingPartnerAPIAA;

import com.amazonaws.util.Md5Utils;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

public class LWAAccessTokenCacheRedisImpl implements LWAAccessTokenCache {

    private RedisTemplate<String, String> redisTemplate;

    public LWAAccessTokenCacheRedisImpl(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private String toKey(Object key) {
        LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta = (LWAAccessTokenRequestMeta) key;
        return lwaAccessTokenRequestMeta.getRefreshToken();
    }

    @Override
    public String get(Object key) {
        return redisTemplate.opsForValue().get(toKey(key));
    }

    @Override
    public void put(Object key, String accessToken, long tokenTTLInSeconds) {
        redisTemplate.opsForValue().set(toKey(key), accessToken, tokenTTLInSeconds - 2, TimeUnit.SECONDS);
    }

}
