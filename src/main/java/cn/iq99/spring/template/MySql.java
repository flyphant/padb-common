package cn.iq99.spring.template;

public class MySql extends Template {

	@Override
	public void connect() {
		System.out.println("mysql连接成功");

	}

	@Override
	public void query() {
		System.out.println("mysql查询成功");

	}

	@Override
	public void execute() {
		System.out.println("mysql执行成功");

	}

}
