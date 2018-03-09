package unit11;

public class Grade {
private double value;
public Grade(){
	setGrade(0);
}
public Grade(double grade){
	setGrade(grade);
}
public void setGrade(double grade){
	value=grade;
}
public double getNumericGrade(){
	return value;
}

public String getLetterGrade(){
	if(getNumericGrade()>=90){
		return "A";
	}
	else if(getNumericGrade()>=80){
		return "B";
	}
	else if(getNumericGrade()>=70){
		return "C";
	}
	else if(getNumericGrade()>=60){
		return "D";
	}
	return "F";
}

public String toString(){
	return String.format("%.2f", getNumericGrade())+"\n"+getLetterGrade();
}

}
