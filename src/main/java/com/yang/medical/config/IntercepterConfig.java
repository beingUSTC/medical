//package com.yang.medical.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class  IntercepterConfig implements WebMvcConfigurer  {
//
//    private TokenInterceptor tokenInterceptor;
//
//    //构造方法
//    public IntercepterConfig(TokenInterceptor tokenInterceptor){
//        this.tokenInterceptor = tokenInterceptor;
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        List<String> excludePath = new ArrayList<>();
//        excludePath.add("/login"); //登录
//        excludePath.add("/static/**");  //静态资源
//        excludePath.add("/swagger-ui.html/**");  //静态资源
//        excludePath.add("/assets/**");  //静态资源
//
//        registry.addInterceptor(tokenInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns(excludePath);
//        WebMvcConfigurer.super.addInterceptors(registry);
//
//    }
//
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowCredentials(true)
//                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH", "OPTIONS", "HEAD")
//                .maxAge(3600 * 24);
//    }
//
//}
