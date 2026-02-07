package com.bladcode.moviestart.moviestart_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import java.security.PublicKey;
@Configuration
public class movieStartConfiguration {

//Configuracion para uso de WebFLux
    @Bean
     WebClient.Builder webClient(){
        return  WebClient.builder();
    }
}
