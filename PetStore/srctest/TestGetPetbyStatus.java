import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

public class TestGetPetbyStatus {
	
	@Test
	public void TestFindPetByStatusVALID() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyStatus("Sold");
		String ExpectedPetName = "Spike";
		assertEquals(ExpectedPetName,ActualPetName);
		
	}
	
	@Test
	public void TestFindPetByStatusINVALID() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyStatus("Open");
		System.out.println(ActualPetName);
		
		String ExpectedPetName = "Tom";
		assertEquals(ExpectedPetName,ActualPetName);
		fail("The expected result is not matching the actual result.");
	}
	
	@Test
	public void TestFindPetByStatusINVALIDinput() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		int ActualPetName = PM.GetPetbyStatus(12345);
		String ExpectedPetName = "Spike";
		assertEquals(ExpectedPetName,ActualPetName);
				
	}

}
