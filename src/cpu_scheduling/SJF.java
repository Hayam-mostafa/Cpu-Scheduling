package cpu_scheduling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.table.DefaultTableModel;

public class SJF {

    public void addProcess(String processID, int burstTime) {
        list.add(new Process(processID, burstTime));
    }

    Queue<Process> list = new LinkedList<>();
    int currentTime = 0;

    public void executeSJF(DefaultTableModel model) {
        int countrow = model.getRowCount();

        List<Object[]> tabledata = new ArrayList<>();
        for (int i = 0; i < countrow; i++) {
            Object[] row = new Object[4];
            row[0] = model.getValueAt(i, 0);
            row[1] = Integer.parseInt(model.getValueAt(i, 1).toString());
            row[2] = 0;
            row[3] = 0;
            tabledata.add(row);

        }

        tabledata.sort((a, b) -> Integer.compare((int) a[1], (int) b[1]));
        for (Object[] row : tabledata) {
            int burstTime = (int) row[1];
            row[2] = currentTime;
            row[3] = currentTime + burstTime;
            currentTime += burstTime;
        }
  tabledata.sort((a, b) -> ((String) a[0]).compareTo((String) b[0]));

        
        for (int i = 0; i < countrow; i++) {
            Object[] row = tabledata.get(i);
            model.setValueAt(row[0], i, 0);
            model.setValueAt(row[1], i, 1);
            model.setValueAt(row[2], i, 2);
            model.setValueAt(row[3], i, 3);
        }

    }
}
