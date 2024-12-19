import java.util.ArrayList;
import java.util.Scanner;

class Exercise {
    private String name;
    private int sets;
    private int repetitions;
    private int weight;

    public Exercise(String name, int sets, int repetitions, int weight) {
        this.name = name;
        this.sets = sets;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Exercise: " + name);
        System.out.println("Sets: " + sets);
        System.out.println("Repetitions: " + repetitions);
        System.out.println("Weight: " + weight + " kg\n");
    }
}

class Workout {
    private String workoutName;
    private ArrayList<Exercise> exercises;

    public Workout(String workoutName) {
        this.workoutName = workoutName;
        this.exercises = new ArrayList<>();
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void displayWorkout() {
        System.out.println("Workout: " + workoutName);
        for (Exercise exercise : exercises) {
            exercise.displayDetails();
        }
    }
}


