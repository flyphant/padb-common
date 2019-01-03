package cn.iq99.srping.proxy.example2;

public class JdkProxy {

	//代理普通对象
	private Object target;
	
	public JdkProxy(IBuyCar buyCar) {
		
		buyCar.buyCar();
	}
}
