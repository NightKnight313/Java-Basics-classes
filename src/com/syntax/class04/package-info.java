package com.syntax.class04;



widening/implicit casting 

double d=1000;
SOPln(d); 1000.00

narrowing / expliciti

int i =10.99; 	error; cannot convert double into integer 

int i =(int)10.99;


conditional statement :
	
	if statement 
	
	Syntax
	
	
	if ( true condition)	{
		code A
	}
-----------------------------------
	if (true condition)	{
		code A
		}else {
		code B
		}
-----------------------------------
	if (ture condition) {
		code A
	}else if (true conndition) {
		code B
	}else if (ture condition) {
		code C
	} // and so on we can have as many as we want but only one will be true or false 


Nested If

If (boolean expresssion)	{ //only if boolean expression is true code A will be execiuted 
	code A;
	
	if (boolean expression) 	{ // nested/inner  (nested if will be executed only if main if will be true and inner if will be true and meet conditions 
		code B;
			}
}
-------------------------------------------------------------------
Code C								//code C will be run no matter what outcome from if Boolean