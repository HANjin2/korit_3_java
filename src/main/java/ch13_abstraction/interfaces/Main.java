package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton(), new ChannelDownButton(),  new ChannelUpButton());
//        TvRemoteController tvRemoteController = new TvRemoteController();
        // 클래스명 객체명 = new 생성자();
        tvRemoteController.onPreesedPowerButton();
        tvRemoteController.onPreesedPowerButton();
        tvRemoteController.onPreesedPowerButton();
    }
}
