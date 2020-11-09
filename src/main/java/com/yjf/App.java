package com.yjf;

import com.yjf.autoConfigruatuinProperties.TestAutoConfigProperties;
import com.yjf.configruation.MyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//内镶嵌的注解做了三件事：
// 1.@EnableAutoConfiguration
// 启用默认spring和springMvc的配置，开启配置
//2.SpringBootConfiguration作用等同于@configuration
//声明这是一个配置类
//3.@ComponentScan
//自定义扫描包，例如resources目录下的文件
@AutoConfigureBefore(MyConfig.class)
//在配置类执行完成之前，执行指定的自定义的配置类。
@EnableConfigurationProperties(value= TestAutoConfigProperties.class)
//加载自定义装配属性类
@MapperScan("com.yjf.dao")
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
}
