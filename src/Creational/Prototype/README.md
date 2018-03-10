# The Prototype Pattern
**_The prototype pattern_** is a creational design pattern in software development. 
It is used when the type of objects to create is determined by a prototypical instance,
which is cloned to produce new objects.
This pattern is used to:
* avoid subclasses of an object creator in the client application, like the factory method pattern does.
* avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) 
when it is prohibitively expensive for a given application.

That is a very simple OOP pattern.
The idea of it, is that we should have a class (abstract class) that we can use to copy it's child objects.
Take a look on `Prototype` class. The only method in it is `Clone()`, that is overriding that method from the `Object`.

Now let's create a `Phone` class (for example), and extend it from our `Prototype`.
Let's add some fields to that class, to make it doing at least something.

Don't forget, that if you would like to copy object types, you should create new object,
while for primitive types (and Strings) you can just use assign to copy the information.

Now, we can make a clone of `phone`, and we will receive `Prototype`.
If we will need to clone some more objects, we can do it just by inheritance from prototype and overriding clone method.

That means, we will have a copy of the object we cloned, with a `prototype`, that we can cast back and receive a copy. 

That's it. I hope it was simple.