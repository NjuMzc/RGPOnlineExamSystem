package edu.nju.config;

import edu.nju.filter.CorsFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mazhangchi on 2017/10/24.
 */
@Configuration//标明这个是SpringBoot的配置类，可以通过类配置代替原有的XML配置方式
@EnableAutoConfiguration //启动bean自动注入
public class StarsFilterConfiguration extends SpringBootServletInitializer {
    /*FilterRegistrationBean 用来配置urlpattern 来确定哪些路径触发filter */
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(AuthFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }

    /*使用annotation tag来取代<bean></bean>*/
    @Bean()
    public CorsFilter AuthFilter() {
        return new CorsFilter();
    }
}
