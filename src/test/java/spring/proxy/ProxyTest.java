package spring.proxy;

import cn.iq99.spring.proxy.example1.CglibProxyHandler;
import cn.iq99.spring.proxy.example1.IStar;
import cn.iq99.spring.proxy.example1.JdkProxyHandler;
import cn.iq99.spring.proxy.example1.RealStar;
import cn.iq99.spring.proxy.example1.StaticProxyStar;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//真实明星
		IStar realStar=new RealStar();
		
		//静态代理方法
		IStar staticProxyStar=new StaticProxyStar(realStar);
		staticProxyStar.sing();
		
		//jdk动态代理
		IStar jdkProxy=(IStar) new JdkProxyHandler(realStar).getProxyInstance();
		jdkProxy.sing();
		
		//cglib代理
		IStar cglibProxy=(IStar) new CglibProxyHandler().getProxyInstance(realStar);
		cglibProxy.sing();

	}

}
