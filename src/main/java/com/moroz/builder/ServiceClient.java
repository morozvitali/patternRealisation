package main.java.com.moroz.builder;

public class ServiceClient {
    private String url;
    private String basePath = "/";
    private String protocol = "http";
    private String version = "1.1 ";
    private String host = "0.0.0.0";
    private int port = 8080;

    public static ClientBuilder getBuilder() {
        return new ClientBuilder();
    }

    private ServiceClient() {
    }

    public static class ClientBuilder {
        private ServiceClient client;

        public ClientBuilder() {
            client = new ServiceClient();
        }

        public ServiceClient build() {
            return client;
        }

        public ClientBuilder setUrl(String url) {
            client.url = url;
            return this;
        }

        public ClientBuilder setBasePath(String basePath) {
            client.basePath = basePath;
            return this;
        }

        public ClientBuilder setProtocol(String protocol) {
            client.protocol = protocol;
            return this;
        }

        public ClientBuilder setVersion(String version) {
            client.version = version;
            return this;
        }

        public ClientBuilder setHost(String host) {
            client.host = host;
            return this;
        }

        public ClientBuilder setPort(int port) {
            client.port = port;
            return this;
        }
    }
}
