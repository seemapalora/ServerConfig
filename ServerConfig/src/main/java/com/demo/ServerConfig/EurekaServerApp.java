package com.demo.ServerConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp 
{
    public static void main( String[] args )
    {
       SpringApplication.run(EurekaServerApp.class, args);
    }
}
