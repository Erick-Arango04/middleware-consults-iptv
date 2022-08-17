package com.totalplay.mx.middlewareconsultsiptv.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigurationProperties(prefix ="loggin-app")
@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SoapLoginApp {
    
    private String ip;
    private String user;
    private String password;


}
