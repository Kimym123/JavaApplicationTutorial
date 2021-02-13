package se.hs.ac;

import org.springframework.beans.factory.annotation.Autowired;
import se.hs.ac.controller.ApiController;
import se.hs.ac.veiw.ApiView;

public class program {
    private static ApiView view;

    public static void main(String[] args) {
        view.showMenu();
    }
}
