import java.util.Random;


public class Die {
    private int faceValue;
    Random random = new Random(); //การสุ่มทอยลูกเต๋า

    public void roll(){
        faceValue = random.nextInt(6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
