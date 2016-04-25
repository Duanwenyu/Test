
public class Master {
	public static void main(String[] args) {
		Cat mycat=new Cat();
		mycat.setName("小猫");
		mycat.setAge(22);
		String str1=mycat.bark();
		System.out.println(str1);
		mycat.eat("老鼠");
		mycat.sleep();
		
		Pig mypig=new Pig();
		mypig.setName("小猪");
		mypig.setAge(10);
		String str2=mypig.bark();
		System.out.println(str2);
		mypig.eat("饭");
		
		Dog mydog=new Dog();
		mydog.setName("小狗");
		mydog.setAge(33);
		String str3=mydog.bark();
		System.out.println(str3);
		mydog.eat("骨头");
		
	}

}
