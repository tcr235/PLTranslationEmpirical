import java.util.*;

public class codeforces_644_B {
    static class Task {
        int time;
        int duration;
        int index;

        Task(int time, int duration, int index) {
            this.time = time;
            this.duration = duration;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();

        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int time = scanner.nextInt();
            int duration = scanner.nextInt();
            Task task = new Task(time, duration, i);
            result.put(i, 0);

            if (task.time > finishTime && remaining.isEmpty()) {
                running = true;
                finishTime = task.time + task.duration;
                result.put(i, finishTime);
            } else {
                if (task.time >= finishTime && !remaining.isEmpty()) {
                    finishTime = runTask(remaining, finishTime).getSecond();
                    result.put(task.index, finishTime);
                }

                if (remaining.size() < b) {
                    remaining.add(task);
                } else {
                    result.put(i, -1);
                }
            }
        }

        while (!remaining.isEmpty()) {
            Pair<Integer, Integer> pair = runTask(remaining, finishTime);
            finishTime = pair.getFirst();
            result.put(pair.getSecond(), finishTime);
        }

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    private static Pair<Integer, Integer> runTask(Queue<Task> remaining, int finishTime) {
        Task taskToRun = remaining.poll();
        finishTime = Math.max(finishTime, taskToRun.time) + taskToRun.duration;
        return new Pair<>(finishTime, taskToRun.index);
    }
}