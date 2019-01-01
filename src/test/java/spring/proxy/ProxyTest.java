package spring.proxy;

import cn.iq99.srping.proxy.CglibProxyHandler;
import cn.iq99.srping.proxy.JdkProxyHandler;
import cn.iq99.srping.proxy.RealStar;
import cn.iq99.srping.proxy.StarInterface;
import cn.iq99.srping.proxy.StaticProxyStar;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//真实明星
		StarInterface realStar=new RealStar();
		
		//静态代理方法
		StarInterface staticProxyStar=new StaticProxyStar(realStar);
		staticProxyStar.sing();
		
		//jdk动态代理
		StarInterface jdkProxy=(StarInterface) new JdkProxyHandler(realStar).getProxyInstance();
		jdkProxy.sing();
		
		//cglib代理
		StarInterface cglibProxy=(StarInterface) new CglibProxyHandler().getProxyInstance(realStar);
		cglibProxy.sing();

	}

}
