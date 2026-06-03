import java.util.PriorityQueue;
import java.util.Scanner;

class Task implements Comparable<Task> {
    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.time, other.time);
    }
}

public class codeforces_644_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine().split(" ");
            int time = Integer.parseInt(input[0]);
            int duration = Integer.parseInt(input[1]);
            tasks[i] = new Task(time, duration, i);
        }

        PriorityQueue<Task> remaining = new PriorityQueue<>();
        boolean running = false;
        int finishTime = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (tasks[i].time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = tasks[i].time + tasks[i].duration;
                result[tasks[i].index] = finishTime;
            } else {
                if (tasks[i].time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime, result);
                }
                if (remaining.size() < b) {
                    remaining.add(tasks[i]);
                } else {
                    result[tasks[i].index] = -1;
                }
            }
        }

        while (!remaining.isEmpty()) {
            finishTime = runTask(remaining, finishTime, result);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    public static int runTask(PriorityQueue<Task> remaining, int finishTime, int[] result) {
        Task task = remaining.poll();
        finishTime = Math.max(finishTime, task.time) + task.duration;
        result[task.index] = finishTime;
        return finishTime;
    }
}