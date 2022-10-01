package com.ProjectActivity.importerSite.Security;

public class AuthenticationConfigConstants {
    public static final String SECRET = "Just_a_secret";
    public static final long EXPIRATION_TIME = 864000000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/getUsers";
}
