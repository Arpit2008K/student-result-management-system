import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double[] marks = new double[n];

        System.out.print("Enter marks of " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        double maxMarks = n * 100;
        double perc = (total / maxMarks) * 100;

        System.out.printf("Percentage is: %.2f%n", perc);

        if (perc >= 75) {
            System.out.println("Grade is: A");
        } else if (perc >= 60) {
            System.out.println("Grade is: B");
        } else if (perc >= 40) {
            System.out.println("Grade is: C");
        } else {
            System.out.println("Grade is: F");
        }

        sc.close();
    }
}
