package cn.iq99.spring.template;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Template template=new MySql();
		template.templeteMethod();
		
		Template template2=new HiveSql();
		template2.templeteMethod();
	}

}
