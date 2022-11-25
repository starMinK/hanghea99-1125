package hello.hellospring.domain;

import java.util.Objects;

public class Taxi {
    int maxPassenger;
    int num;
    int taxiNum;
    int oil;
    int speed;
    int destination;//목적지
    int basicDistanse; //기본 거리
    int addDistanceFee; //목적지까지 거리
    int basicFee; //기본 요금
    int distanseFee; //거리당 요금
    int totalPrice;
    String run; //상태

    public Taxi(){
        this.taxiNum = num;
        num++;
        this.maxPassenger = 4;
        this.basicFee = 3000;
        this.distanseFee = 1000;
        this.basicDistanse = 1;
        this.oil = 100;
        this.run = "일반";
        this.speed = 0;
    }

    public String startDrive() {
        return (this.oil >= 10) ? "운행을 시작합니다." : "기름이 부족합니다. 현재 주유량: " + this.oil;
    }

    public String inTaxi(int person) {
        if(person <= maxPassenger && Objects.equals(this.run, "일반")) {
            this.run = "운행 중";
            return "택시를 탑승하셨습니다.";
        }else {
            return "탑승 불가. 현재 운행중이거나 최대 탑승 가능 인원 수 보다 탑승할려는 인원 수가 더 많습니다.";
        }
    }

    public String speed(int speed){
        return "현재 속도는: " + (this.speed + speed) + "입니다.";
    }

    public String addPrice(int distanse){
        if(distanse > this.basicDistanse) {
            this.totalPrice = this.basicDistanse + (distanse - this.basicFee) * 100;
            return "추가요금: " + (distanse - this.basicDistanse) * 100;
        }else{
            return "추가요금이 없습니다.";
        }
    }

    public String totalPrice() {
        return "총 금액은 " + this.totalPrice + "원 입니다.";
    }
}