package cn.iq99.spring.template;

public class HiveSql extends Template {

	@Override
	public void connect() {
		System.out.println("hive连接成功");

	}

	@Override
	public void query() {
		System.out.println("hive查询成功");

	}

	@Override
	public void execute() {
		System.out.println("hive执行成功");

	}

}
