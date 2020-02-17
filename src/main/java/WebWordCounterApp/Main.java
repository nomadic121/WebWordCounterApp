package WebWordCounterApp;

import WebWordCounterApp.Exceptions.AppBaseException;

import java.io.IOException;

public class Main {

    private static App app = new App();

    public static void main(String[] args) {
        try {
            app.argsSet(args);
            app.downloadPage();
            app.parsePage();
        } catch (AppBaseException e) {
            System.out.println(e.getMessage());
            System.err.println(e);
//            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

}
