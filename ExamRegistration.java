package Assignment_3;


import java.util.Scanner;

/// Custom Exception
    class InvalidReg extends Exception {

        InvalidReg(String message) {
            super(message);
        }
    }

   public  class ExamRegistration {

        String stId;
        String stName;
        int age;
        int mark;
        int sub;

         void registerStudent() throws InvalidReg {

            Scanner input = new Scanner(System.in);

            System.out.println("EXAM REGISTRATION SYSTEM ");

            System.out.print("Enter Student ID: ");
            stId = input.next();

            System.out.print("Enter Student Name: ");
            stName = input.next();

            System.out.print("Enter Age: ");
            age = input.nextInt();

            System.out.print("Enter Exam Mark: ");
            mark = input.nextInt();

            System.out.print("Enter Number of Subjects: ");
            sub = input.nextInt();

            if (stId.equals("")) {
                throw new InvalidReg("Student ID cannot be empty.");
            }

            if (age < 18) {
                throw new InvalidReg("Age must be at least 18.");
            }

            if (mark < 0 || mark > 100) {
                throw new InvalidReg("Exam mark must be between 0 and 100.");
            }

            if (sub < 1 || sub > 5) {
                throw new InvalidReg("Maximum allowed subjects is 5.");
            }

            System.out.println();
            System.out.println("Registration Successful!");
            System.out.println("Student: " + stName);
            System.out.println("Registered Subjects: " + sub);
        }
    }

    /// /Main Class
    class Main {

        public static void main() {

            ExamRegistration student = new ExamRegistration();

            try {

                student.registerStudent();

            }

            catch (InvalidReg e) {

                System.out.println();
                System.out.println("Registration Failed!");
                System.out.println("Error: " + e.getMessage());

            }

            catch (Exception e) {

                System.out.println();
                System.out.println("Invalid Input!");

            }

            finally {

                System.out.println();
                System.out.println("Registration attempt completed.");
            }
        }
    }

