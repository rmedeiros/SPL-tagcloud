package com.onekin.tagcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.onekin.tagcloud.config.MvcConfig;
import com.onekin.tagcloud.controller.ControllerMarker;
import com.onekin.tagcloud.dao.DaoMarker;
import com.onekin.tagcloud.service.ServiceMarker;

@EnableAutoConfiguration
@ComponentScan(basePackageClasses= {ControllerMarker.class,DaoMarker.class, ServiceMarker.class})
@ImportResource({"classpath:META-INF/sql/queries.xml"})
@Import(MvcConfig.class)
public class SplTagCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplTagCloudApplication.class, args);
	}
}
