class Student {
    private String name;
    private int age;
    private char grade;
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class FoundStudent{
    public static int findStudentByName(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 20, 'A');
        students[1] = new Student("Bob", 21, 'B');
        students[2] = new Student("Charlie", 22, 'C');
        students[3] = new Student("David", 19, 'B');
        students[4] = new Student("Eve", 20, 'A');

        String searchName = "Bob";
        int index = findStudentByName(students, searchName);
        
        if (index != -1) {
            System.out.println("Student found at index: " + index);
            students[index].displayInfo();
        } else {
            System.out.println("Student not found.");
        }
    }
}