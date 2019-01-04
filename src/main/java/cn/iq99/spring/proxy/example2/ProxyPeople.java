package cn.iq99.spring.proxy.example2;

public class ProxyPeople implements IBuyCar {
	
	private People target;
	
	public ProxyPeople(People people) {
		this.target=people;
	}

	@Override
	public void buyCar() {
		
		if(target.getVip().equals("Vip")) {
			System.out.println("VIP享受代理买车全程服务");
		}
		System.out.println("买车前试驾");
		
		
		target.buyCar();
		System.out.println("买车成功");
	}

}
