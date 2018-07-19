package com.yixun.infrastructure.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Controller;

/**
 * 表明是需要验证的Controller
 * 
 * @author fx__w
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// @Controller
public @interface Authenticated
{

	/**
	 * The value may indicate a suggestion for a logical component name, to be
	 * turned into a Spring bean in case of an autodetected component.
	 * 
	 * @return the suggested component name, if any
	 * @since 4.0.1
	 */
	String value() default "";

}