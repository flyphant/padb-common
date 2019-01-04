package cn.iq99.srping.proxy.example1;

import java.lang.reflect.Proxy;

public class JdkProxyHandler {

	//用来接收真的明星对象
	private Object target;
	
	/**
	 * 通过构造方法传进来真实的明星对象
	 * @param realStar
	 */
	public JdkProxyHandler(Object object) {
		super();
		this.target=object;
	}
	
	public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
        		target.getClass().getInterfaces(), (proxy, method, args) -> {
                	
                	System.out.println("jdk代理的接口类"+target.getClass().getInterfaces());
                    System.out.println("jdk代理先进行谈判……");
                    // 唱歌需要明星自己来唱
                    Object object = method.invoke(target, args);
                    System.out.println("jdk演出完代理去收钱……");

                    return object;
                });
	}
}
