# Sort Manager
This project is a small system to sort random arrays from the command line.
This was written in Java, and is designed with a focus on the features of 
object-oriented programming that I have recently learned.

This project is being created for the first quality gate test at Sparta Global,
hence the focus on recently learned OOP features, such as a factory pattern.

## Table of contents
* [How to use](#how-to-use)
* [Sorting Methods Implemented](#sorting-methods-implemented)
* * [Binary Tree](#binary-tree)
* * [Bubble Sort](#bubble-sort)
* * [~~Merge Sort~~](#merge-sort)
* * [~~Bubble Sort~~](#insertion-sort)
* [Testing](#testing)
* [Project Management](#project-management)
* [What did I learn from this?](#what-did-i-learn)


## How To Use
This system functions fully from the command line.
Simply type in the sort method you would like to use, for example "bubble" and 
then type in the array size you would like to sort.

#### Syntax: 
Sort methods: bubble, tree

Size of array: Any number. 
(Go too large with this and it could have adverse side effects for your computer.)


## Sorting Methods Implemented
Currently, both binary tree sort and bubble sort are implemented.
There are also plans to implement merge and insertion sort methods.
### Binary Tree
Binary tree sorting is fully implemented and tested. This method utilises a lot of
recursion to fill out a binary tree with the data provided, and then again when returning
that data.

### Bubble Sort
Bubble sorting is fully implemented and tested. This method iterates through the given array 
one element at a time and swaps any two elements that are in the wrong place.

### ~~Merge Sort~~
Merge sorting is not yet implemented.

### ~~Insertion Sort~~
Insertion sorting is not yet implemented.


## Testing
Most of this project is tested in Junit, with the only files that are not unit tested being ones 
such as the printer which currently just uses System.out and the input handler, which uses a 
scanner to read in the inputs. These are only black box tested because testing what is written
to the command line is something that I currently do not know how to do.


## Project Management
I used Trello as my Kanban board while I was programming this project. Here
is a link to the board I used:
&nbsp;

[Link to Trello Board](https://trello.com/b/HSdpisaS/sort-manager)

Other than this, the project is not yet finished and therefore writing here about how I managed it
would be a bit disingenuous.

## What Did I Learn?
This project was mainly to test what I have learned as well as reinforce anything that I have 
learned by making me use it, but that does not mean I have not learned anything from it.
Firstly, I have learned about how Java uses pointers to arrays after struggling to work out why
my bubble sort method was not working for a few hours, and I have definitely solidified my knowledge
of OOP, with this being the first time I have ever tried out a pattern.