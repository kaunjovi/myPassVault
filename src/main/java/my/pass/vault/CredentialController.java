package my.pass.vault;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredentialController {

	@RequestMapping("/credential")
	public ArrayList<Credential> dummyMethodForTesting(){
		
		ArrayList<Credential> credentialCollection = new ArrayList<Credential>() ; 
		
		Credential dummyCredential = new Credential() ; 
		dummyCredential.setName("Google");
		dummyCredential.setPath("http://www.google.com");
		dummyCredential.setUserName("kaunjovi");
		dummyCredential.setPassword("goodtry");
		credentialCollection.add(dummyCredential) ; 

		Credential dummyCredential1 = new Credential() ; 
		dummyCredential1.setName("Google1");
		dummyCredential1.setPath("http://www.google.com1");
		dummyCredential1.setUserName("kaunjovi1");
		dummyCredential1.setPassword("goodtry1");
		credentialCollection.add(dummyCredential1) ; 
		
		return credentialCollection ; 
		
	}
}
