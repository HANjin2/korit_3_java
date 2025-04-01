package ch13_abstraction.interfaces;

public class VolumeButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return super.onUp();
    }

    @Override
    public void onDown() {
        super.onDown();
    }
}
