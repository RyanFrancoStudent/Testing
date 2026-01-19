/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;
/**
 *
 * @author ryanf
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //define and printe 3 strudents information 
        
        //this is pull remote
        Student[] list = new Student[3]; //peter 1 
        Student s1 = new Student(); //s1 object 
        s1.setName("Peter"); 
        s1.setSid(1);
        
        //cannot store Sid and the Name in same array but can store it from the object. 
        Student s2 = new Student(); 
        s2.setName("Ryan"); 
        s2.setSid(2); 
        
        Student s3 = new Student(); 
        s3.setName("Mark");
        s3.setSid(3);
        
        list[0] = s1; 
        list[1] = s2; 
        list[2] = s3; 
        
        for (int i=0; i < list.length;i++){
            System.out.println(list[i].getName() + "" + list[i].getSid());
        }
        
        //ss
    }
    
}
