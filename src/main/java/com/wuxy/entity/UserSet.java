package com.wuxy.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wuxy
 * @create: 2019-04-22 15:22
 **/
public class UserSet {
    private Set<User> userSet = new HashSet<>();

    public UserSet() {
        userSet.add(new User());
        userSet.add(new User());
        userSet.add(new User());
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
