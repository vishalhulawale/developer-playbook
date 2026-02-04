## 1. Java Fundamentals & Core Basics
✅ JDK vs JRE vs JVM
✅ Java compilation & execution flow
✅ JVM architecture
✅ ClassLoader hierarchy (Bootstrap, Extension, Application)
✅ Class loading process & delegation
✅ Runtime memory areas
✅ Execution engine
✅ Data types (primitive vs non-primitive)
✅ Variables (local, instance, static)
✅ Type casting (implicit, explicit)
✅ Operators
✅ Control flow statements
✅ Command line arguments
✅ Access modifiers
✅ Illegal combinations of access modifiers

## 2. Object-Oriented Programming (OOP)
✅ OOP principles
  ✅ Encapsulation
  ✅ Inheritance
  ✅ Polymorphism
  ✅ Abstraction
✅ Classes & objects
✅ Constructors
  ✅ Default
  ✅ Parameterized
  ✅ Private
✅ this and super
✅ Method overloading & overriding
✅ final, static, abstract
✅ Object lifecycle
✅ Association, Aggregation, Composition
✅ Inheritance vs Composition
✅ SOLID principles

## 3. Wrapper Classes & Autoboxing
✅ Primitive vs Wrapper classes
✅ Wrapper classes
✅ Autoboxing & unboxing
✅ Autoboxing vs primitive types
✅ Performance implications

## 4. Strings & Immutability
✅ String pool / String pooling
✅ String vs StringBuilder vs StringBuffer
✅ Immutability
✅ Creating immutable classes
✅ equals() vs ==
✅ hashCode() contract
✅ intern()
✅ records vs classic immutable classes

## 5. Java Memory Management & GC
✅ Stack vs Heap https://www.digitalocean.com/community/tutorials/java-jvm-memory-model-memory-management-in-java
✅ Object creation & memory allocation
✅ Garbage Collection basics
✅ GC algorithms
  ✅ Serial GC
  ✅ Parallel GC
  ✅ CMS
  ✅ G1
  ✅ ZGC
  ✅ Shenandoah
✅ References
  ✅ Weak
  ✅ Soft
  ✅ Phantom

## 6. Exception Handling
✅ Checked vs Unchecked exceptions
✅ try-catch-finally
✅ Multi-catch
✅ Exception hierarchy https://rollbar.com/blog/java-exceptions-hierarchy-explained/
✅ throw vs throws
✅ Custom exceptions
✅ Exception handling scenarios
✅ Best practices

## 7. Java Collections Framework
✅ Collection hierarchy
✅ List
  ✅ ArrayList (internal working)
  ✅ LinkedList
  ✅ Vector
  ✅ Collections.synchronizedList
  ✅ CopyOnWriteArrayList
✅ Set
  ✅ HashSet
  ✅ LinkedHashSet
  ✅ TreeSet
  ✅ ConcurrentHashMap.toKeySet()
  ✅ SynchronizedSet
  ✅ ConcurrentSkipListSet (Visit later for advanced)
✅ Map
  ✅ HashMap (internals)
  ✅ LinkedHashMap
  ✅ LRU (Least Recently Used Cache)
  ✅ TreeMap
  ✅ Hashtable
  ✅ WeakHashMap
  ✅ ConcurrentHashMap
  ✅ SynchronizedMap
✅ Equals & hashCode contract
✅ Comparable vs Comparator
✅ Fail-fast vs fail-safe iterators
✅ Concurrent collections
  ✅ CopyOnWriteArrayList
  ✅ CopyOnWriteArraySet
  ✅ ConcurrentSkipListSet
  ✅ ConcurrentLinkedQueue
  ✅ ConcurrentLinkedDeque
  ✅ ConcurrentSkipListMap
  ✅ ConcurrentHashMap
✅ Immutable collections

## 9. Java 8 & Functional Programming
- Lambda expressions
- Lambda expressions with Threads
- Functional interfaces
- Method references
- Stream API overview
- Intermediate vs terminal operations
- Parallel vs sequential streams
- Spliterator
- Optional
  - of
  - ofNullable
  - empty
  - orElse / orElseGet / orElseThrow
  - map
  - filter
