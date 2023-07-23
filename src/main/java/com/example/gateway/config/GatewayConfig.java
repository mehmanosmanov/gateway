package com.example.gateway.config;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

/**
 * @author Mehman Osmanov
 * @project gateway
 * @created 14:15 Sunday 23-07-2023
 */
public class GatewayConfig {

   @Bean
   public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

      return builder.routes().route(r -> r.path("/order/**").uri("http://localhost:8088/")).build();
   }


   @Bean
   public HttpClient httpClient() {
      return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
   }
}
