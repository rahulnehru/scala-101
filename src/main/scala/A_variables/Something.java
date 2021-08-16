package A_variables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Something {

    public static class ServiceSaveException extends Exception{}

    public static class Service {
        public Service() { }

        public void saveToServer(String text) throws ServiceSaveException {

        }
    }

    public void readFromFileAndCallService(String filename) throws FileNotFoundException, ServiceSaveException {
            try {
                File file = new File(filename);
                FileReader fr = new FileReader(file);
                Scanner sc = new Scanner(fr);
                StringBuilder sb = new StringBuilder();
                while(sc.hasNext()) {
                    sb.append(sc.next());
                }
                Service svc = new Service();
                svc.saveToServer(sb.toString());
            } catch (FileNotFoundException e) {
                System.out.println("File could not be found");
                throw e;
            } catch (ServiceSaveException e) {
                System.out.println("Could not save to server");
                throw e;
            } catch (Exception e) {
                System.out.println("Some other error was thrown");
                throw e;
            }
    }

}
