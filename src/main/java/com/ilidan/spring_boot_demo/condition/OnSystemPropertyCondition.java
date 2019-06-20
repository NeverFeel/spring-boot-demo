package com.ilidan.spring_boot_demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;
import java.util.Objects;

/**
 * Java系统属性条件判断
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.
                getAnnotationAttributes(ConditionOnSystemProperty.class.getName());

        String name = String.valueOf(annotationAttributes.get("name"));
        String value = String.valueOf(annotationAttributes.get("value"));

        String propertyValue = System.getProperties().getProperty(name);

        System.out.println("name:" + name + ", value:" + value + ", propertyValue:" + propertyValue);

        return Objects.equals(propertyValue, value);
    }
}
