package HW4.hw4_ex2;

public class Controller {
    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void changeNumData(int numData) {
        model.setNumData(numData);
    }
}
