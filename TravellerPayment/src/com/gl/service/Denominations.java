package com.gl.service;

public class Denominations {
public void notesCount(int notes[],int currNo, int amt) {
int[] noteCounter = new int[currNo];
for(int i=0;i<currNo;i++) {
	if(amt>=notes[i])
		noteCounter[i]=amt/notes[i];
	amt=amt-noteCounter[i]*notes[i];
}
if(amt>0) 
	System.out.println("Highest denomination cannot be given");
else
	System.out.println("Your payment approach in order to give min no of notes will be");
for(int i=0;i<currNo;i++)
{
	if(noteCounter[i]!=0) {
		System.out.println(notes[i] +":"+ noteCounter[i]);
	}
	}
}
}

