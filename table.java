public class table {
    public static void main(String[] args) {
        String name = "John";
        int age = 20;
        char grade = 'A';
        String name2 = "Jane";
        int age2 = 22;
        char grade2 = 'B';
        String name3 = "Bob";
        int age3 = 25;
        char grade3 = 'C';
        System.out.printf("Name\tAge\tGrade\n");
        System.out.printf("%s\t%d\t%c\n", name, age, grade);
        System.out.printf("%s\t%d\t%c\n", name2, age2, grade2);
        System.out.printf("%s\t%d\t%c\n", name3, age3, grade3);
        System.out.printf("Name\tAge\tGrade%n%s\t%d\t%c%n%s\t%d\t%c%n%s\t%d\t%c%n", name, age, grade, name2, age2, grade2, name3, age3, grade3);
    }
}
