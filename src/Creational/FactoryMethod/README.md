# Factory method pattern
In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with 
the problem of creating objects without having to specify the exact class of the object that will be created.
This is done by creating objects by calling a factory method—either specified in an interface and implemented by child
classes implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

Seams easy, right? It is. Basically, everything you need here is not to think about the classes you need to create now,
but to use a method, that will create an object instead of you. By making it works through interfaces you may have some 
layers of abstraction so you can use all of the its benefits.

Have a look on `Sensable` and `Sense` classes. They are abstract, and basically they are the interfaces we will work 
with. `Sensable` is implimented by 2 classes (`Aliance` and `Humanity`), both of them have their implementation of
`Sense` (`Alien` and `Human`), that should be returned by calling method `create()`. And now just look in `MainFactory`.
We created 2 objects (`Aliance` and `Humanity`) both of them could really simply return their implementation of `Sense`.

I'm really sure it was simple for you. Maybe some of you even used that way in your application, but steel, you should
know that pattern by name (because it's really widespread) and don't forget, that all patterns are just a common ways of
implementing some stuff in your programs. It's perfect, if you guessed how to make it. But I really hope, that some 
stuff here will be needed for you.