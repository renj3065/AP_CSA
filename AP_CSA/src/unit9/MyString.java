package unit9;

public class MyString {
	char[] strng;
	public MyString(char[] chars){
		strng=chars;
		
	}
	public char charAt(int index){
		return strng[index];
	}
	public int length(){
		int count=0;
		
		for(char x: strng){
			count++;
		}
		
		return count;
	}
	public MyString substring(int begin, int end){
		char[] temp=new char[end-begin];
		for(int x=begin;x<end;x++){
			temp[x-begin]=strng[x];
		}
		MyString sub=new MyString(temp);
		
		return sub;

		
	}
	public MyString toLowerCase(){
		char[] temp=strng;
		int index=0;
		for(char x:strng)
		{
			if (x>64 && x<91)
				temp[index]=(char)((int)temp[index]+32);
			index++;
		}
		
		MyString low=new MyString(temp);
		return low;
	}
	//public boolean equals(MyString s){
		//for
	//}
	//public static MyString valueOf(int i);
				
				

}
