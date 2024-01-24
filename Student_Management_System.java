import java.util.*;
class Student{
    String Student_Name;
    int Student_Roll_No;
    String Student_Grade;

    // Constructor
    Student(String name,int Rollno,String Grade){
        this.Student_Name=name;
        this.Student_Roll_No=Rollno;
        this.Student_Grade=Grade;

    }

    // Generate Getters,Setters
    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public int getStudent_Roll_No() {
        return Student_Roll_No;
    }

    public void setStudent_Roll_No(int student_Roll_No) {
        Student_Roll_No = student_Roll_No;
    }

    public String getStudent_Grade() {
        return Student_Grade;
    }

    public void setStudent_Grade(String student_Grade) {
        Student_Grade = student_Grade;
    }

    // Generate Tostring method
    @Override
    public String toString() {
        System.out.println("____________________________________________________________________|");
        return "Student_Name : " + Student_Name + " | Student_Roll_No : " + Student_Roll_No + " | Student_Grade : " + Student_Grade  ;
    }
    
}


class StudentMgmtsystem{
    ArrayList<Student> stu=new ArrayList<>();

    // Create add method
    public void addStudent(Student s){
        stu.add(s);
    }

    // Display All Students
    public void displayStudent(){
        for(Student s:stu){
            System.out.println(s);
        }
    }

    // Create Update Student Method
    public void updateStudent(int StuRollno,String name,String grade){
        for(Student i:stu){
            if(i.getStudent_Roll_No()==StuRollno){
               i.setStudent_Grade(grade);
               i.setStudent_Name(name);
               i.setStudent_Roll_No(StuRollno);
               System.out.println("\n!!! Student update Successfully !!!");
            }
        }
    }
    //  create search Method
    public Student searchStudent(int RollNo){
        for(Student i:stu){
            if(i.getStudent_Roll_No()==RollNo){
               return i;
            }
        }
        return null;
    }

    // Create method to remove Student
    public void removeStudent(int Rollno){
        for(Student i:stu){
            if(i.getStudent_Roll_No()==Rollno){
                System.out.println("\n!!! Student Remove Successfully !!!");
            }
        }
    }

    // Create method to get single student
    public Student getSingleStu(int Rollno){
        for(Student i:stu){
            if(i.getStudent_Roll_No()==Rollno){
                return i;
            }
        }
        return null;
    }
}

public class Student_Management_System{
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        StudentMgmtsystem studentmgmt=new StudentMgmtsystem();

        // Create student menu
        while(true){
            System.out.println();
            System.out.println("\n____________This is a student management menu__________");
            System.out.println("\nHere are some options you select any one option at one time as per your want");
            System.out.println("Option 1 for Add Student  ");
            System.out.println("Option 2 for Display Student  ");
            System.out.println("Option 3 for Update Student  ");
            System.out.println("Option 4 for Search Student  ");
            System.out.println("Option 5 for Remove Student  ");
            System.out.println("Option 6 for Get Single Student  ");
            System.out.println("Option 7 for Exit  ");


            // Take input options from the user
            System.out.print("\nEnter your choice : ");
            int choice=scnr.nextInt();
            
            // Switch case
            switch(choice){
                case 1:
                System.out.print("Enter Student Name : ");
                String name=scnr.next();
                System.out.print("Enter Student Roll no : ");
                int roll_no=scnr.nextInt();
                System.out.print("Enter Student Grade : ");
                String grade=scnr.next();

                Student stu=new Student(name, roll_no, grade);
                studentmgmt.addStudent(stu);

                System.out.println("\n!!! Student added Successfully !!!");
                break;

                
                case 2:
                System.out.println("\nAll Students");
                studentmgmt.displayStudent();
                break;

                case 3:
                System.out.print("Enter Roll No : ");
                int new_Rollno=scnr.nextInt();
                System.out.print("Enter New Name : ");
                String new_Name=scnr.next();
                System.out.print("Enter New Grade : ");
                String new_Grade=scnr.next();

                studentmgmt.updateStudent(new_Rollno, new_Name, new_Grade);
                break;

                case 4:
                System.out.print("Enter Roll No : ");
                int rollno=scnr.nextInt();
                Student stusearch= studentmgmt.searchStudent(rollno);
                if(stusearch==null){
                System.out.println("\n!!! Student Not Found !!!");
                }
                else{
                    System.out.println(stusearch);
                }
                break;
                
                case 5:
                System.out.print("Enter Roll No : ");
                int rollNo=scnr.nextInt();
                studentmgmt.removeStudent(rollNo);
                break;

                case 6:
                System.out.print("Enter Roll No : ");
                int RollNo=scnr.nextInt();
                Student getstudent=studentmgmt.getSingleStu(RollNo);
                if(getstudent==null){
                    System.out.println("!!! Invalid student Id Student Not Found !!!");
                }
                else{
                    System.out.println(getstudent);
                }
                break;
                

                case 7:
                   System.out.print("Exit to the application. ");
                   System.exit(0);
                break;

                default:
                System.out.println("Invalid option !");
            }
        }
        
    }
}

