package qa.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import qa.project.models.Attachment;
import qa.project.repository.AttachmentRepository;

@SpringBootApplication
public class MyProject {

	public static void main(String[] args) {
    SpringApplication.run(MyProject.class, args);
	}

	@Autowired AttachmentRepository attachmentRepo;
	
	
	  public void run(String...args) throws Exception {

	  attachmentRepo.save(new Attachment("Grenade Launcher", "Commando", "Silencer", "Bayonet"));
	  attachmentRepo.save(new Attachment("Red Dot Sight", "2x Scope", "4x Scope", "6x Scope")); 
	  attachmentRepo.save(new Attachment("20 Rnd Mag", "40 Rnd Mag", "60 Rnd Mag", "80 Rnd Mag")); 
	  attachmentRepo.save(new Attachment("Fast Grip", "Strong Grip", "Reflex Grip", "Hard Grip"));
	  }
	 
	
	
}
