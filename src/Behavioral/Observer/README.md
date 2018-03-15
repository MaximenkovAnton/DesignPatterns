# Observer

Define a one-to-many dependency between objects where a state change in one object results in all its dependents being
notified and updated automatically.

Observer is a simple way of informing some objects about changing in another object.

We will make 2 implementation of this pattern:
1) _FullImpl_ package. There we will create the pattern by ourselves
2) _JavaImpl_ package. There we will do the same stuff, but we will use java.util stuff for that proposes.

Our goal will be to create a weatherForecast station and a TVShow, that will show information about changing the weather