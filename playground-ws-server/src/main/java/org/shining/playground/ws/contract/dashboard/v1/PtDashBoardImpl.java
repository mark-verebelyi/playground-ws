package org.shining.playground.ws.contract.dashboard.v1;

import org.shining.playground.ws.types.dashboard.v1.ServiceType;
import org.shining.playground.ws.types.dashboard.v1.StatusType;

public class PtDashBoardImpl implements PtDashBoard {

	@Override
	public StatusType opGetServiceStatus(final ServiceType body) {
		return StatusType.RUNNING;
	}

}
