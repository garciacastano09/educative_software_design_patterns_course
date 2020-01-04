Prototype pattern involves creating new objects by copying existing objects. The object whose copies are made is called the prototype. You can think of the prototype object as the seed object from which other objects get created but you might ask why would we want to create copies of objects, why not just create them anew? The motivations for prototype objects are as follows:

Sometimes creating new objects is more expensive than copying existing objects.

Imagine a class will only be loaded at runtime and you can't access its constructor statically. The run-time environment creates an instance of each dynamically loaded class automatically and registers it with a prototype manager. The application can request objects from the prototype manager which in turn can return clones of the prototype.

The number of classes in a system can be greatly reduced by varying the values of a cloned object from a prototypical instance.

Formally, the pattern is defined as specify the kind of objects to create using a prototypical instance as a model and making copies of the prototype to create new objects.

