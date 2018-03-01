package unit0;

public class IntroClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String str="Hello";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		int x=1;
			int y=2;
			double z=x/y;
		System.out.println(z);
		String test="";
		test=""+y;
		System.out.println(test.length());
		
		String name="hello";
		System.out.println(name.substring(5,5));	
		System.out.println("L"=="L");
		
		int p=1, r=2;
		if(p>0 || r++>5 && p>10){
			System.out.println("dude");
		}
		System.out.println(r);
		}

}
