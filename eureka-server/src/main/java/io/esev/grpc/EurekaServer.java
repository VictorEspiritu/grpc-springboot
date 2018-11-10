package io.esev.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ESEV!
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
    public static void main(String[] args) {

        System.out.println("Eurea Server!");
        SpringApplication.run(EurekaServer.class, args);

    }
}
