package cpu_scheduling;

public class Process {

    private String processID;
    private int burstTime;// CPU Time
    private int priority;
    private int waitingTime;
    private int turnaroundTime;
    private int remainingTime;
    private int quantemTime;

    public Process(String processID, int burstTime) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = 0;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public Process(String processID, int burstTime, int quantemTime, boolean c) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.quantemTime = quantemTime;
        this.priority = 0;
        this.waitingTime = 0;
        this.turnaroundTime = 0;

    }

    public Process(String processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    public String getProcessID() {
        return processID;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public int getquantemTime() {
        return quantemTime;
    }

    public void setquantemTime(int quantemTime) {
        this.quantemTime = quantemTime;
    }

}
