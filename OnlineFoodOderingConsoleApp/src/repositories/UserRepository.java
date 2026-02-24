package repositories;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    private UserRepository() {
        users = new ArrayList<>();
    }

    private static class RepoContainer {
        static UserRepository obj = new UserRepository();
    }

    public static UserRepository getUserRepoInstance(){
        return RepoContainer.obj;
    }

    public List<User> getUsers() {
        return users;
    }
}
