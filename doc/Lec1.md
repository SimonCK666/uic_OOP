# Introduction

## Classes

- A set of entities(实体) with similar attributes(属性)
- A generalized(广义的) description that describes a collection of similar objects.

> An Object is an Instance(实例) of a class

## Objects

- An entity
- Objects have **state and behavior**
  - State: the data which will be put inside the class
  - Behavior: Actions / Methods

## Class Diagram

- Class name
- Attributes

## Association(关联)

- referred as a "has-a" relationship
- just using a **line** between two classes (仅用一条直线)

### Unidirectional Association(单向关联)

- E.g. Students can know what books he has, but the books do not know the Students. They just books.

### Bidirectional Association(双向关联)

- E.g. Students can borrow the books, and we can find out who lend to these books

## Aggregation

> A special type of association

- Model: Whole to its parts(各部分的)
- The two classes have **different life time**
- Using a **line one side is a polygon and the other side is a arrrow**(一条实线，一端为菱形空心，另一端为箭头)

E.g.  If you buy a car, there will be four wheels, one complete car cannot exists without wheels. But the wheels can exists without cars. Maybe just for decoration.

## Composition

> Another form of the aggregation

- Lifecycle is dependent (相互依存)
- When the parent class Exists, the child class Exists. Reverse either.
- When one of the parent class or the child class Dead, the other one Dead too.
- Using a **line one side is a polygon and the other side is an arrow**(一条实线，一端为菱形实心，另一端为箭头)

E.g.  As a person, you must have a heart. If you do not have a heart, you Dead. If you Dead, your heart Dead as well.

## Multiplicity(多样性)

### One to One relationship

- Using a **line with 1, 1 on the both side**(一条实线两端标有1，1)

E.g.  One student can only have one school card, and one school card is belong to one special student

### One to Many relationship

- Using a **line with 1,  x on the both side**(一条实线两端标有1，x)

E.g.  One student can borrow 0 or many books or at most 6 books

### Many to Many relationship

- Using a **line with x,  x on the both side**(一条实线两端标有x，x)

 E.g. One polygon(多边形) has many points and one point can be in many polygons

## **Inheritance**(继承)

- Often referred as a "is-a" relationship;  Such as class "Animal" and class "Dog"
  - Animal: Superclass(base class, parent class)
  - Dog: Subclass(derived class, child class)
- Using a **line with an arrow**(一条实线，一端为菱形空心，另一端为箭头)

Simple Terms: There is a Small(sub) Class which belongs to the Big(super) Class

- Base class has more than one derived(派生的) classes
- When adding more classes, no need to touch code in other classes

## Realization / Implementation

- Using a **Dotted line**(一条虚线)