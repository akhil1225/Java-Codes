class Doctor {
void Doctor_Details() {
 System.out.println("Doctor Details...");
} }
class Surgeon extends Doctor {
void Surgeon_Details() {
 System.out.println("Surgen Detail...");
}
}
public class Hospital {
public static void main(String args[]) {
 Surgeon s = new Surgeon();
 Doctor d= new Doctor();
 d.Doctor_Details();
 //d.Surgeon_Details();   // returns error
 s.Doctor_Details();
 s.Surgeon_Details();
} }
