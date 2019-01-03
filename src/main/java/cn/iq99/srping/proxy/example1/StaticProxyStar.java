package cn.iq99.srping.proxy.example1;

/**
 * 明星的静态代理方法
 * @author jaysonding
 *
 */
public class StaticProxyStar implements IStar {
	
	private IStar starInterface;
	
    /**
     * 通过构造方法传进来真实的明星对象
     * @param star star
     */
    public StaticProxyStar(IStar starInterface) {
        this.starInterface=starInterface;
    }

	
	@Override
	public void sing() {
        System.out.println("代理先进行谈判……");
        // 唱歌只能明星自己唱
        this.starInterface.sing();
        System.out.println("演出完代理去收钱……");
	}

}
