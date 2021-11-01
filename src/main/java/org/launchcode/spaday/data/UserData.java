package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.*;

public class UserData {
    private static Map<Integer,User> users = new HashMap<>();

    public static User getById(int id)
    {
        return users.get(id);
    }

    public static List<User> getAll()
    {
        return new ArrayList<>(users.values());
    }

    public static void add(User user)
    {
        users.put(user.getId(),user);
    }


}

