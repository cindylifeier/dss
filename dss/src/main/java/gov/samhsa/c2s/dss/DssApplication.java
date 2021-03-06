package gov.samhsa.c2s.dss;

import gov.samhsa.c2s.brms.BrmsBasePackageMarkerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {DssApplication.class, BrmsBasePackageMarkerInterface.class})
@EnableDiscoveryClient
@EnableFeignClients
public class DssApplication {

    public static void main(String[] args) {
        SpringApplication.run(DssApplication.class, args);
    }
}