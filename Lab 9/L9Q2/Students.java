/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Students extends PersonProfile {
    
//    Arrays are suitable when you need to maintain a specific order
//    Hashmaps are useful when you have a set of unique identifiers(keys)
    
    HashMap <String, Course> courseList = new HashMap <String, Course> ();
    
    Students (String name, String gender, String birthdate,String fileName) {
        super(name, gender, birthdate);
        
        try (BufferedReader r = new BufferedReader (new FileReader (fileName)))
        {
            String code = "";
            
            while ((code = r.readLine()) != null) {
            
            String courseName = r.readLine();
            int session = Integer.parseInt(r.readLine());
            int semester = Integer.parseInt(r.readLine());
            int marks = Integer.parseInt(r.readLine());
                
            Course course = new Course (code, courseName, session, semester, marks);
            courseList.put(code, course);
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void display () {
        
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Birthdate: " + birthdate);
        
        for (String code : courseList.keySet()) {
            System.out.println("\nCourse Code: " + code);
            System.out.println("Course Name: " + courseList.get(code).getCourseName());
            System.out.println("Session: " + courseList.get(code).getSession());
            System.out.println("Semester: " + courseList.get(code).getSemester());
            System.out.println("Marks: " + courseList.get(code).getMarks());
            System.out.println("Grade: " + courseList.get(code).getGrade());
        }
    }
}

class Course {
    
    String courseName;
    String courseCode;
    int semester;
    int session;
    int marks;
    String grade;
    
    Course (String courseCode, String courseName, int session, int semester, int marks) {
        
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.marks = marks;
        this.setGrade ();
    }
    
    public void setGrade () {
        
        if (marks >= 85) { this.grade = "A";}
        else if (marks >= 75) { this.grade = "A-";}
        else if (marks >= 70) { this.grade = "B+";}
        else if (marks >= 65) { this.grade = "B";}
        else if (marks >= 60) { this.grade = "B-";}
        else if (marks >= 55) { this.grade = "C+";}
        else if (marks >= 50) { this.grade = "C";}
        else if (marks >= 45) { this.grade = "D";}
        else if (marks >= 35) { this.grade = "E";}
        else { this.grade = "F";}
    }
    
    public String getCourseCode() {
		return this.courseCode;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public int getSession() {
		return this.session;
	}
	
	public int getSemester() {
		return this.semester;
	}
	
	public int getMarks() {
		return this.marks;
	}
        
        public String getGrade() {
		return this.grade;
	}
}
