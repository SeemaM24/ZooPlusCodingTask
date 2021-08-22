import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

public class TestDeletePetById {


	@Test
	public void TestDeletePetByIdVALID() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetIdDeleteMsg = PM.DeletePet(1);
		System.out.println(ActualPetIdDeleteMsg);
		
		String ExpectedPetIdDeleteMsg = "Pet Deleted";
		assertEquals(ExpectedPetIdDeleteMsg, ActualPetIdDeleteMsg);
		
	}
	
	@Test
	public void TestDeletePetByIdINVALID() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetIdDeleteMsg = PM.DeletePet(6);
		System.out.println(ActualPetIdDeleteMsg);
		
		String ExpectedPetIdDeleteMsg = "Pet Deleted";
		assertEquals(ExpectedPetIdDeleteMsg, ActualPetIdDeleteMsg);
		fail("The expected result is not matching the actual result.");
	}
	
	@Test
	public void TestDeletePetByIdINVALIDinput() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		int ActualPetId = PM.DeletePet("Tom");
		int ExpectedPetId = 0;
		assertEquals(ExpectedPetId,ActualPetId);
				
	}

}
