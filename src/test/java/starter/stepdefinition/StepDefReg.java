package starter.stepdefinition;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import static starter.step.Register.RegisS3;


public class StepDefReg {

    @Steps
    Register register;

    @Given ("I input my name is {string} and email is {string} and password is {string}")
    public void data(String name, String email, String password)
    { RegisS3 (name,email,password);}

        }
