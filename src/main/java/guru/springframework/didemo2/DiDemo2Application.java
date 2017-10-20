package guru.springframework.didemo2;

import guru.springframework.didemo2.controllers.ConstructorInjectedController;
import guru.springframework.didemo2.controllers.GetterInjectedController;
import guru.springframework.didemo2.controllers.MyController;
import guru.springframework.didemo2.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemo2Application.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
