package qqq;

public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return; // 현재 메소드 종료
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() { // 타입이 boolean일 때만 is(getter일 때)
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
