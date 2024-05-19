package com.thinkxfactor.attendNow.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.thinkxfactor.attendNow.domain.Student;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private List<Student> studentsDb = new ArrayList<>();

    // @GetMapping("/hello")
    // public String hello() {
    // System.out.println("Requet is inside Student Controller /hello !!");
    // return "Welcome to Hello World API from Student Controller!!";
    // }

    // // 1. GET Mapping with no parameters and returning a String
    // @GetMapping("/welcome")
    // public String welcome() {
    // System.out.println("Requet is inside Student Controller /welcome !!");
    // return "Welcome to Student Controller!! /welcome";
    // }

    // // 2. GET Mapping with a path variable and returning a customized message
    // @GetMapping("/customWelcome/{name}")
    // public String customWelcome(@PathVariable String name) {
    // return "Hello " + name.toUpperCase() + ",Welcome to Student Controller!!
    // /customWelcome";
    // }

    // // 3. GET Mapping with query parameters a
    // @GetMapping("/customWelcome2")
    // public String customWelcome2(@RequestParam String name, @RequestParam int
    // age) {
    // return "Hello " + name + " " + age + ",Welcome to Student sdgsdgController!!
    // /customWelcome2";
    // }

    // @GetMapping("/login")
    // public Map<String, String> login(@RequestParam String username, @RequestParam
    // String password) {
    // // Logic for login
    // HashMap<String, String> map = new HashMap<>();
    // if (username.equals("admin") && password.equals("admin")) { // db call
    // map.put("status", "success");
    // map.put("message", "Login Successful");
    // } else {
    // map.put("status", "failure");
    // map.put("message", "Login Failed");

    // }
    // return map;
    // }

    // List students
    // @GetMapping("/list")
    // public List<Student> listStudents() {
    // ArrayList<Student> students = new ArrayList<>();
    // Student std1 = new Student("Rahul", "rahul@gmail.com", "9845012345");
    // Student std2 = new Student("Riya", "riya@gmail.com", "9845012346");
    // Student std3 = new Student("Raj", "raj@gmail.com", "9845012347");
    // students.add(std1);
    // students.add(std2);
    // students.add(std3);
    // return students;

    // }

    // Add student
    // @GetMapping("/addStudent")
    // public Student addStudent(@RequestParam String name, @RequestParam String
    // email, @RequestParam String phone) {
    // Student std = new Student(name, email, phone);

    // // add logic to save student object to database
    // std.setId(1L);

    // // return the saved student object
    // return std;
    // }

    // // Add student
    // @PostMapping("/addStudent")
    // public Student addStudent(@RequestBody Student student) {
    // System.out.println(student.getName());
    // System.out.println(student.getEmail());
    // System.out.println(student.getPhone());

    // // add logic to save student object to database
    // student.setId(1L);
    // return student;
    // }

    // CRUD Operations : Create, Read, Update, Delete Students

    // Create Student
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        student.setId((long) (studentsDb.size() + 1));
        studentsDb.add(student);
        return student;
    }

    // Read Students
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentsDb;
    }

    // Update Student
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        for (Student std : studentsDb) {
            if (std.getId().equals(student.getId())) {
                std.setName(student.getName());
                std.setEmail(student.getEmail());
                std.setPhone(student.getPhone());
                std.setUsername(student.getUsername());
                std.setPassword(student.getPassword());
                std.setAddress(student.getAddress());
                return std;
            }
        }
        return null;
    }

    // Delete Student
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        for (Student std : studentsDb) {
            if (std.getId().equals(id)) {
                studentsDb.remove(std);
                break;
            }
        }
    }

}
