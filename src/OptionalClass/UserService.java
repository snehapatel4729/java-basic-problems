package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {

	public Optional<User> getUserById(int id) {
		List<User> users = Arrays.asList(new User(1,"Sneha"), new User(2,"Jaimin"));
		
		for(User user : users) {
			if(user.getId() == id) {
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}
}
