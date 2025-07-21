## Project Idea:

  This project is a simple educational application that demonstrates how four basic CPU scheduling algorithms work in operating systems.
  The entire project is developed in Java, including a Java-based graphical user interface (GUI) for easier interaction and clear visualization of the results.

## Algorithms Covered:-

  1. First-Come, First-Served (FCFS)
  Processes run in the order they arrive.
  Easy to understand and implement — ideal for simple batch systems.
  However, it is less efficient for mixed workloads, as short tasks may be delayed by longer ones.
  
  2. Shortest Job First (SJF)
  Always selects the process with the shortest execution time.
  This reduces average waiting time and improves throughput when task lengths are known.
  It is not practical if burst times are unpredictable.
  
  3. Round Robin (RR)
  Each process gets a fixed, equal time slot and runs in cycles.
  This ensures fairness and is suitable for time-sharing systems with multiple users or tasks.
  It requires a well-chosen time quantum; if too small, it can cause excessive context switching and lower performance.
  
  4. Priority Scheduling
  Processes run based on assigned priority, so higher-priority tasks execute first.
  This is useful when tasks have different levels of urgency or importance.
  It may cause starvation for low-priority tasks, but this can be solved using aging.

## Goals:

  The main goal of this project is to provide a practical, hands-on tool for understanding how different CPU scheduling algorithms work by:
  
  Learning the differences between scheduling algorithms.
  
  Observing how they affect performance and behavior in real scenarios.
  
  Understanding when and why each algorithm is used in practice.

## Features:

  This Java project includes a simple graphical user interface (GUI) that allows you to:
  
  Enter process data easily.
  
  Visualize the scheduling step by step.
  
  Compare the results of all algorithms on the same screen.

