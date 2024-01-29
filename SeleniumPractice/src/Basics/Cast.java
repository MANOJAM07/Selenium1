package Basics;

import org.bouncycastle.jcajce.provider.symmetric.Blowfish.CBC;

class DemoA
{
	public void a()
	{
		System.out.println("a method from DemoA");
	}
}

class DemoB extends DemoA

{
	public void a()
	{
		System.out.println("a method from DemoB");
	}
	public void b()
	{
		System.out.println("b method from DemoB");
	}
}

public class Cast {

	public static void main(String[] args) {
		DemoA c=new DemoB();
		c.a();
		DemoB d=(DemoB)c;
		d.a();
	d.b();
	}
}
