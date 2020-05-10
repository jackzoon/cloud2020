package com.halen.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By Halen 2020/5/10 15:12
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator1(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //https://news.baidu.com/guonei
        routes.route("path_route_halen1",
                r -> r.path("/guonei").uri("https://news.baidu.com")).build();
        return routes.build();
    }
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //https://news.baidu.com/guonei
        routes.route("path_route_halen1",
                r -> r.path("/guoji").uri("https://news.baidu.com")).build();
        return routes.build();
    }

}
