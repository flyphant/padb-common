package cn.iq99.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy(false)
@Component
public class SpringContextUtil implements ApplicationContextAware{

	public static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		SpringContextUtil.applicationContext=applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		
		return SpringContextUtil.applicationContext;
	}
	
	public static <T> T getBean(Class<T> clazz){
		
		return getApplicationContext().getBean(clazz);
	}
	
	public static <T> T getBean(String name,Class<T> clazz) {
		
		return getApplicationContext().getBean(name, clazz);
	}
}
