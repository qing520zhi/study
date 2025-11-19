package main.java.com.mings.Interview;

/**
 * @program: study
 * @description:猫类
 * @author: mings
 * @create: 2025-11-19 20:58
 **/
public class TestImpl {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
		System.out.println(cat.a);
		Animal animal = new Cat();
		animal.show();
		System.out.println(animal.a);
		//成员变量：编译看左边（父类），运行看左边（父类）
		//成员方法：编译看左边（父类），运行看右边（子类）
	}

}

class Animal {
	int a = 1;

	public void show() {
		System.out.println("A");
	}
}

class Cat extends Animal {
	int a = 2;

	@Override
	public void show() {
		System.out.println("C");
	}
}

