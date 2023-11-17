package cn.tedu.weibo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // /** 匹配服務器的任意請求地址
        registry.addMapping("/**")
                .allowedHeaders("*")  //允許任意請求頭訪問
                .allowedMethods("*")  //允許任意請求方式 get/post/put/delete
                .allowedOriginPatterns("*")  //允許任意域訪問
                .allowCredentials(true)  //允許攜帶cookie/session相關信息
                .maxAge(3600);//一小時內同一請求不再檢查  直接放行
    }
}
