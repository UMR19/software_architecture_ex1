package example;

import com.TaxCaculateService;
import com.TaxCaculateServiceService;
import com.TaxCaculateServiceServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class TaxCaculatorClient {
    public static void main(String[] argv) {
        try {
            TaxCaculateService service = new TaxCaculateServiceServiceLocator().getTaxCaculateServicePort();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入工资：");
            float income = scanner.nextFloat();
            float result = service.tax(income);
            System.out.println("须交税" + result);
        } catch (ServiceException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
