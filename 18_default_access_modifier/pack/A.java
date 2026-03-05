// The access level of default modifier is only within the package. It cannot be accessed from outside the package. If we do not specify any access level, it will be the default.

package pack;

class A{
    void msg(){
        System.out.println("Hello");
    }
}

// The scope of class A and its method msg() is default so it cannot be accessed from outside the package.