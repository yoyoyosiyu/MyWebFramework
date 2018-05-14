package com.huayutech.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({WebApplicationInitializer.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext servletContext) throws ServletException {

        //logger.info("启动加载自定义的MyServletContainerInitializer");
        System.out.println("启动加载自定义的MyServletContainerInitializer");
        ServletRegistration.Dynamic testServlet=servletContext.addServlet("servlet4","com.shf.springboot.servlet.Servlet4");
        testServlet.setLoadOnStartup(1);
        testServlet.addMapping("/servlet4");

        if (classes != null) {
            for (Class<?> wilClass : classes) {
                System.out.println(wilClass.getName());
            }
        }

    }
}
