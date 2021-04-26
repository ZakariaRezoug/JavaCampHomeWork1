package kodlamaioHomework;

public class CourseManager {
	
	public void addCourse(Courses course) {
		
		System.out.println(course.name +" isimli kurs sisteme eklenmiştir.");
	}
	public void register(Courses course) {
		
		System.out.println("Sayın "+course.student +" kursa kaydınız başarıyla yapılmıştır.");
	}
	
	public void deleteCourse(Courses course) {
		
		System.out.println(course.name + " isimli kursu sistemden silinmiştir.");
		
	}
	
	public void assignTeacher(Courses course) {
		System.out.println(course.teacher + " isimli öğretmen bu kursa atanmıştır.");
	}

}
