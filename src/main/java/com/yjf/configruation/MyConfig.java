package com.yjf.configruation;

import com.yjf.entity.Testutils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author 余俊锋
 * @date 2020/10/21 11:09
 * @Description
 */
@Configuration
public class MyConfig {


    @Bean
    public Testutils getInstance(){
        return new Testutils();
    }
}
