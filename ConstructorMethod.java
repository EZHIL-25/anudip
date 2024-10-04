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

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
class ConstructorMethod{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 20, 'A');
        students[1] = new Student("Bob", 21, 'B');
        students[2] = new Student("Charlie", 22, 'C');
        students[3] = new Student("David", 19, 'B');
        students[4] = new Student("Eve", 20, 'A');
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
