
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implicit casting
		byte byteVar = 42;
		short shortVar = byteVar;
		int intVar = shortVar;
		long longVar = intVar;
		float floatVar = longVar;
		double doubleVar = floatVar;
		
		//Explicit casting
		double doubleVar1 = 42.0d;
		float floatVar1 = (float) doubleVar1;
		long longVar1 = (long) floatVar1;
		int intVar1 = (int) longVar1;
		short shortVar1 = (short) intVar1;
		byte byteVar1 = (byte) shortVar1;
		
		// Basic Numeric Promotion
		char char1 = 1, char2 = 2;
		short short1 = 1, short2 = 2;
		int int1 = 1, int2 = 2;
		float float1 = 1.0f, float2 = 2.0f;
		
		// char1 = char1 + char2; // Error: Cannot convert from int to char
		// short1 = short1 + short2; // Error: Cannot convert from int to short
	 	
		int1 = char1 + char2; 	  // char is promoted to int
		int1 = short1 + short2;   // short is promoted to int
		int1 = char1 + short2;    // both char and short is promoted to int
		float1 = short1 + float2; // short is promoted to float
		int1 = int1 + int2;		  // int is unchanged
		
		//int badInt = (int) true; //error
		char char3 = (char) 65;  	// A
		byte byte3 = (byte) 'A'; 	// 65
		short short3 = (short) 'A'; // 65
		int int3 = (int) 'A'; 		// 65
		
	}

}
