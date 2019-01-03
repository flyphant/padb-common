package cn.iq99.srping.proxy.example2;

import lombok.Data;

@Data
public class People implements IBuyCar {
	
	String vip;
	String name;
	int money;
	
	@Override
	public void buyCar() {
		
		System.out.println(this.name+"买到了车");
	}

}
