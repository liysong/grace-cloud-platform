package com.grace.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

/**
 * @Auther: song
 * @Date: 2018/11/14 17:54
 * @Description:
 * @Version:1.0.0
 */

@ComponentScan(basePackages = {"com.grace"})
@EnableCaching
@SpringBootApplication
public class GraceAdminsApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GraceAdminsApplication.class);
    }

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        ApplicationContext ctx =  SpringApplication.run(GraceAdminsApplication.class, args);

        String[] beanNames =  ctx.getBeanDefinitionNames();

        System.out.println("所以beanNames个数："+beanNames.length+"----------");

        for(String bean:beanNames){

            System.out.println(bean);

        }
        System.out.println("-------------------------------------");
    }
}
