package com.example.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicex implements UserDetailsService {
	private final UserRepository userRepository;

	  public UserDetailsServicex(UserRepository userRepository) {
	    this.userRepository = userRepository;
	  }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username)
		        //.map(user -> new UserDetailsx(user))
				.map(UserDetailsx::new)
		        .orElseThrow(
		            () -> new UsernameNotFoundException("User Not Found with username: " + username));
	}

}
