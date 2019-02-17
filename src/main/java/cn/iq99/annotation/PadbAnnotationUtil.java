package cn.iq99.annotation;

import java.lang.reflect.Field;

public class PadbAnnotationUtil {

	public static void getPadbAnnotaionValue(Class clazz) {
		
		Field[] fields=clazz.getDeclaredFields();
		for(Field field:fields) {
			if(field.isAnnotationPresent(PadbAnnotation.class)) {
				System.out.println(field.getAnnotation(PadbAnnotation.class).value());
			}
		}
	}
}
