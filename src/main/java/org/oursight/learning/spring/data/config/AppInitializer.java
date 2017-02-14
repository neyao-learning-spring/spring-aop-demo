package org.oursight.learning.spring.data.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {


        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(YamlConfiguration.class);
        ctx.setServletContext(container);
        ctx.register(ApplicationContext.class);

        //since ApplicationContext has registered  @ComponentScan(basePackages ="xxx") ,below register is no need at all
//        ctx.register(DataSourceConfiguration.class);
        //ctx.register(HibernateConfiguration.class);
//        ctx.register(JpaConfiguration.class);


        ServletRegistration.Dynamic servlet = container.addServlet(
                "dispatcher", new DispatcherServlet(ctx));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}
