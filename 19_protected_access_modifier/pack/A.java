// The access level of protected modifier is within the package and outside the package through the child class. If we do not make the child class, it cannot be accessed from outside the package.

package pack;
public class A{
    protected void msg(){
        System.out.println("Hello");
    }
}