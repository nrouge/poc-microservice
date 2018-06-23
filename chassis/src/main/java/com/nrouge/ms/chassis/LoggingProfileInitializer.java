package com.nrouge.ms.chassis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class LoggingProfileInitializer implements EnvironmentPostProcessor {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		if (!environment.acceptsProfiles("logging-console", "logging-logstash")) {
			environment.addActiveProfile("logging-console");
		}
	}

}
