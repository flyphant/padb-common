package cn.iq99.spring.template;

public abstract class Template {

	public void templeteMethod() {
		connect();
		query();
		execute();
	}
	
	abstract void connect();
	
	abstract void query();
	
	abstract void execute();
	
}
