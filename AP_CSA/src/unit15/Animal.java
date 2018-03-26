package unit15;

public class Animal {
	private String nm;
public Animal(String name){
nm=name;	
}
public void eat(){
	System.out.println(nm+" just ate");
}

public void sleep(){
	System.out.println(nm+" just slept");
}

public static void main(String[] args){
	Dog test=new Dog("Gerald");
	test.sleep();
	test.fetch();
}
}
