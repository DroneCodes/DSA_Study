package com.company;

// This code was written by DroneCodes

// This a vivid explanation of Classes and Objects

public class Main { // A main class

        int count;   // a simple integer instance variable

        Main() { }   // default constructor (count is 0)

        public Main( int initial){
            count = initial;
        }   // an alternate constructor

        public int getCount () {
            return count;
        } // an accessor method


        public void increment () {
            count++;
        } // an update method


        public void increment ( int delta){
            count += delta;
        } // an update method


        public void reset () {
            count = 0;
        } // an update method

    public static void main(String[] args) {
        System.out.println();
    }
    }

