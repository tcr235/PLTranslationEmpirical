import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class codeforces_644_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] result = new int[n];
        Queue<Task> remaining = new PriorityQueue<Task>(new TaskComparator());
        boolean running = false;
        int finish_time = 0;
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            int duration = sc.nextInt();
            Task task = new Task(time, duration, i);
            result[i] = 0;
            if (task.time > finish_time && remaining.isEmpty()) {
                running = true;
                finish_time = task.time + task.duration;
                result[i] = finish_time;
            } else {
                if (task.time >= finish_time &&!remaining.isEmpty()) {
                    finish_time = runTask(remaining, finish_time);
                }
                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result[i] = -1;
                }
            }
        }
        while (!remaining.isEmpty()) {
            finish_time = runTask(remaining, finish_time);
        }
        for (int key : result) {
            System.out.println(key);
        }
    }

    public static int runTask(Queue<Task> remaining, int finish_time) {
        Task task = remaining.poll();
        finish_time = Math.max(finish_time, task.time) + task.duration;
        result[task.index] = finish_time;
        return finish_time;
    }
}

class TaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.time - o2.time;
    }
}

class Task {

    int time;
    int duration;
    int index;

    public Task(int time, int duration, int index) {
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(n)
