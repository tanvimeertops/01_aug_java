package com.basic;
/*
 * Switch case:
 *  
 */
public class SwitchCaseDemo {
public static void main(String[] args) {
	int choice=2;
	
	switch (choice) {
	case 1:
		System.out.println("Fan is on");
		break;
	case 2:
		System.out.println("Ac is on");
		break;
		case 3:
			System.out.println("Light is on");
			break;
			case 4:
				System.out.println("Fridge is on");
				break;
	default:
		System.out.println("Invalid Input");
		break;
	}
	
	/*
	 * Vowel or consonant
	 * aeiou
	 */
	
	char ch='y';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	
		System.out.println("Vowel");
		break;
	
	default:
		System.out.println("Consonant");
		break;
	}
	
	if(ch=='a'||ch=='i'||ch=='e') {
		System.out.println("Vowel");
	}else {
		System.out.println("Consonant");
	}
}
}
