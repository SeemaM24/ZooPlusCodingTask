import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

public class TestGetPetbyStatus {


	@Test
	public void test1() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyStatus("Sold");
		System.out.println(ActualPetName);
		String ExpectedPetName = "Spike";
		assertEquals(ExpectedPetName,ActualPetName);
		
	}
	
	@Test
	public void test2() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyStatus("Available");
		System.out.println(ActualPetName);
		String ExpectedPetName = "Tom";
		assertEquals(ExpectedPetName,ActualPetName);
		
	}
	
	@Test
	public void test3() {
		
		PetMaster PM = new PetMaster();
		PM.PetData();
		
		String ActualPetName = PM.GetPetbyStatus("Pending");
		System.out.println(ActualPetName);
		String ExpectedPetName = "Spike";
		assertEquals(ExpectedPetName,ActualPetName);
		
	}

}
