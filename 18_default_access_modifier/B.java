package mypack;

import pack.*;

class B{
    public static void main(String [] args){
        A obj = new A();    //Compile Time Error
        obj.msg();  //Compile Time Error
    }
}


/*
Let’s understand packages in Java in the simplest possible way, step by step.

🟢 1. What Is a Package in Java?

A package is just a folder (directory) that stores Java classes.

Think like this:

On your computer:

Documents/
   Photos/
   Music/

In Java:

pack/
   A.java

mypack/
   B.java

👉 Here:

pack = one folder

mypack = another folder

Each folder is called a package.

🟢 2. Why Do We Use Packages?

Packages are used to:

✅ 1. Organize Code

So files don’t get mixed.

Like:

One folder for math

One for games

One for database

✅ 2. Avoid Name Conflict

You can have:

pack.A
mypack.A

Both named A, but in different folders → No problem.

✅ 3. Control Access (Security 🔒)

Packages decide:

Who can use my class/method and who cannot.

This is very important.

🟢 3. What Does package pack; Mean?

In your code:

package pack;

This means:

👉 “This file belongs to folder pack.”

So Java will put this file inside:

pack/A.java

Similarly:

package mypack;

Means:

mypack/B.java

🟢 4. How Packages Look in Real Life Example

Imagine:

🏠 A House with Rooms

House
 ├── Room1 (pack)
 │     └── A
 └── Room2 (mypack)
       └── B

A is in Room1

B is in Room2

Now:

❓ Can B freely enter Room1?

👉 Only if Room1 is publicly open

Otherwise → ❌ Not allowed

Same in Java.

🟢 5. What Is import pack.*; ?

In B.java:

import pack.*;

This means:

👉 “I want to use everything from pack package.”

Like saying:

“Let me see what is inside Room1.”

BUT…

⚠️ Import does NOT give permission.

It only says:

“I know where it is.”

Permission is controlled by public.

🟢 6. Very Important: Access Rule in Packages

Java has this rule:

Keyword	    Where It Works
public	`   Everywhere
(nothing)	Only same package
protected	Package + child
private	    Same class only

When You Write:
class A

No public ❌

Means:

👉 Only inside same package

Not outside.

When You Write:
void msg()

No public ❌

Means:

👉 Only inside same package

🟢 7. Why Your Example Fails (Again Simply)

Your code:

A.java
pack → A (NOT public)
B.java
mypack → B

Different folders.

So:

When B tries:

A obj = new A();

Java says:

❌ “A is hidden in another package.”

When B tries:

obj.msg();

Java says:

❌ “msg() is hidden in another package.”

So error happens.

🟢 8. Real Folder View (How Java Sees It)

Java expects:

ProjectFolder/
   pack/
      A.java
   mypack/
      B.java

And permissions decide who can use what.

🟢 9. Who Made This System?

Java’s package and access system was designed and maintained by Oracle Corporation to make big programs safe and organized.

Without packages, large projects would be messy 😵.

🟢 10. One-Sentence Understanding

👉 A package is a folder for Java files, and Java uses it to organize code and control access.

🟢 11. Super Easy Rule to Remember 💡

Remember this forever:

📌 Different package = You need public

If something is used in another package:

✔ Class → must be public
✔ Method → must be public

Otherwise ❌ error.





Now, Let’s understand packages in Java using only code examples, step by step.

No theory. Just code + explanation.

✅ Example 1: Same Package (Works)
📁 Folder Structure
school/
   A.java
   B.java

A.java:
_____________________________________________
package school;

class A {
    void msg() {
        System.out.println("Hello from A");
    }
}
_____________________________________________

B.java:
_____________________________________________
package school;

class B {
    public static void main(String[] args) {
        A obj = new A();   // ✅ Works
        obj.msg();        // ✅ Works
    }
}
_____________________________________________
✔ Why This Works?

Because:

A and B are in same package → school

So even without public, they can see each other

👉 Same folder = No problem

❌ Example 2: Different Package (Fails – Like Your Case)
📁 Folder Structure
pack/
   A.java

mypack/
   B.java

A.java:
_____________________________________________
package pack;

class A {
    void msg() {
        System.out.println("Hello from A");
    }
}
_____________________________________________

B.java:
____________________________________________
package mypack;

import pack.*;

class B {
    public static void main(String[] args) {
        A obj = new A();   // ❌ Error
        obj.msg();        // ❌ Error
    }
}
____________________________________________
❌ Why This Fails?

Because:

A is NOT public

msg() is NOT public

B is in another package

👉 Java blocks access

✅ Example 3: Different Package (Works – Using public)

Now we only add public.

A.java:
____________________________________________
package pack;

public class A {        // ✅ public
    public void msg() { // ✅ public
        System.out.println("Hello from A");
    }
}
____________________________________________

B.java:
_____________________________________________
package mypack;

import pack.*;

class B {
    public static void main(String[] args) {
        A obj = new A();   // ✅ Works
        obj.msg();        // ✅ Works
    }
}
_____________________________________________
✔ Why This Works?

Because:

A is public → visible everywhere

msg() is public → callable everywhere

👉 Other package is now allowed

🟢 Example 4: public Class but Method NOT public (Half Works)

A.java:
_________________________________________
package pack;

public class A {      // ✅ public
    void msg() {       // ❌ NOT public
        System.out.println("Hello");
    }
}
_________________________________________

B.java:
_________________________________________
package mypack;

import pack.*;

class B {
    public static void main(String[] args) {
        A obj = new A();   // ✅ Works
        obj.msg();        // ❌ Error
    }
}
_________________________________________
❌ Why?
Line	Result
new A()	Works (A is public)
obj.msg()	Fails (msg not public)

So:

👉 Class accessible
👉 Method hidden

🟢 Example 5: No import (Fails)

B.java:
_______________________________________________
package mypack;

// import pack.*;  ❌ missing

class B {
    public static void main(String[] args) {
        A obj = new A();   // ❌ Error
    }
}
_______________________________________________
❌ Why?

Java says:

"I don’t know where A is."

So:

👉 import is needed to tell location

📌 Final Rule (Most Important)

Remember this table forever:

Situation	        Needed
Same package	    Nothing
Different package	public + import

🧠 Simple Logic in Your Head

When Java sees:

A obj = new A();

It checks:

1️⃣ Is A in same package?
→ Yes → OK
→ No → Check public

2️⃣ Is A public?
→ Yes → OK
→ No → Error ❌

Same for methods.

✅ One-Line Summary

👉 Packages are folders.
👉 Same folder = free access.
👉 Different folder = need public.

*/
