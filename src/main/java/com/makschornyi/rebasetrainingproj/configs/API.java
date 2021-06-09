package com.makschornyi.rebasetrainingproj.configs;

public interface API {
    String ROOT = "/api/";

    interface Merchant {
        String ROOT = API.ROOT + "/users";
    }
    interface Marketplace {
        String ROOT = API.ROOT + "/admins";
    }
}
