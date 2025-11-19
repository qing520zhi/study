package main.java.com.mings.Interview;

/**
 * @program: study
 * @description: 接口实现类
 * @author: mings
 * @create: 2025-11-19 20:01
 **/
public class InterImpl implements Inter {

	public static void main(String[] args) {
		InterImpl inter = new InterImpl();
		inter.show();
	}

	@Override
	public void show() {
		System.out.println("show");
	}
}
