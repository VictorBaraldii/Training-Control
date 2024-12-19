import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutControl {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Workout> workouts = new ArrayList<>();

    while (true) {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Create new workout");
        System.out.println("2. Add exercise to a workout");
        System.out.println("3. Display workouts");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (option) {
            case 1:
                System.out.print("Workout name: ");
                String workoutName = scanner.nextLine();
                workouts.add(new Workout(workoutName));
                System.out.println("Workout created successfully!");
                break;

            case 2:
                if (workouts.isEmpty()) {
                    System.out.println("No workouts available. Create one first!");
                } else {
                    System.out.println("Available workouts:");
                    for (int i = 0; i < workouts.size(); i++) {
                        System.out.println((i + 1) + ". " + workouts.get(i).getWorkoutName());
                    }

                    System.out.print("Choose the workout number: ");
                    int workoutIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (workoutIndex >= 0 && workoutIndex < workouts.size()) {
                        System.out.print("Exercise name: ");
                        String exerciseName = scanner.nextLine();
                        System.out.print("Number of sets: ");
                        int sets = scanner.nextInt();
                        System.out.print("Number of repetitions: ");
                        int repetitions = scanner.nextInt();
                        System.out.print("Weight (in kg): ");
                        int weight = scanner.nextInt();
                        scanner.nextLine();

                        Exercise exercise = new Exercise(exerciseName, sets, repetitions, weight);
                        workouts.get(workoutIndex).addExercise(exercise);
                        System.out.println("Exercise added successfully!");
                    } else {
                        System.out.println("Invalid workout selection. Please try again.");
                    }
                }
                break;

            case 3:
                if (workouts.isEmpty()) {
                    System.out.println("No workouts registered.");
                } else {
                    for (Workout workout : workouts) {
                        workout.displayWorkout();
                    }
                }
                break;

            case 4:
                System.out.println("Exiting... Have a great workout!");
                scanner.close();
                return;

            default:
                System.out.println("Invalid option.");
        }
    }
}
}

