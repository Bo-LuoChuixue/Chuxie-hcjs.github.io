package cn.tedu.weibo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*") //允许任意请求头访问
                .allowedMethods("*") //允许任意请求方式 get/post/put/delete
                .allowedOriginPatterns("*") //允许任意域访问
                .allowCredentials(true) //允许携带cookie/session相关信息
                .maxAge(3600);//一小时内同一请求不再检查 直接放行

    }
}
