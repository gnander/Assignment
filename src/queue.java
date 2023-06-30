import java.util.ArrayList;

public class queue {
    public static void main(String[] args) {
        Student1 queue1 = new Student1("GnanderKumar",19127001,21,"7993069303","morlagnanu@gmail.com");
        Student1 queue2 = new Student1("Kalyan",19127002,21,"9517534682","Kalyan@gmail.com");
        Student1 queue3 = new Student1("Kondaiah",19127003,21,"8523691475","Kondaiah@gmail.com");
        Student1 queue4 = new Student1("Rupesh",19127004,21,"8523697415","Rupesh@gmail.com");
        Student1 queue5 = new Student1("Anirudh",19127005,21,"465897235","Anirudh@gmail.com");
        Student1 queue6 = new Student1("Lalith",19127006,21,"7896541235","lalith@gmail.com");
        Student1 queue7 = new Student1("Pavan",19127007,21,"65478932145","Pavan@gmail.com");
        Student1 queue8 = new Student1("Jana",19127008,21,"7896541238","jana@gmail.com");
        Student1 queue9 = new Student1("Feroz",19127009,21,"852369741","feroz@gmail.com");
        Student1 queue10 = new Student1("Narasimha",19127010,21,"7896541235","narasimha@gmail.com");

        ArrayList<Student1> q1 = new ArrayList<>();
        q1.add(queue1);
        q1.add(queue2);
        q1.add(queue3);
        q1.add(queue4);
        q1.add(queue5);
        q1.add(queue6);
        q1.add(queue7);
        q1.add(queue8);
        q1.add(queue9);
        q1.add(queue10);

        // Remove 6 students from the queue
        for (int i = 0; i < 6; i++) {
            if (q1.size() > 0) {
                Student1 removedStudent = q1.remove(0);
                System.out.println("Removed student: " + removedStudent.getName());
            }
        }

        // Display the remaining students' names and phone numbers
        for (Student1 student : q1) {
            System.out.println("Name: " + student.getName() + ", Phone: " + student.getPhone() + ", roll:  " +student.troll() );
        }
    }
}


class Student1 {
    String name;
    int roll;
    int age;
    String phone;
    String email;


    public Student1 (String name, int roll, int age, String phone, String email) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int troll() {
        return roll;
    }
}
