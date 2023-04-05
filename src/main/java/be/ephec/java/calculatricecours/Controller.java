package be.ephec.java.calculatricecours;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text output;

    private Model model = new Model();

    private long number1 = 0;
    private String operator = "";
    private boolean newOperation = true;

    @FXML
    private void processNumber(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        System.out.println("Numero " + value);

        if (newOperation) {
            output.setText("0");
            newOperation = false;
        }
        if (output.getText().equals("0"))
            output.setText(value);
        else
            output.setText(output.getText() + value);
    }

    @FXML
    private void processOperator(ActionEvent event) {
        String op = ((Button)event.getSource()).getText();
        System.out.println("Operator " + op);
        if ("=".equals(op)) {
            if (! "".equals(this.operator)) {
                long number2 = Long.parseLong(this.output.getText());
                long res = this.model.compute(this.number1, this.operator, number2);
                this.output.setText("" + res);
                this.operator = "";
                this.newOperation = true;
            }
        } else {
            if ("".equals(this.operator)) {
                this.operator = op;
                this.number1 = Long.parseLong(this.output.getText());
                this.output.setText("0");
            }
        }
    }
}