- Default & static methods in interfaces
- Multiple inheritance with default methods
- forEach
- Collectors
- Pure functions
- Immutability
- Stateless design
- Higher-order functions
- Lazy evaluation
- Reverse order sorting
- Distinct operations

## 10. Java Streams API (Deep Dive)
- filter, map, collect, flatMap, peek
- Predicate vs Function vs Consumer vs Supplier
- Consumer vs Supplier
- Stream-based problems
  - Merge and sort two arrays
  - Average of students grouped by department
  - Sort employees using Comparator.comparing


## 8. Multithreading & Concurrency
- Thread lifecycle
- Thread vs Runnable
- Runnable vs Callable
- Thread safety
- Synchronization
- Intrinsic locks
- volatile
- Atomic variables
- wait(), notify(), notifyAll()
- Deadlock, livelock, starvation
- Deadlock detection, prevention, recovery
- Locks
  - ReentrantLock
  - ReadWriteLock
- Intrinsic locks vs explicit locks
- Mutual exclusion
- Thread communication
- Fairness policy & starvation
- Daemon threads
- ThreadLocal (use cases)
- Thread pools
- Executor framework
  - ExecutorService
  - SingleThreadExecutor
  - FixedThreadPool
  - CachedThreadPool
  - ScheduledThreadPool
  - ForkJoinPool
- Synchronizers
  - CountDownLatch
  - CyclicBarrier
  - Semaphore
  - Phaser
- ThreadPoolExecutor + queue selection strategy


## 11. Serialization & JVM Compatibility
- SerialVersionUID
- UID & versioning
- Performance considerations

## 12. Design Patterns
### Creational
- Singleton
- Factory
- Abstract Factory
- Builder

### Structural
- Adapter
- Decorator
- Proxy
- Facade

### Behavioral
- Strategy
- Observer
- Command
- Template Method

- Real-world usage patterns

## 13. Java 9–11 Enhancements
- Module system (JPMS)
- JShell
- Immutable collections factory methods
- Private methods in interfaces
- HTTP Client API
- Local variable type inference (var)
- Files API improvements

## 14. Java 12–17 Features
- Switch expressions
- Text blocks
- Records
- Pattern matching (instanceof)
- Sealed classes
- Helpful NullPointerExceptions
- Enhanced G1 GC

## 15. Java 18–21 (Latest LTS)
- Virtual threads (Project Loom)
- Structured concurrency
- Scoped values
- Sequenced collections
- Pattern matching for switch
- Foreign Function & Memory API
- Performance & GC improvements

## 16. Java Generics
- Generic classes & methods
- Type erasure
- Bounded generics
- Wildcards (?, extends, super)
- PECS principle

## 17. Java I/O & NIO
- File handling
- Streams
- Serialization & deserialization
- Externalizable
- NIO basics
- Channels & Buffers
- Path, Files API

## 18. Date & Time API
- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- Instant
- Duration
- Period
- DateTimeFormatter

## 19. JVM Internals (Advanced)
- Bytecode structure
- JIT compiler
- Escape analysis
- Biased locking
- Safepoints
- JVM tuning flags

## 20. Java Reflection & Annotations
- Reflection API
- Runtime vs compile-time annotations
- Custom annotations
- Annotation processing

## 21. Performance & Optimization
- Profiling
- Memory analysis
- Thread dumps
- Heap dumps
- JMH benchmarks
- TLAB analysis
- JFR usage
- GC tuning fundamentals
- Memory leaks

## 22. Security in Java
- ClassLoader security
- Secure coding practices
- Cryptography basics
- SSL/TLS concepts

## 23. Testing & Build Tools
- JUnit (4 & 5)
- Mockito
- Integration testing
- Maven
- Gradle

## 24. Java & Microservices (Interview Relevance)
- Java in distributed systems
- Serialization formats (JSON, Protobuf)
- REST APIs
- Resilience patterns
- Threading impact in microservices

## 25. Best Practices & Clean Code
- Effective Java concepts
- Code readability
- Defensive programming
- Exception handling strategies
