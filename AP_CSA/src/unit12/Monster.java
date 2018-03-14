package unit12;


import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		
	}


	//write an initialization constructor with an int parameter ht

	public Monster(int ht){
		setHeight(ht);
	}

	//write an initialization constructor with int parameters ht and wt

	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);

	}


	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	public int getWeight() {
		return myWeight;
	}

	public void setWeight(int s) {
		myWeight = s;
	}

	public int getHeight() {
		return myHeight;
	}

	public void setHeight(int s) {
		myHeight = s;
	}

	public int getAge() {
		return myAge;
	}

	public void setAge(int s) {
		myAge = s;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if((this.getHeight()==rhs.getHeight() && this.getWeight()==rhs.getWeight())&&this.getAge()==rhs.getAge()){
			return 0;
		}
		
		if(this.getHeight()>rhs.getHeight()){
			return 1;
		}
		else if(this.getHeight()<rhs.getHeight()){
			return -1;
		}
		if(this.getWeight()>rhs.getWeight()){
			return 1;
		}
		else if(this.getWeight()<rhs.getWeight()){
			return -1;
		}

		if(this.getAge()>rhs.getAge()){
			return 1;
		}

		return -1;



	}

	

	//write a toString() method
	public String toString(){
		return getHeight()+" "+getWeight()+" "+getAge();
	}
	
}