package appb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService(serviceName = "ServiceBService", portName = "ServiceBPort", endpointInterface = "appb.IServiceB", targetNamespace = "http://appb/ServiceB")
public class ServiceB implements IServiceB {

	@Override
	public int minus(int left, int right) {
		return left-right;
	}

}
