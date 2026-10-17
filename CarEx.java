package qqq;

public class CarEx {
    static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(-50);
        System.out.println("현재 속도 : " + car.getSpeed());

        car.setSpeed(60);
        if (!car.isStop()) { // 기본이 false라 논리 부정 ! 사용
            car.setStop(true);
        }
        System.out.println("현재 속도 : " + car.getSpeed());
    }
}
