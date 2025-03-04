class Parent{
    public final void display() {
        System.out.println("This is a final method in the Parent class.");
    }
}

public class FinalMethod extends Parent {
    // Error: Cannot override the final method from Parent
    public void displayE() {
        super.display();
        System.out.println("This is an overridden method in the Child class.");
     }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
    }
}
