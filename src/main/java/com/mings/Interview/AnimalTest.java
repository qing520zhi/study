package main.java.com.mings.Interview;

/**
 * @program: study
 * @description: 多态演示 - 增强版
 * @author: mings
 * @create: 2025-11-19 21:17
 **/
public class AnimalTest {

	/**
	 * 狗类 - 继承自动物类
	 */
	static class Dog extends Animal {
		public Dog(String name) {
			super(name); // 调用父类构造方法
		}

		/**
		 * 实现抽象方法 - 狗的叫声
		 */
		@Override
		public void makeSound() {
			System.out.println(name + " says: Woof! Woof!");
		}

		/**
		 * 狗特有的方法
		 */
		public void wagTail() {
			System.out.println(name + " is wagging tail.");
		}
	}

	/**
	 * 猫类 - 继承自动物类
	 */
	static class Cat extends Animal {
		public Cat(String name) {
			super(name); // 调用父类构造方法
		}

		/**
		 * 实现抽象方法 - 猫的叫声
		 */
		@Override
		public void makeSound() {
			System.out.println(name + " says: Meow! Meow!");
		}

		/**
		 * 猫特有的方法
		 */
		public void climbTree() {
			System.out.println(name + " is climbing tree.");
		}
	}

	/**
	 * 鸟类 - 继承自动物类
	 */
	static class Bird extends Animal {
		public Bird(String name) {
			super(name); // 调用父类构造方法
		}

		/**
		 * 实现抽象方法 - 鸟的叫声
		 */
		@Override
		public void makeSound() {
			System.out.println(name + " says: Tweet! Tweet!");
		}

		/**
		 * 鸟特有的方法
		 */
		public void fly() {
			System.out.println(name + " is flying in the sky.");
		}
	}

	/**
	 * 多态演示主类
	 * 展示Java中多态的不同表现形式
	 */
	public static class AnimalTest1 {

		/**
		 * 主方法 - 程序入口
		 */
		public static void main(String[] args) {
			// 1. 基本多态演示
			System.out.println("=== 基本多态演示 ===");

			// 父类引用指向不同的子类对象
			// 这就是多态的核心：同一个引用类型，调用相同的方法，产生不同的行为
			Animal dog = new Dog("旺财");
			Animal cat = new Cat("咪咪");
			Animal bird = new Bird("小鸟");

			// 调用重写的方法 - 运行时多态
			dog.makeSound();   // 输出狗的叫声
			cat.makeSound();   // 输出猫的叫声
			bird.makeSound();  // 输出鸟的叫声

			// 调用继承的公共方法
			dog.sleep();
			cat.sleep();
			bird.sleep();

			System.out.println("\n=== 多态数组演示 ===");

			// 2. 使用多态数组 - 一个数组存储多种类型的对象
			// 这体现了多态的强大之处：可以用统一的方式处理不同类型但具有共同特征的对象
			Animal[] animals = new Animal[3];
			animals[0] = new Dog("大黄");
			animals[1] = new Cat("小花");
			animals[2] = new Bird("鹦鹉");

			// 遍历数组，调用每个对象的makeSound方法
			// 编译时只知道调用的是Animal的makeSound方法
			// 运行时才会根据实际对象类型决定调用哪个具体的实现
			for (int i = 0; i < animals.length; i++) {
				animals[i].makeSound(); // 多态体现：同一方法调用，不同行为结果
			}

			System.out.println("\n=== 多态方法参数演示 ===");

			// 3. 多态作为方法参数 - 可以接收任何Animal子类对象
			AnimalTest1 test = new AnimalTest1();
			test.animalPerform(dog);   // 传入Dog对象
			test.animalPerform(cat);   // 传入Cat对象
			test.animalPerform(bird);  // 传入Bird对象

			System.out.println("\n=== 向下转型演示 ===");

			// 4. 向下转型 - 访问子类特有方法
			// 当需要访问子类特有的方法时，需要进行类型转换
			if (dog instanceof Dog) {  // 安全检查，避免ClassCastException
				Dog realDog = (Dog) dog;  // 向下转型
				realDog.wagTail();       // 调用Dog特有的方法
			}

			if (cat instanceof Cat) {
				Cat realCat = (Cat) cat;
				realCat.climbTree();     // 调用Cat特有的方法
			}

			if (bird instanceof Bird) {
				Bird realBird = (Bird) bird;
				realBird.fly();          // 调用Bird特有的方法
			}

			System.out.println("\n=== 多态集合演示 ===");

			// 5. 使用List集合展示多态
			java.util.List<Animal> animalList = new java.util.ArrayList<>();
			animalList.add(new Dog("金毛"));
			animalList.add(new Cat("波斯猫"));
			animalList.add(new Bird("鸽子"));

			// 遍历集合并让每种动物发声
			for (Animal animal : animalList) {
				animal.makeSound(); // 利用多态机制调用具体实现
			}

			System.out.println("\n=== 多态返回值演示 ===");

			// 6. 方法返回值也可以体现多态
			Animal randomAnimal = getRandomAnimal();
			randomAnimal.makeSound(); // 不知道确切类型，但能正确执行
		}

		/**
		 * 返回随机动物实例的方法，体现多态返回值
		 *
		 * @return Animal类型的对象（可能是Dog/Cat/Bird）
		 */
		private static Animal getRandomAnimal() {
			int choice = (int) (Math.random() * 3);
			switch (choice) {
				case 0:
					return new Dog("随机狗");
				case 1:
					return new Cat("随机猫");
				default:
					return new Bird("随机鸟");
			}
		}

		/**
		 * 多态方法 - 接收Animal类型参数，可以处理任何Animal子类对象
		 * 这是多态的重要应用：编写通用的方法处理具有共同特征的不同类型对象
		 *
		 * @param animal 动物对象（可以是Dog、Cat、Bird等任何子类）
		 */
		public void animalPerform(Animal animal) {
			System.out.print("表演时间: ");
			animal.makeSound();  // 多态调用：根据实际对象类型执行对应方法

			// 注意：这里不能直接调用子类特有方法，如wagTail()、climbTree()等
			// 因为animal引用被看作Animal类型，只能访问Animal类中定义的方法
		}
	}

	/**
	 * 动物基类 - 定义动物的基本属性和行为
	 */
	abstract static class Animal {
		protected String name;

		public Animal(String name) {
			this.name = name;
		}

		/**
		 * 抽象方法 - 每种动物发出的声音不同
		 * 子类必须实现此方法
		 */
		public abstract void makeSound();

		/**
		 * 公共方法 - 所有动物都可以执行的动作
		 */
		public void sleep() {
			System.out.println(name + " is sleeping.");
		}
	}
}
