package UbuntuPackage;

public class TestSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher1 teacher = new Teacher1("zhangsan","th");
		teacher.displayName();	
		teacher.test();	
	}

}

class Person1{
	public int height;
	private String name;
	public Person1(String n){
		name = n;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void displayName(){
		System.out.println(name);
	}
}

/*
 * 一个构造函数是对象被创建时初始对象的成员函数。它具有和它所在的类完全一样的名字。一旦定义好一个构造函数，创建对象时就会自动调用它。
 * 构造函数没 有返回类型，即使是void类型也没有。这是因为一个类的构造函数的返回值的类型就是这个类本身。构造函数的任务是初始化一个对象的内部状态，
 * 所以用 new操作符创建一个实例后，立刻就会得到一个清楚、可用的对象。

构造函数（方法）注意几个特点：

1.函数名与类名相同

2.没返回、没有方法类型、也不能定义成void

3.程序自动调用、一个类可以定义多个构造函数，构造函数可以重载、以参数的个数，类型，或排列顺序区分
 */
class Teacher1 extends Person1{
	private String school;
	//No.1
		//开始写代码。需求：定义一个带2个参数的构造器：name和school，并使用它们分别初始化父类的name和这个类中的school属性
		public  Teacher1(String name,String school){
			super(name);
			this.school = school;
		}
		//end_code
	public void displayName(){
		System.out.println(getName+"老师");
	}
	public void test(){
		super.height = 100;  //引用父类的属性或者方法;
		super.displayName();
		System.out.println(super.height);
	}
}