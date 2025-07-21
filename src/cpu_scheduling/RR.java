package cpu_scheduling;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.Queue;

public class RR {

    Queue<Process> list = new LinkedList<>();

    public void addProcess(String processID, int burstTime, int quantumTime) {
        list.add(new Process(processID, burstTime, quantumTime, true));
    }

    public void executeRR(DefaultTableModel model) {
        int currentTime = 0;
        Queue<Process> queue = new LinkedList<>(list);

        while (!queue.isEmpty()) {
            Process process = queue.poll();
            int timeToExecute = Math.min(process.getRemainingTime(), process.getquantemTime());

            process.setRemainingTime(process.getRemainingTime() - timeToExecute);
            currentTime += timeToExecute;

            if (process.getRemainingTime() == 0) {
                process.setTurnaroundTime(currentTime);
                process.setWaitingTime(currentTime - process.getBurstTime());
            } else {
                queue.add(process);
            }

            updateTable(model, process);
        }
    }

    private void updateTable(DefaultTableModel model, Process process) {
        String processID = "p" + process.getProcessID(); 
        boolean updated = false;

        // Update the table model with the process information
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(processID)) {
                model.setValueAt(process.getWaitingTime(), i, 2);
                model.setValueAt(process.getTurnaroundTime(), i, 3);
                updated = true;
                break;
            }
        }

        if (!updated) {
            model.addRow(new Object[]{processID, process.getBurstTime(), process.getWaitingTime(), process.getTurnaroundTime(), process.getPriority()});
        }
    }
}
