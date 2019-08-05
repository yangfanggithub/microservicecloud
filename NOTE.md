EUREKA服务端的启动需要加入以下包

```xml
<!--eureka-server服务端 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka-server</artifactId>
</dependency>
```

可选

```xml
<!-- 修改后立即生效，热部署 -->
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>springloaded</artifactId>
</dependency>
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-devtools</artifactId>
</dependency>
```

配置文件配置

```yaml
eureka:
  instance:
    hostname: eureka7001.com #eureka服务端的实例名称
  client:
    register-with-eureka: false     #false表示不向注册中心注册自己。
    fetch-registry: false     #false表示自己端就是注册中心，我的职责就是维护服务实例，并不需要去检索服务
    service-url:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
      #设置与Eureka Server交互的地址查询服务和注册服务都需要依赖这个地址（单机）。
      #defaultZone: http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/
```

启动类需要加上该注解

```java
@EnableEurekaServer
```







消费端和提供段需要注册到eureka中 需要导入以下包

```xml
<!-- 将微服务provider侧注册进eureka -->                          
<dependency>                                             
    <groupId>org.springframework.cloud</groupId>         
    <artifactId>spring-cloud-starter-eureka</artifactId> 
</dependency>                                            
<dependency>                                             
    <groupId>org.springframework.cloud</groupId>         
    <artifactId>spring-cloud-starter-config</artifactId> 
</dependency>                                            
```

yaml配置

```yaml
eureka:
  client: #客户端注册进eureka服务列表内
    service-url: 
      #defaultZone: http://localhost:7001/eureka
       defaultZone: http://eureka7001.com:7001/eureka/,http://eureka7002.com:7002/eureka/,http://eureka7003.com:7003/eureka/     
       # eureka中服务连接查看信息配置
  instance:
    instance-id: microservicecloud-dept8001
    prefer-ip-address: true     #访问路径可以显示IP地址
```



eureka中查看服务配置（负责服务信息的监控）

导入maven

```xml
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

配置pom工程

```xml
<build>
        <finalName>microservicecloud</finalName>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
            </resource>
        </resources>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-resources-plugin</artifactId>
                <configuration>
                    <delimiters>
                        <delimit>$</delimit>
                    </delimiters>
                </configuration>
            </plugin>
        </plugins>
    </build>
```



在yaml中配置信息

```yaml

```

