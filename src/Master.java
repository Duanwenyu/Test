
public class Master {
	public static void main(String[] args) {
		Cat mycat=new Cat();
		mycat.setName("Сè");
		mycat.setAge(22);
		String str1=mycat.bark();
		System.out.println(str1);
		mycat.eat("����");
		mycat.sleep();
		
		Pig mypig=new Pig();
		mypig.setName("С��");
		mypig.setAge(10);
		String str2=mypig.bark();
		System.out.println(str2);
		mypig.eat("��");
		
		Dog mydog=new Dog();
		mydog.setName("С��");
		mydog.setAge(33);
		String str3=mydog.bark();
		System.out.println(str3);
		mydog.eat("��ͷ");
		
	}

}
