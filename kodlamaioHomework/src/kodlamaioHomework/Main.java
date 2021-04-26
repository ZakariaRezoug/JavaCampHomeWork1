package kodlamaioHomework;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses("1", "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)", "Engin Demirog", "Zakaria");
		Courses course2 = new Courses("2", "Yazýlým Geliþtirici Yetiþtirme Kampý (C# & ANGULAR)","Engin Demirog", "Zakaria");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.assignTeacher(course2);

	}

}
