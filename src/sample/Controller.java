package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    int number;
    String operator;
    int r = 0;
    int p = 0;

    @FXML
    private Pane MainPanel;

    @FXML
    private TextArea ResultArea;

    @FXML
    private Button Btn7;

    @FXML
    private Button Btn8;

    @FXML
    private Button Btn9;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn6;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Button Btn3;

    @FXML
    private Button Btn0;

    @FXML
    private Button BtnPlus;

    @FXML
    private Button BtnMinus;

    @FXML
    private Button BtnMult;

    @FXML
    private Button BtnDev;

    @FXML
    private Button BtnEqual;
    @FXML
    public void one()throws IOException {
        number = 1;
        ResultArea.setText(ResultArea.getText()+"1");
    }
    @FXML
    public void two()throws IOException {
        number = 2;
        ResultArea.setText(ResultArea.getText()+"2");
    }
    @FXML
    public void three()throws IOException {
        number = 3;
        ResultArea.setText(ResultArea.getText()+"3");
    }
    @FXML
    public void four()throws IOException {
        number = 4;
        ResultArea.setText(ResultArea.getText()+"4");
    }
    @FXML
    public void five()throws IOException {
        number = 5;
        ResultArea.setText(ResultArea.getText()+"5");
    }
    @FXML
    public void six()throws IOException {
        number = 6;
        ResultArea.setText(ResultArea.getText()+"6");
    }@FXML
    public void seven()throws IOException {
        number = 7;
        ResultArea.setText(ResultArea.getText()+"7");
    }@FXML
    public void eight()throws IOException {
        number = 8;
        ResultArea.setText(ResultArea.getText()+"8");
    }@FXML
    public void nine()throws IOException {
        number = 9;
        ResultArea.setText(ResultArea.getText()+"9");
    }
    @FXML
    public void equal()throws IOException {
        if(operator == "+"){
            r = p + Integer.parseInt(ResultArea.getText());
        }
        String res = "" + r;
        ResultArea.setText(res);
    }

    @FXML
    public void plus()throws IOException {
        p = Integer.parseInt(ResultArea.getText());
        operator = "+";
        ResultArea.setText("");
    }
    @FXML
    public void minus()throws IOException {
        number = 0;
        ResultArea.setText(ResultArea.getText()+"-");
    }
    @FXML
    public void mult()throws IOException {
        number = 0;
        ResultArea.setText(ResultArea.getText()+"*");
    }
    @FXML
    public void dev()throws IOException {
        ResultArea.setText(ResultArea.getText()+"/");
    }
    @FXML
    public void zero()throws IOException {
        number = 0;
        ResultArea.setText(ResultArea.getText()+"0");
    }
}
