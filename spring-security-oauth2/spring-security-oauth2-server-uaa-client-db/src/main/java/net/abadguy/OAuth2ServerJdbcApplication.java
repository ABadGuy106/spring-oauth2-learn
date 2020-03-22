package net.abadguy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "net.abadguy.mapper")
public class OAuth2ServerJdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerJdbcApplication.class,args);
    }
}
