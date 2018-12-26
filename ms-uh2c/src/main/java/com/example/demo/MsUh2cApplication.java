package com.example.demo;

import java.util.Date;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class MsUh2cApplication implements CommandLineRunner{

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	
	public static void main(String[] args) {
		SpringApplication.run(MsUh2cApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(1+3);
		System.out.println("Hello world");
		
		
		repositoryRestConfiguration.exposeIdsFor(Formation.class,Etudiant.class);
		Formation f1=formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2=formationRepository.save(new Formation(null,"JAVA",40,null));
		Formation f3=formationRepository.save(new Formation(null,"C++",21,null));
		Formation f4=formationRepository.save(new Formation(null,"DevOps",32,null));

		etudiantRepository.save(new Etudiant(null,"Sara","Batal",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Wissal","Batal",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Amine","Hanaf",new Date(),f3));
		etudiantRepository.save(new Etudiant(null,"Nabila","Ayoub",new Date(),f4));
		
	}
	
}

