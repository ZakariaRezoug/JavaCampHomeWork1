package kodlamaioHomework;

public class CourseManager {
	
	public void addCourse(Courses course) {
		
		System.out.println(course.name +" isimli kurs sisteme eklenmi�tir.");
	}
	public void register(Courses course) {
		
		System.out.println("Say�n "+course.student +" kursa kayd�n�z ba�ar�yla yap�lm��t�r.");
	}
	
	public void deleteCourse(Courses course) {
		
		System.out.println(course.name + " isimli kursu sistemden silinmi�tir.");
		
	}
	
	public void assignTeacher(Courses course) {
		System.out.println(course.teacher + " isimli ��retmen bu kursa atanm��t�r.");
	}

}
