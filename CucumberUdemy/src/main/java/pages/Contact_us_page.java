package pages;

import static locators.Contact_us_locators.*;;


public class Contact_us_page extends Main_page{

    public void access_contact_url(){
        accessURL(URL_CONTACT_US);
    }

    public void enter_first_name(){
        write_field(FIRST_NAME, "aitor");
    }

    public void enter_last_name(){
        write_field(LAST_NAME, "Novoa Alonso");
    }

    public void enter_email(){
        write_field(EMAIL, "aitor@aitor.com");
    }

    public void enter_comments(){
        write_field(COMMENTS, "This is my message.");
    }

    public void click_button_submit(){
        click_button(SUBMIT_BUTTON);
    }

    public void click_button_reset(){
        click_button(RESET_BUTTON);
    }
}
