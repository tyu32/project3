# Project 3: Double Key Map
Due Date: October 3, Thursday

For this project, you will implement a hash table using an array of linked lists ("separate chaining" technique: 
https://en.wikipedia.org/wiki/Hash_table#Separate_chaining_with_linked_lists). Each Entry in the corresponding linked list will contain two keys and a value.


The instructor has provided an interface, DoubleKeyMap<Key1, Key2, Value>, in the map package of the starter code. 
This interface is similar to the Java's built-in Map<Key,Value> interface, but uses two keys versus one (see below) and has fewer methods. 
You need to write a class DoubleKeyHashMap that implements DoubleKeyMap interface. The class must be placed in the same package as the interface.

You will practice:
- Generics
- Nested Classes
- Interfaces
- Implementing a hash table 

You are responsible for testing your code; make sure to test all edge cases.

## Implementation Details

- Your hash table should be an array of "buckets"  (of a fixed size) where each bucket is a LinkedList that stores all Entries with the same hash value. Each Entry contains 2 keys and a value. 
You are not required to allocate a larger array when the number of elements per bucket gets large. You may use Java's built-in LinkedList class to store entries in each bucket.

- DoubleKeyHashMap class should have a nested static Entry class that stores two keys and a value.  

- Entry class and DoubleKeyHashMap should be parameterized classes.

- For your hash function, you can use the following formula (we assume each Key has a hashCode() method that returns something reasonable)

  hash(key1, key2) = Math.abs(key1.hashCode() * 37 + key2.hashCode())

- Order of the keys matters:  key1, key2 is different than key2, key1. The order of put() does not matter. 

- Each method should be implemented according to the javadoc comment in the interface definition. 

- Your implementation class must define a constructor with no arguments and one with an argument specifying the (int) number of buckets.
- You may NOT use any Map classes (such as HashMap, TreeMap, LinkedHashMap etc.) from Java's standard library. Such solutions will receive no credit.
- You may NOT use any third-party libraries except for JUnit.
- You are required to have at least 5 meaningful commits for this project (not counting the instructor's) - the instructor and the TA should be able to see how you developed your code.


