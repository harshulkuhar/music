package com.music.service;

import com.music.model.User;
import java.util.*;

public interface UserService {

    public String addUserByAdmin(User user);

    public List<User> getAllUsers();
}
