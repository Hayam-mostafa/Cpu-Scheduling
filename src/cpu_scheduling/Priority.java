package cpu_scheduling;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.table.DefaultTableModel;

public class Priority {

    private int currentTime = 0;
    private PriorityQueue<Process> priorityQueue
            = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.getPriority(), p2.getPriority()));

    public void addProcess(String processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);
        priorityQueue.add(newProcess);
    }

    public void execute(DefaultTableModel model) {
        int index = 0; // Row index in the table

        while (!priorityQueue.isEmpty()) {
            Process process = priorityQueue.poll();

            int waitingTime = currentTime;
            int turnaroundTime = waitingTime + process.getBurstTime();

            currentTime += process.getBurstTime();

            process.setWaitingTime(waitingTime);
            process.setTurnaroundTime(turnaroundTime);

            // Update the table model with the process information
            model.setValueAt("p" + process.getProcessID(), index, 0); // Process ID
            model.setValueAt(process.getBurstTime(), index, 1); // Burst Time
            model.setValueAt(process.getWaitingTime(), index, 2); // Waiting Time
            model.setValueAt(process.getTurnaroundTime(), index, 3); // Turnaround Time
            model.setValueAt(process.getPriority(), index, 4); // Priority

            // Move to the next row
            index++;
        }
    }

}
