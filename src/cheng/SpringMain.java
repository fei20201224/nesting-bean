package cheng;


import java.util.Locale;
import java.util.Locale.Category;

import org.springframework.cglib.core.Local;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain
{

	public static void main(String[] args)
	{
		
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
//		System.out.println(ctx.getMessage("hi",null,Locale.getDefault(Category.FORMAT)));
//		System.out.println(ctx.getMessage("wel", new String[] {"ËïÎò¿Õ"},
//		Locale.getDefault(Category.FORMAT)));
		
		Hunter ht = (Hunter)ctx.getBean("hunter");
		ht.hunt();
		
	}

}
