package com.lwl.base.project.config.security;

/**
 * Security常量
 * @author LinWenLi
 * @since 2020-04-18
 */
public final class SecurityConstants {
    /**登录认证url*/
    public static final String AUTH_LOGIN_URL = "/api/token";
    /**登出url*/
    public static final String AUTH_LOGOUT_URL = "/api/logout";
    /**jwt密钥*/
    public static final String JWT_SECRET = "k+WJR1cdk4OzdmDwvQsBhDS5VSz1CSUOFP4X5ZvEszQ=";
    /**token头部参数名*/
    public static final String TOKEN_HEADER = "Authorization";
    /**token前缀*/
    public static final String TOKEN_PREFIX = "Bearer ";
    /**token类型*/
    public static final String TOKEN_TYPE = "JWT";
    /**token发行者*/
    public static final String TOKEN_ISSUER = "secure-api";
    /***/
    public static final String TOKEN_AUDIENCE = "secure-app";

    private SecurityConstants() {}

}
