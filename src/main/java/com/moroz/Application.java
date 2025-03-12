package main.java.com.moroz;

import main.java.com.moroz.builder.ServiceClient;

public class Application {
    public static void main(String[] args) {
        ServiceClient build = ServiceClient
                .getBuilder()
                .setPort(2244)
                .setHost("127.0.0.1")
                .build();
    }
}
