package com.cndatacom.campus.netcore.Requests;

import KO.utils.Constants;

public class Ticket extends Request {

	// Optional -> host-name gwip sysinfo ipv6 mac
	@Override
	public String doAction() {
		return HEAD + "<request><user-agent>" + Constants.getUseragent() + "</user-agent><client-id>"
				+ Constants.getCurrentClientID().toString() + "</client-id><local-time>" + getTime() + "</local-time><ipv4>"
				+ Constants.getIPV4() + "</ipv4><gwip>" + Constants.getGateWayIP() + "</gwip><mac>" + getMacAddrWithFormat(":")
				+ "</mac><ipv6></ipv6><sysinfo><sysname>Linux</sysname><ifname>eth0," + Constants.getIPV4()
				+ "</ifname></sysinfo><host-name>Vivo</host-name></request>";
	}

}
