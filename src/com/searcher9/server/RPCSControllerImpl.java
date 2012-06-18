package com.searcher9.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searcher9.client.rpcs.RPCSCommunicator;
import com.searcher9.shared.User;

public class RPCSControllerImpl extends RemoteServiceServlet implements
		RPCSCommunicator {

	@Override
	public User registerNewUser(String email, String firstName,
			String lastName, String password) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail("andrew.uglev@gmail.com");
		user.setFirstName("Andrew");
		user.setLastName("Uglev");
		user.setSessionID("12323");
		user.setToken("12312321");
		user.setUid("9");

		return user;
	}

}
