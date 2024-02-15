/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.L9Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Lecturer extends PersonProfile {
    
    HashMap <String, Course> courseList = new HashMap <String, Course> ();
    
    Lecturer (String name, String gender, String birthdate,String fileName) {
        super(name, gender, birthdate);
        
        try (BufferedReader r = new BufferedReader (new FileReader (fileName)))
        {
            String code = "";
            
            while ((code = r.readLine()) != null) {
            
            String courseName = r.readLine();
            int session = Integer.parseInt(r.readLine());
            int semester = Integer.parseInt(r.readLine());
            double creditHours = Double.parseDouble(r.readLine());
            int numOfStudents = Integer.parseInt(r.readLine());
                
            Course course = new Course (code, courseName, session, semester, creditHours, numOfStudents);
            courseList.put(code, course);
        }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void display () {
        
        System.out.println("Lecturer Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Birthdate: " + birthdate);
        
        for (String code : courseList.keySet()) {
            System.out.println("\nCourse Code: " + code);
            System.out.println("Course Name: " + courseList.get(code).getCourseName());
            System.out.println("Session: " + courseList.get(code).getSession());
            System.out.println("Semester: " + courseList.get(code).getSemester());
            System.out.println("Num of Students: " + courseList.get(code).getNumOfStudents());
            System.out.println("Cedit Hours: " + courseList.get(code).getcreditHour());
        }
    } 
}

class Course {
    
    String courseName;
    String courseCode;
    int semester;
    int session;
    double creditHours;
    int numOfStudents;
    
    Course (String courseCode, String courseName, int session, int semester, double creditHours, int numOfStudents) {
        
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.creditHours = creditHours;
        this.numOfStudents = numOfStudents;
        
        // Call setCreditHour to adjust credit hours
        setCreditHours();
    }
    
    public void setCreditHours () {
        
        if (numOfStudents >= 150) { creditHours *= 3 ;}
        else if (numOfStudents >= 100) { creditHours *= 2;}
        else if (numOfStudents >= 50) { creditHours *= 1.5;}
        else { creditHours *= 1;}
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
        
        public double getcreditHour() {
		return this.creditHours;
	}
        
        public int getNumOfStudents() {
		return this.numOfStudents;
	}
}
