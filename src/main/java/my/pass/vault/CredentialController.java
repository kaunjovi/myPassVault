package my.pass.vault;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredentialController {

	@RequestMapping("/credential")
	public Credential dummyMethodForTesting(){
		
		Credential dummyCredential = new Credential() ; 
		dummyCredential.setName("Google");
		dummyCredential.setPath("http://www.google.com");
		dummyCredential.setUserName("kaunjovi");
		dummyCredential.setPassword("goodtry");
		
		return dummyCredential ; 
		
	}
}
