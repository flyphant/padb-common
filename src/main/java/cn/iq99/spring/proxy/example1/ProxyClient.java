package cn.iq99.spring.proxy.example1;

public class ProxyClient {

	public static void main(String[] args) {
		
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
