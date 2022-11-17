package demo;

import com.TaxCaculate;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class TaxCaculateService {
    @WebMethod
    public float tax(float income) {
        TaxCaculate caculate = new TaxCaculate();
        return caculate.Caculate(income);
    }
    public static void main(String[] argv) {
        Object taxImp = new TaxCaculateService();
        String address = "http://localhost:8080/TaxCaculateService";
        Endpoint.publish(address, taxImp);
        System.out.println("WebService服务器启动成功");
    }
}
