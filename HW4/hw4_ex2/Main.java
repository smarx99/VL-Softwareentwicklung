package HW4.hw4_ex2;

public class Main {
    public static void main(String[]args){

        // model with numData = 5
        Model model = new Model(5);

        // 3 Views for the model
        View view1 = new View(model, 1);
        View view2 = new View(model, 2);
        View view3 = new View(model, 3);

        // controller
        Controller controller = new Controller(model);

        // user interaction: change numData
        controller.changeNumData(7);
        controller.changeNumData(12);
    }
}
