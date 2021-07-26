import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
public class LoginController {

    @FXML
    private TextField user;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    void login(ActionEvent event) {
        String u = user.getText();
        String p = password.getText();
        System.out.println("User: "+ u);
        System.out.println("Password: "+p);
    }

}

