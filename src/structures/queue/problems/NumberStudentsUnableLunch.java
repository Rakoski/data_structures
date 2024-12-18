package structures.queue.problems;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NumberStudentsUnableLunch {

    public static int numberOfStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwichesStack = new Stack<>();
        Queue<Integer> studentsQueue = new ArrayDeque<>();

        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichesStack.push(sandwiches[i]);
        }

        for (int student : students) {
            studentsQueue.offer(student);
        }
        int studentsWithSandwiches = 0;
        int studentsNoSandwitches = 0;
        int rotations = 0; // we need to check if the rotations we got
        // from a student are smaller than the size of the array with the
        // students, since we need to know how many students we have
        // and how many sandwiches are unable to be eaten
        int size = studentsQueue.size();

        while (!studentsQueue.isEmpty() && rotations < size) {
            if (Objects.equals(studentsQueue.peek(), sandwichesStack.peek())) {
                studentsQueue.poll();
                sandwichesStack.pop();
                studentsWithSandwiches++;
                rotations = 0; // return the rotations of the students back to 0
                size--; // decrement the size of the queue
            } else {
                int firstStudentInLine = studentsQueue.poll();
                studentsQueue.offer(firstStudentInLine);
                rotations++;
            }
        }
        studentsNoSandwitches = studentsQueue.size();
        return studentsNoSandwitches;
    }

    public static void main(String[] args) {
        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};
        System.out.println(numberOfStudents(students, sandwiches));
    }
}
