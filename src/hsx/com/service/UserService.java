//Âß¼­²ã
package hsx.com.service;

import hsx.com.model.User;

public class UserService {

	public boolean login(User user){
		if ("hsx".equals(user.getUserName())&&"ak".equals(user.getPassword())) {
			return true;	
		}else {
			return false;
		}
	}
}
