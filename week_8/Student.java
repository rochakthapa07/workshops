package week_8;

public class Student {

    private String collegeId;
    private int id;
    private String name;
    private int age;
    private String address;
    private long phoneNumber;

    static String collegeName = "ABC College";

    // Constructor 1
    public Student(String collegeId, String name, int age) {
        this.collegeId = collegeId;
        this.name = name;
        this.age = age;
    }

    // Constructor 2
    public Student(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Setter and Getter for collegeId
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter for age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // Display basic info
    public void display() {
        System.out.println("Name of the student: " + name);
        System.out.println("College ID: " + collegeId);
        System.out.println("Age: " + age);
    }

    // Behaviours
    public void study() {
        System.out.println(name + " is studying");
    }

    public void laugh() {
        System.out.println(name + " is laughing");
        System.out.println("Student ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}
