package cn.iq99.srping.proxy.example1;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * cglib代理处理类
 * @author jaysonding
 *
 */
public class CglibProxyHandler implements MethodInterceptor {
	
	private Object target;
	
	public Object getProxyInstance(final Object target) {
		this.target=target;
		
		// Enhancer类是CGLIB中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
		Enhancer enhancer=new Enhancer();
		
		//将被代理对象设置成父类
		enhancer.setSuperclass(this.target.getClass());
		
		//回调方法,设置拦截器
		enhancer.setCallback(this);
		
		// 动态创建一个代理类
		return enhancer.create();
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
        System.out.println("代理先进行谈判……");
        // 唱歌需要明星自己来唱
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("演出完代理去收钱……");
        return result;
	}

}
