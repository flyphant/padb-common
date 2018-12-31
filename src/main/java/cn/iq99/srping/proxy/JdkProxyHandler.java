package cn.iq99.srping.proxy;

import java.lang.reflect.Proxy;

public class JdkProxyHandler {

	//用来接收真的明星对象
	private Object realStar;
	
	/**
	 * 通过构造方法传进来真实的明星对象
	 * @param realStar
	 */
	public JdkProxyHandler(StarInterface starInterface) {
		super();
		this.realStar=starInterface;
	}
	
	public Object getProxyInstance() {
        return Proxy.newProxyInstance(realStar.getClass().getClassLoader(),
                realStar.getClass().getInterfaces(), (proxy, method, args) -> {

                    System.out.println("代理先进行谈判……");
                    // 唱歌需要明星自己来唱
                    Object object = method.invoke(realStar, args);
                    System.out.println("演出完代理去收钱……");

                    return object;
                });
	}
}
