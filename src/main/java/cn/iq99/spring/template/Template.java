package cn.iq99.spring.template;

public abstract class Template {

	public void templeteMethod() {
		connect();
		query();
		execute();
	}
	
	public abstract void connect();
	
	public abstract void query();
	
	public abstract void execute();
	
}
