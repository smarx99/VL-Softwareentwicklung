package HW4.hw4_ex2;

public class View implements Observer{
    private Model model;
    private int num;

    public View(Model model, int num) {
        this.model = model;
        this.num = num;
        model.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("View " + num + ": " + model.getNumData());
    }
}
