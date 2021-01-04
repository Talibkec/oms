package com.example.oms.config;

import com.example.oms.entity.User;
import com.example.oms.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class BeanConfig {
    @Autowired
    UserService userService;
    @Bean
    @Description("Spring Message Resolver")
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }

}
