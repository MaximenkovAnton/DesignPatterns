# The Singleton Pattern
**_The Singleton Pattern_** ensure a class has only one instance, and provide a global point of access to it.

It is one of the simplest pattern of OOP. 
The main idea of it, is that instead of creating new objects you are storing only 1 instance of it 
and using it whenever you need.

There're 2 ways of creating this pattern.
1. `Lazy init`. It means, that the object will be created when you would like to use it first time.
2. `Eager init`. It will create an instance after virtual machine will read that class.

Of-course, all of the ways have their advantages and disadvantages.
Let's discuss them.

If you are using `lazy init`, you wouldn't waste your RAM with the objects, that maybe you even wouldn't need today...
Or even this year.

On the other hand, that means, that you will need to check, if object is already created and only than to use it. 
It can slow down your program, if you are using that object often enough in different places of your object. 
And, by the way, it's not thread-safe.

All of these disadvantages can be solved by using `eager init`. 
But that means, that your app can hold an object in you RAM, even if you are not going to use it.

As for me, I prefer `eager init`. Especially if to talk about small programs and objects. 
Anyway, we will discuss both of them in our examples.

I will create only 1 UML, because it is common for both singletons. The difference is in their realization.