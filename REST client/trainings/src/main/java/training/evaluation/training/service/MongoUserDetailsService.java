/*
package training.evaluation.training.service;

import training.evaluation.training.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import training.evaluation.training.repository.UserRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class MongoUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users Users= repository.findByUsername(username);
        if(Users== null) {
            throw new UsernameNotFoundException("Usersnot found");
        }
        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
        System.out.println(user.getUsername() + "    pas:" +  user.getPassword());
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
*/
