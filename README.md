### spring-boot-demo

>spring boot 学习代码

### 一、外化配置

    1.对于属性注入来说，只能注入已被加载到spring容器中的属性。
    2.通过@Value("${...}")方式来指定注入的属性
    3.通过@ConfigurationProperties(prefix="config.redis")来批量注入属性
    4.通过@PropertySource来指定加载的资源文件，默认只会加载app.properties
    和file.xml文件，对于yml我们需要实现PropertySourceFactory#createPropertySource
    方法。例如：
    public class DefaultYamlPropertySourceFactory implements PropertySourceFactory {
        @Override
        public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
            List<PropertySource<?>> sources = new YamlPropertySourceLoader()
                    .load(resource.getResource().getFilename(),
                            resource.getResource());
            return sources.get(0);
        }
    }
    5.通过@ConfigurationProperties+@EnableConfigurationProperties组合注解

>@ConfigurationProperties注解和@Value注解的区别：

    1.@ConfigurationProperties能够批量注入配置文件的属性。@Value只能一个个指定。
    2.@ConfigurationProperties支持松散绑定。只需要指定一个前缀，就能绑定有这个
    前缀的所有属性值。如：@ConfigurationProperties(prefix = "mysql.config")
    3.@Value支持SpringEl的语法。@ConfigurationProperties不支持SpringEl的语法。
    4.@ConfigurationProperties还支持JSR303进行配置文件值及校验。
    5. @ConfigurationProperties支持复杂类型封装

