package eat;

public class NormalDiet implements EatBehaviour{
    @Override
    public void eat() {
        System.out.println("This is a normal diet");
    }
}
