package mx.com.ismaeloe.adminserver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class AdminserverApplication {
	private static Logger LOG = LogManager.getLogger(AdminserverApplication.class);
	
	public static void main(String[] args) {
		LOG.info("Running AdminServer..");
		SpringApplication.run(AdminserverApplication.class, args);
	}

}
