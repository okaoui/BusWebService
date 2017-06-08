package com.developeinjava.jaxws;

import com.developeinjava.types.Context;
import com.developeinjava.types.RequestDataGetBusInfo;
import com.developeinjava.types.ResponseDataGetBusInfo;

import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;
import javax.jws.*;

@SuppressWarnings("restriction")
@WebService(name="BusService", targetNamespace="urn:v1.busservice.developeinjava.com")
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface BusService {

	@WebMethod(operationName="GetBusInfo", action="GetBusInfo")
    @WebResult(name = "ResponseDataGetBusInfo", targetNamespace = "urn:v1.busservice.developeinjava.com", partName = "GetBusInfoResponseMessagePart")
	public ResponseDataGetBusInfo getBusInfo(@WebParam(name="RequestDataGetBusInfo", targetNamespace = "urn:v1.busservice.developeinjava.com", partName = "GetBusInfoRequestMessagePart") 
												RequestDataGetBusInfo request, @WebParam(name = "Context", targetNamespace = "urn:v1.context.developeinjava.objects.com", header = true, partName = "Context")
												Context context);
		
	
}
