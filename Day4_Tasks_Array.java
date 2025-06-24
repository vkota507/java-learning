import java.util.Scanner;

public class Day4_Tasks_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //task_array_average(input);
        //task_array_average_enhanced(input);
        //ask_2D_array_marks(input);
        task_matrix_diagonals(input);

        input.close();
    }

    public static void task_array_average(Scanner input) {
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        // Step 1: Declare and create the array
        int[] numbers = new int[n];

        // Step 2: Read elements into the array
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Step 3: Calculate the sum

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Step 4: Calculate Average

        int avg = sum / n;

        System.out.println("Average: " + avg);
    }

    public static void task_array_average_enhanced(Scanner input) {
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("No.of elements must be greater than zero");
        }

        int[] numbers = new int[n];

        System.out.println("Enter the " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double avg = (double) sum / n;
        System.out.printf("Average of the entered numbers is: %.2f%n", avg);
    }

    public static void task_2D_array_marks(Scanner input) {
        System.out.print("Enter no.of Students(rows): ");
        int r = input.nextInt();

        System.out.print("Enter no.of Subjects(columns): ");
        int c = input.nextInt();

        int[][] marks = new int[r][c];

        //Input values

        System.out.println("Enter marks: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Student " + (i + 1) + ", Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }

        //output matrix
        System.out.println("Marks matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }

        //Row-wise totals
        System.out.println("\nTotal marks per Student: ");
        for (int i=0; i<r; i++){
            int sumrow =0;
            for (int j=0; j<c; j++){
                sumrow += marks[i][j];
            }
            System.out.println("Student "+(i+1)+ ": "+ sumrow);
        }

        // column-wise totals
        System.out.println("\nTotal marks per Subject: ");
        for (int j=0;j<c; j++){
            int sumcol = 0;
            for(int i=0; i<r; i++){
                sumcol += marks[i][j];
            }
            System.out.println("Subject "+(j+1)+": "+ sumcol);
        }

        // Max & Min total marks per student
        int maxStudentTotal = Integer.MIN_VALUE;
        int minStudentTotal = Integer.MAX_VALUE;
        int maxStudentIndex = -1;
        int minStudentIndex = -1;

        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += marks[i][j];
            }
            if (rowSum > maxStudentTotal) {
                maxStudentTotal = rowSum;
                maxStudentIndex = i;
            }
            if (rowSum < minStudentTotal) {
                minStudentTotal = rowSum;
                minStudentIndex = i;
            }
        }
        System.out.println("\nTopper is Student " + (maxStudentIndex + 1) + " with " + maxStudentTotal + " marks.");
        System.out.println("Lowest total is by Student " + (minStudentIndex + 1) + " with " + minStudentTotal + " marks.");

        // Max & Min total marks per subject
        int maxSubjectTotal = Integer.MIN_VALUE;
        int minSubjectTotal = Integer.MAX_VALUE;
        int maxSubjectIndex = -1;
        int minSubjectIndex = -1;

        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += marks[i][j];
            }
            if (colSum > maxSubjectTotal) {
                maxSubjectTotal = colSum;
                maxSubjectIndex = j;
            }
            if (colSum < minSubjectTotal) {
                minSubjectTotal = colSum;
                minSubjectIndex = j;
            }
        }
        System.out.println("\nMost scoring subject: Subject " + (maxSubjectIndex + 1) + " with " + maxSubjectTotal + " total.");
        System.out.println("Least scoring subject: Subject " + (minSubjectIndex + 1) + " with " + minSubjectTotal + " total.");

    }

    public static void task_matrix_diagonals(Scanner input) {
        System.out.print("Enter size of square matrix (n): ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter " + (n * n) + " elements:");

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("Primary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.print("\nSecondary diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1] + " ");
        }

        System.out.println(); // for clean ending
    }


}

