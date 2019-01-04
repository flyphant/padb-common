package cn.iq99.spring.proxy.example1;

public class RealStar implements IStar {

	@Override
	public void sing() {
		System.out.println("明星本人开始唱歌……");

	}

}
