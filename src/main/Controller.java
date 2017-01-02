package main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    private AddressList addressList;
    @FXML private Button checkEmpty;
    @FXML private Button addToFront;
    @FXML private Button addToBack;
    @FXML private Button inOrder;
    @FXML private Button reversedOrder;
    @FXML private Button reverse;
    @FXML private Button getSizeBtn;
    @FXML private Button findPhoneNumByName;
    @FXML private Button findEmailByName;
    @FXML private Button findNameByPhoneNumber;
    @FXML private Button findDobByName;
    @FXML private TextField findPhoneNumByNameField;
    @FXML private TextField findEmailByNameField;
    @FXML private TextField findNameByPhoneNumberField;
    @FXML private TextField findDobByNameField;
    @FXML private TextField checkStatField;
    @FXML private TextField nameField;
    @FXML private TextField teleField;
    @FXML private TextField emailField;
    @FXML private TextField addressField;
    @FXML private TextField dobField;
    @FXML private TextField getSizeField;
    @FXML private TextArea  mainAreaOutput;

    public Controller() {
        addressList = new AddressList();
    }

    @FXML
    public void checkAddressBookStatus() {
        if (addressList.isEmpty()) {
            checkStatField.setText("Empty");
        } else {
            checkStatField.setText("Not Empty");
        }
    }

    @FXML
    public void addAddressToFront() {
        addressList.addToFront(nameField.getText(), teleField.getText(), emailField.getText(), addressField.getText(),
                dobField.getText());
        nameField.clear();
        teleField.clear();
        emailField.clear();
        addressField.clear();
        dobField.clear();
    }

    @FXML
    public void addAddressToBack() {
        addressList.addToBack(nameField.getText(), teleField.getText(), emailField.getText(), addressField.getText(),
                dobField.getText());
        nameField.clear();
        teleField.clear();
        emailField.clear();
        addressField.clear();
        dobField.clear();
    }

    @FXML
    public void printAdressBookInOrder() {
        if (!(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.toString());
        } else {
            mainAreaOutput.setText("Address Book is empty");
        }
    }

    @FXML
    public void printAdressBookInReverse() {
        if (!(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.reverseToString());
        } else {
            mainAreaOutput.setText("Address Book is empty");
        }
    }

    @FXML
    public void reverseAddressBook() {
        if (!(addressList.isEmpty())) {
            addressList.reverse();
        }
    }

    @FXML
    public void getAddressBookSize() {
        if (!(addressList.isEmpty())) {
            getSizeField.setText(String.valueOf(addressList.sizeOf()));
        } else {
            getSizeField.setText("0");
        }
    }

    @FXML
    public void searchPhoneNumByName() {
        if (!(findPhoneNumByNameField.getText().equals("")) && !(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.phoneNumberByName(findPhoneNumByNameField.getText()));
        }
    }

    @FXML
    public void searchEmailByName() {
        if (!(findEmailByNameField.getText().equals("")) && !(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.emailByName(findEmailByNameField.getText()));
        }
    }

    @FXML
    public void searchNameByPhoneNumber() {
        if (!(findNameByPhoneNumberField.getText().equals("")) && !(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.nameByPhoneNumber(findNameByPhoneNumberField.getText()));
        }
    }

    @FXML
    public void searchDobByName() {
        if (!(findDobByNameField.getText().equals("")) && !(addressList.isEmpty())) {
            mainAreaOutput.setText(addressList.dobByName(findDobByNameField.getText()));
        }
    }
}
