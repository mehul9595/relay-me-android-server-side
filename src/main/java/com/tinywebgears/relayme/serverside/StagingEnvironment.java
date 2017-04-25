package com.tinywebgears.relayme.serverside;

public class StagingEnvironment {
    // FIXME: 000: Update this with your own environment's details
    private static final String SERVER_SIDE_URL_STAGING =
            "https://relay-me-test-server-side.herokuapp.com/relayme/server";

    public String getServerBaseUrl() {
        return SERVER_SIDE_URL_STAGING;
    }

    public String getEncryptionSalt() {
        return "RiE2MV5YI2ZodG1HbEI0aw==";
    }
}
