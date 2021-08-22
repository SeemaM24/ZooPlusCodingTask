import java.util.*;

public class PetMaster {
	
	public static int PetIds[] = new int[3];
	public static String PetNames[] = new String[3];
	public static String PetStatus[] = new String[3];
	
	public void PetData()
	{
	
		PetIds[0]= 1;
		PetIds[1]= 2;
		PetIds[2]= 3;
		
		PetNames[0]= "Tom";
		PetNames[1]= "Jerry";
		PetNames[2]= "Spike";
		
		PetStatus[0]= "Available";
		PetStatus[1]= "Pending";
		PetStatus[2]= "Sold";	
		
	System.out.println("Test");
	}

	// This Method Find/Get Pet's name by Pet Id
	public static String GetPetbyID(int id)
	{
		int y = 0;	
		for(int i = 0; i< 3; i++){

			if (PetIds[i]== id)
				y = i;
			}
		return PetNames[y];
	}
	
	// This Method Find/Get Pet's name by Pet Status
	public static String GetPetbyStatus(String st)
	{
		int x =0;
		System.out.println(st);
		for(int i = 0; i< 3; i++){
			
			if (PetStatus[i]== st)
			{
				x = i;
		
			}
			}
		return PetNames[x];
	}
	
	// This Method Deletes Pet for a Pet ID
	public static String DeletePet(int delid)
	{
		String DelResult = "Pet Deleted";
		
		for(int i = 0; i< 3; i++){

			if (PetIds[i]== delid)
				{
				PetIds[i] = 0;
				PetNames[i]= " ";
				PetStatus[i] = " ";
				//return DelResult;
				}
			}
		return DelResult;
	}
	public static void main(String[] args)
	{
		System.out.println("In Main");
		PetMaster PM = new PetMaster();
		PM.PetData();	
		
		String PetNameFound;
		//The below code calls GetPetbyID Method
		PetNameFound = GetPetbyID(1);
		System.out.println(PetNameFound);
		//The below code calls GetPetbyStatus Method
		PetNameFound = GetPetbyStatus("Pending");
		System.out.println(PetNameFound);
		
		String DelMsg;
		//The below code calls DeletePet Method
		DelMsg = DeletePet(1);
		System.out.println(DelMsg);
		System.out.println(PetIds[0]);
		System.out.println(PetNames[0]);
		
	}


}