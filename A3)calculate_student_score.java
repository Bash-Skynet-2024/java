import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of student :");
        String name = sc.next();

        System.out.println("Enter name of subject 1 :");
        String subject1 = sc.next();

        System.out.println("Enter name of subject 2 :");
        String subject2 = sc.next();

        System.out.println("Enter name of subject 3 :");
        String subject3 = sc.next();

        System.out.println("Enter total marks of individual subject :");
        float total = sc.nextFloat();

        System.out.println("Enter score of " + subject1);
        float s1 = sc.nextFloat();

        System.out.println("Enter score of " + subject2);
        float s2 = sc.nextFloat();

        System.out.println("Enter score of " + subject3);
        float s3 = sc.nextFloat();

        float s1per = (float)((s1 / total) * 100);
        float s2per = (float)((s2 / total) * 100);
        float s3per = (float)((s3 / total) * 100);
        float totalper = (float)(((s1 + s2 + s3) / (total * 3)) * 100);

        if (s1per >= 33) {
            System.out.println(name + " has passed " + subject1 + " with " + s1per + " percentage");
        } else {
            System.out.println(name + " has failed in " + subject1);
        }
        if (s2per >= 33) {
            System.out.println(name + " has passed " + subject2 + " with " + s2per + " percentage");
        } else {
            System.out.println(name + " has failed in " + subject2);
        }
        if (s3per >= 33) {
            System.out.println(name + " has passed " + subject3 + " with " + s3per + " percentage");
        } else {
            System.out.println(name + " has failed in " + subject3);
        }
        if (totalper >= 40) {
            System.out.println(name + " has passed the grade with " + totalper + " percentage");
        }

    }
}
