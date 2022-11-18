package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.web.dto.UserRegistrationDto;

/**
 * The interface User service.
 */
public interface UserService extends UserDetailsService{
	/**
	 * Save user.
	 *
	 * @param registrationDto the registration dto
	 * @return the user
	 */
	User save(UserRegistrationDto registrationDto);
}
