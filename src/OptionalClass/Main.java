package OptionalClass;

import java.util.Optional;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		Optional<User> optionalUser = userService.getUserById(4);
		
//		if(optionalUser.isPresent()) {
//			User user = optionalUser.get();
//			System.out.println("Name: " + user.getName() + " Id: " + user.getId());
//		}
		
//		optionalUser.ifPresent(user -> System.out.println("Name: " + user.getName() + " Id: " + user.getId()));
		
//		User user = optionalUser.orElseGet(() -> new User(-1, "Default User"));
//		System.out.println("Name: " + user.getName() + " Id: " + user.getId());
//		if(user!=null) {
//		System.out.println("Name: " + user.getName() + " Id: " + user.getId());
//		}
           
		User user = null;
		
//		Optional.of(user);
		Optional.ofNullable(user);
	}

}
