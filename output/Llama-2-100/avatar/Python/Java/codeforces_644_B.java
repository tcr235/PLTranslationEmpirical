import java.util.LinkedList;
import java.util.Queue;
public class codeforces_644_B {
    public Task(int time, int duration, int index) {
        super();
        this.time = time;
        this.duration = duration;
        this.index = index;
    }
    public int getTime() {
        return time;
    }
    public int getDuration() {
        return duration;
    }
    public int getIndex() {
        return index;
    }
}
public class codeforces_644_B {
    public static void main(String[] args) {
        int n, b;
        n = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        Queue<Task> remaining = new LinkedList<>();
        boolean running = false;
        int finishTime = 0;
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int time, duration;
            time = Integer.parseInt(args[i * 2]);
            duration = Integer.parseInt(args[i * 2 + 1]);
            Task task = new Task(time, duration, i);
            remaining.offer(task);
            if (task.getTime() > finishTime && remaining.size() > 0) {
                running = true;
                finishTime = task.getTime() + task.getDuration();
                result.put(i, finishTime);
            } else if (task.getTime() >= finishTime && !remaining.isEmpty()) {
                finishTime, result = runTask(remaining, finishTime);
            }
        }
        while (!remaining.isEmpty()) {
            finishTime, result = runTask(remaining, finishTime);
        }
        for (int key : result.keySet()) {
            System.out.println(result.get(key));
        }
    }
    public static int runTask(Queue<Task> remaining, int finishTime) {
        Task task = remaining.poll();
        if (task == null) {
            return finishTime;
        }
        finishTime = Math.max(finishTime, task.getTime() + task.getDuration());
        result.put(task.getIndex(), finishTime);
        if (remaining.size() < b) {
            remaining.offer(task);
        }
        return finishTime;
    }
}


