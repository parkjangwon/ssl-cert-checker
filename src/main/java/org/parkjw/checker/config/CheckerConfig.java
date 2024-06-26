package org.parkjw.checker.config;

import lombok.Getter;
import lombok.Setter;
import org.parkjw.checker.domains.checker.entity.Group;
import org.parkjw.checker.domains.checker.entity.Mail;
import org.parkjw.checker.domains.checker.entity.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Configuration
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "checker")
public class CheckerConfig {

	private Server server;

	private Mail mail;

	private List<String> enableGroup;

	private Map<String, Group> groups;
}
