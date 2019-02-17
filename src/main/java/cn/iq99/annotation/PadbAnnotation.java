package cn.iq99.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PadbAnnotation {

	/**
	 * 访问padb-common公共注解
	 * @return
	 */
	String value() default "padb-common";
	
}
