/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Design, implement and test a Java application that will step you through some possible problems and potentially restore internet connectivity.  Assume that your computer uses WiFi to connect to a router which connects to an Internet Service Provider (ISP) that connects to the Internet.  
 * Due: 2/11/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Josue Ouedraogo
*/


import java.util.Scanner;

public class WiFiDiagnosis {
  
public void troubleShootWiFi()
{
Scanner sc = new Scanner(System.in);
  
// step number 1
System.out.println("First step: reboot your computer");
System.out.print("Are you able to connect with the internet? (yes or no): ");
String choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your computer seemed to work");
return;
}
  
// step  number 2
System.out.println("Second step: reboot your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your router seemed to work");
return;
}
  
// step number 3
System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Checking the router's cables seemed to work");
return;
}
  
// step number 4
System.out.println("Fourth step: move your computer closer to your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Moving your computer closer to the router seemed to work");
return;
}
  
// step number 5
System.out.println("Fifth step: contact your ISP\n"
+ "Make sure your ISP is hooked up to your router.");
}
}