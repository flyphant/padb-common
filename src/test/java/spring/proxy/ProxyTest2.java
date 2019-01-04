package spring.proxy;

import cn.iq99.srping.proxy.example1.CglibProxyHandler;
import cn.iq99.srping.proxy.example1.JdkProxyHandler;
import cn.iq99.srping.proxy.example2.IBuyCar;
import cn.iq99.srping.proxy.example2.People;
import cn.iq99.srping.proxy.example2.ProxyPeople;

public class ProxyTest2 {

	public static void main(String[] args) {
		
		People people=new People();
		people.setName("小明");
		people.setMoney(10);
		people.setVip("Vip");
		
		ProxyPeople proxyPeople=new ProxyPeople(people);
		proxyPeople.buyCar();

		//jdk代理
		IBuyCar iBuyCar=new People();
		JdkProxyHandler jdkProxyHandler=new JdkProxyHandler(iBuyCar);
		iBuyCar=(IBuyCar)jdkProxyHandler.getProxyInstance();
		iBuyCar.buyCar();
		
		//cglib代理
		IBuyCar iBuyCar2=(IBuyCar)new CglibProxyHandler().getProxyInstance(people);
		iBuyCar2.buyCar();
	}

}
