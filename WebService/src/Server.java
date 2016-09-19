import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Server {

	@WebMethod
	public double fahrenheitTocelsius(double value){
		double celsius = ((value - 32) * 5 ) / 9;
		return celsius;		
	}
}
