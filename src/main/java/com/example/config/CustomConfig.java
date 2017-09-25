package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.domain.DeptVO;

@Configuration
public class CustomConfig {

	@Bean
	InternalResourceViewResolver jspView() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		vr.setViewNames("jsp/*");
		vr.setViewClass(JstlView.class);
		
		return vr;
	}
	
	@Bean
	DeptVO dept() {
		DeptVO d = new DeptVO();
		
		d.setDeptno(999);
		d.setDname("xxxxx");
		d.setLoc("yyyy");
		
		return d;
	}
}
