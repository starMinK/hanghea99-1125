package hello.hellospring.domain;

import java.util.Objects;

public class Bus {
    int maxPassenger;
    int nowPassenger;
    int price;
    int busNumber = 0;
    static int num = 0; //static이 붙으면 해당 변수는 초기화가 안됨
    int oilValue;
    int nowSpeed;
    String run;

    public Bus() {
        this.busNumber = num;
        num += 1;
        this.maxPassenger = 30;
        this.nowPassenger = 0;
        this.price = 1000;
        this.run = "운행 중";
        this.oilValue = 100;
        this.nowSpeed = 0;
    }

    //버스 상태 변경
    public String state(int oilValue) {
        if (oilValue < 10) {
            this.run = "차고지행";
            return "주유가 필요합니다.";
        } else {
            this.run = "운행 중";
        }
        return "현재 주유값: " + oilValue + " / 운행 상태: " + run;
    }

    //승객 탑승
    public String addPassenger(int newPassenger) {
        if (this.nowPassenger + newPassenger < this.maxPassenger && Objects.equals(this.run, "운행 중")) {
            nowPassenger+=newPassenger;
            return "탑승 승객 수: " + nowPassenger + " / " + this.maxPassenger;
        } else {
            return "탑승 가능한 자리가 없어 더이상 탑을 하실 수 없습니다.";

        }
    }

    public String changeSpeed(int speed) {
        if (this.oilValue < 10) {
            return "경고: 주유량을 확인해주세요.";
        } else {
            this.nowSpeed += speed;
            return "변경된 속도: " + this.nowSpeed + "현재 주유 량 :" + this.oilValue;
        }
    }

}
