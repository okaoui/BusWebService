package com.developeinjava.jaxws;

import com.developeinjava.models.Bus;
import com.developeinjava.models.Stop;
import com.developeinjava.types.Context;
import com.developeinjava.types.RequestDataGetBusInfo;
import com.developeinjava.types.ResponseDataGetBusInfo;

import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;
import javax.jws.*;

/**
 * 
 * @author oussamakaoui
 *
 */
@SuppressWarnings("restriction")
@WebService(endpointInterface="com.developeinjava.jaxws.BusService")
public class BusServiceImpl implements BusService{

	public ResponseDataGetBusInfo getBusInfo(RequestDataGetBusInfo request,
			Context context) {
		Bus bus = new Bus();
		Stop current = new Stop();
		Stop next = new Stop();
		
		current.setCityCd("AB12");
		current.setStopId(1);
		current.setStreetCd("HW01");
		
		next.setCityCd("AB12");
		next.setStopId(2);
		next.setStreetCd("HW02");
		
		bus.setCurrent(current);
		bus.setNext(next);
		bus.setBusNumber(request.getBusNumber());
		
		ResponseDataGetBusInfo response = new ResponseDataGetBusInfo();
		response.setBus(bus);
		return response;
	}

}
