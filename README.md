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
* * [Merge Sort](#merge-sort)
* * [Insertion Sort](#insertion-sort)
* * [Pancake Sort](#pancake-sort)
* [Swing](#swing)
* [Testing](#testing)
* [Project Management](#project-management)
* [What did I learn from this?](#what-did-i-learn)


## How To Use
This system will bring up a window made using swing. In this window, you can input the size of the array
you would like to sort at the top of the screen (Default is 5). Then, you can sort an array of the input size
by clicking one of the buttons at the bottom of the screen.

(BE WARNED: Going too high on the array size could have adverse side effects on your computer.)

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

### Merge Sort
Merge sorting is fully implemented and tested. This method recursively splits the array up into
individual values and merges them back together into the correct order.

### Insertion Sort
Insertion sorting is fully implemented and tested. This method temporarily saves a value and then
moves that value behind all values larger than it (Therefore shifting those larger values forwards).
This method will then do the same with the next value until the entire array is sorted.

### Pancake Sort
Pancake sorting is fully implemented and tested. This method flips entire sections of the array 
until the entire array is in order. It starts at the largest value, and works down.

## Swing
The front-end of this application is made using Swing. This was my first time using it, so I definitely 
struggled to get it working, but it is now fully implemented. However, this is not tested yet.

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

I have also learned both merge sort and insertion sort, two sorting methods that I had never
used before this project.