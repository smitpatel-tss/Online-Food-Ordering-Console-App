package model;

import repositories.UserRepository;

import java.util.Random;

public class UserFactory {
    static Random random=new Random();

    public User getUser(String name,int choice){
        if(choice==1){
            return new Admin(getUniqueId(),name);
        }
        if(choice==2){
            return new DeliveryPartner(getUniqueId(),name);
        }
        if(choice==3){
            return new Customer(getUniqueId(),name);
        }
        return null;
    }

    public long getUniqueId(){
        UserRepository userRepo=UserRepository.getUserRepoInstance();
        long newNumber;
        boolean flag;
        do {
            newNumber = random.nextLong(1_000_000_000L, 10_000_000_000L);
            flag = false;

            for (User user:userRepo.getUsers()) {
                if (user.getId() == newNumber) {
                    flag = true;
                    break;
                }
            }
        } while (flag);

        return newNumber;
    }
}
