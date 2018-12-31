package cn.iq99.srping.proxy;

public class ProxyClient {

	public static void main(String[] args) {
		
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
