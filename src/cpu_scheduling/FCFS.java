package cpu_scheduling;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.Queue;

public class FCFS {

    Queue<Process> list = new LinkedList<>();
    int currentTime = 0;

    public void addProcess(String processID, int burstTime) {
        list.add(new Process(processID, burstTime));
    }

    public void execute(DefaultTableModel model) {
        int index = 0;
        while (!list.isEmpty()) {
            Process process = list.poll();
            int waitingTime = currentTime;
            process.setWaitingTime(waitingTime);

            int turnaroundTime = waitingTime + process.getBurstTime();
            process.setTurnaroundTime(turnaroundTime);

            currentTime += process.getBurstTime();

            model.setValueAt(process.getWaitingTime(), index, 2);
            model.setValueAt(process.getTurnaroundTime(), index, 3);
            index++;
        }
    }
}
