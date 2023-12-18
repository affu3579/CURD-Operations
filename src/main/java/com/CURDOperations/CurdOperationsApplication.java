package com.CURDOperations;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.CURDOperations.Entity.PassportEntity;
import com.CURDOperations.Repo.PassportRepo;

@SpringBootApplication
public class CurdOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CurdOperationsApplication.class, args);
		PassportRepo Repo=context.getBean(PassportRepo.class);
		// insert
		PassportEntity passData=new PassportEntity();
		passData.setName("Sai");
		passData.setArea("HYD");
		
		PassportEntity pass1=new PassportEntity();
		pass1.setName("Duryo");
		pass1.setArea("HYD");
		
		Iterable<PassportEntity> user=List.of(pass1,passData);
        Repo.saveAll(user);
        
        //fetch specific data
       Optional<PassportEntity> print= Repo.findById(302);
       System.out.println("Print specific  :"+print);
       
       //fetch all data
       Iterable<PassportEntity> fetch=Repo.findAll();
       fetch.forEach(users->{System.out.println(users);});
       
       // update
       Optional<PassportEntity> update=Repo.findById(302);
       PassportEntity unique=update.get();
       unique.setName("Mohammad Afroz");
       Repo.save(unique);
     //fetch all data
       Iterable<PassportEntity> fetch1=Repo.findAll();
       fetch1.forEach(users->{System.out.println("fetch after update  :"+users);});
       
	//delete specific
       Repo.deleteById(302);
		
     //fetch all data
       Iterable<PassportEntity> fetch2=Repo.findAll();
       fetch2.forEach(users->{System.out.println("fetch after Delete  :"+users);});
		
       //delete all
       Iterable<PassportEntity> deleteAll=Repo.findAll();
       Repo.deleteAll(deleteAll);
       
       //fetch all data
       Iterable<PassportEntity> fetch3=Repo.findAll();
       fetch3.forEach(users->{System.out.println("fetch after Delete all  :"+users);});
		}

}
