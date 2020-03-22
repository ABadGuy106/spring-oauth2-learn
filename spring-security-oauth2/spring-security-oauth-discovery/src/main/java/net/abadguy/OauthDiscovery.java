package net.abadguy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OauthDiscovery {
    public static void main(String[] args) {
        SpringApplication.run(OauthDiscovery.class,args);
    }
}
