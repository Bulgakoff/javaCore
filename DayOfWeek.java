package GBmainEgit.javaCore.git;

public enum DayOfWeek {
    Monday("Понедельник",40/1), Tuesday("Вторник",40/2),
    Wednesday("Среда ",40/3), Thursday("Четверг",40/4),
    Friday("Пятница",40/5), Saturday("Суббота",40/6);

    private String trans;
    private int timeLeft;

    DayOfWeek(String trans, int timeLeft) {// private по умолчанию у конструктора DayOfWeek
        this.trans = trans;
        this.timeLeft=timeLeft;
    }

    public String getTrans() {
        return trans;
    }

    public int getTimeLeft() {
        return timeLeft;
    }
}
