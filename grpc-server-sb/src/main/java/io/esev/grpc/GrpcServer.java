package io.esev.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GrpcServer {
    public static void main(String[] args) {
        System.out.println("GRPC Server!");
        SpringApplication.run(GrpcServer.class, args);
    }
}
