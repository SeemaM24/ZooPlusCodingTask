import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGetPetByIdValidation {


	@Test
	public void TestFindPetByIdVALID() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyID(1);
		String ExpectedPetName = "Tom";
		assertEquals(ExpectedPetName,ActualPetName);
		
	}

	
}
