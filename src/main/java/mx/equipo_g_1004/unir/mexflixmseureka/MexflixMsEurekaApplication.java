package mx.equipo_g_1004.unir.mexflixmseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MexflixMsEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MexflixMsEurekaApplication.class, args);
    }

}
