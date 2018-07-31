package training.evaluation.training.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import training.evaluation.training.model.Users;
import training.evaluation.training.service.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
@Api(description = "Resource to expose all available user endpoints", tags = {"UserResource"})
public class UserResource {

    @Autowired
    IUserServices services;

    @PostMapping("/sign-up")
    @ApiOperation(value = "New user registration", notes = "The user must contain username, password, firstname and lastname fields. ")
    public User signUp(@ApiParam(value = "User in JSON format. Username, password, firstname and lastname  are required fields, ID is autogenerated.", required = true) @RequestBody User user) {
        return userServices.register(user);
    }

    @GetMapping("/allusers")
    @ApiOperation(value = "Get all registered users", notes = "Return list of registered users. User must be previously logged in (Baerer Authorization with JWT token needed). ")
    public List<User> getAll() {
        return userServices.getAllUsers();
    }

    @GetMapping("/byUsername/{username}")
    @ApiOperation(value = "Find user by username", notes = "Find user by username. Return registered user with searched name. User must be previously logged in (Baerer Authorization with JWT token needed).")
    public User getByUsername(@ApiParam(value = "Username of the user that we search for as a path variable.", required = true) @PathVariable String username) {
        return userServices.getByUsername(username);
    }
    
}