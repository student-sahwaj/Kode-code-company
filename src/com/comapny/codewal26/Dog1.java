package com.comapny.codewal26;

//import java.nio.file.spi.FileSystemProvider;

public class  Dog1 extends Animal1 {
   void sound() {
//	   super();
	   System.out.println("voice is not good");
   }
   class Puppy extends Dog1{
	   void sound() {
		   System.out.println("good");
	   }
   }
   
}
