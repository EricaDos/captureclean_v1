
public class student {
	String name;
	int studentId;
	int yearOfStudy;
	double examMark;
	String result;
	
	//Getters 
	void setName(String n) {
		name = n;
	}
	void setStudentId(int id) {
		studentId = id;
	}
	void setYearOfStudy(int y) {
		yearOfStudy = y;
	}
	void setExamMark(double m) {
		examMark = m;
	}
	void setResult(String r) {
		result = r;
	}
	
	//Getters - Return the information of the class
	
	String getName() {
		return name;
	}
	int getStudentId() {
		return studentId;
	}
	int getYearOfStudy() {
		return yearOfStudy;
	}
	double getExamMark() {
		return examMark;
	}
	String getResult() {
		return result;
	}
	
	void finalResult() {
		if(this.examMark >= 40) this.result = "Congrats, You Passed";
		else this.result= "Sorry, You Failed";
	}
	public String toString(){
		return "Name: "+ name + "Student Id: " + studentId + "Year: " + yearOfStudy + "Exam Mark: " + examMark + "Result :" + result;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//	}
	

}
