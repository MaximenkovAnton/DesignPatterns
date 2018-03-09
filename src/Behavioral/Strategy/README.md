**_The Strategy Pattern_** defines a family of algorithms, encapsulates each one, and makes them interchangeable.
_Strategy_ lets the algorithm vary independently from clients that use it.

If you just read it, maybe it seams a little bit difficult for you, but it's not. 
Basically it means, that if you have a part of code, that will vary, you can just create a `Strategy`.
If will simplify your work and make your code much more flexible.

#**_EXAMPLE_**

Lets create a simple `dog` class. All dogs can bark (okay, almost all), but how it should bark? Like a puppy?
Or like a big old dog? Should it be an aggressive barking, or not? And of-course puppy will grow up, 
and even really kind dog in some situations can be aggressive.

At this situation we need a strategy. Let's call it `BarkStrategy`. 
That class should be abstract and it will be a parent of all the barking styles.
The only method in it will be _`bark()`_.

Our dog should have that strategy, as a private member of the class. Let's set it through the constructor 
and create a setter to be able to change it in runtime.

Our dog should have a _`bark()`_ method as well. It will just call the same method from the strategy.

That's all. 
Now we need just to implement the strategy any times we need
and we could use that strategies for any dog, any time we want.