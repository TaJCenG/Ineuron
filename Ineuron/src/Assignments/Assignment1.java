package Assignments;

public class Assignment1 {

	//1. Write a program (WAP) to print "INEURON" using pattern programming logic.
	 class PrintINEURON {

	    public static void main(String[] args) {
	        printI();
	        printN();
	        printE();
	        printU();
	        printR();
	        printO();
	        printN();
	    }

	    static void printI() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    static void printN() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 0 || j == 4 || (i == j && j != 0 && j != 4)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    static void printE() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 0 || i == 0 || i == 2 || i == 4) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    static void printU() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 0 || j == 4 || i == 4) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    static void printR() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j == 0 || (i == 0 && j < 4) || (i == 2 && j < 4) || (j == 4 && i != 0 && i < 2) || (j == 4 && i > 2 && i < 4) || (i==j && i>1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    static void printO() {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if ((i == 0 && j != 0 && j != 4) || (i == 4 && j != 0 && j != 4) || (j == 0 && i != 0 && i != 4) || (j == 4 && i != 0 && i != 4)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
	/*2. Write a program to print:1111
	2222
	3333
	4444
	```java*/
	 class NumberPattern {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	    }
	}
	//3. WAP to print the given star pattern:
	 class StarPattern {

	    public static void main(String[] args) {
	        for (int i = 0; i < 15; i++) {
	            for (int j = 0; j < 15; j++) {
	                if (i == 0 || i == 14 || j == 0 || j == 14 || (i > 0 && i < 5 && j == 4) || (i > 0 && i < 5 && j == 9)
	                        || (i > 4 && i < 9 && j == 3) || (i > 4 && i < 9 && j == 10) || (i > 8 && i < 13 && j == 2)
	                        || (i > 8 && i < 13 && j == 11)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
	 
	  class StarPattern4 {

		    public static void main(String[] args) {
		        for (int i = 0; i < 9; i++) {
		            for (int j = 0; j < 9; j++) {
		                if ((j == 0) || (j == 8) || (i>0 && i<5 && j==1) || (i>0 && i<5 && j==7) || (i>1 && i<5 && j==2) || (i>1 && i<5 && j==6) 
		                        || (i>2 && i<5 && j==3) || (i>2 && i<5 && j==5) || (i==4 && j==4) )
		                {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}
	  
	  public class StarPattern5 {

		    public static void main(String[] args) {
		        for (int i = 0; i < 13; i++) {
		            for (int j = 0; j < 13; j++) {
		                if (i == 0 || i == 12 || j == 0 || (i > 0 && i < 4 && j == 4) || (i > 0 && i < 4 && j == 8)
		                        || (i > 3 && i < 7 && j == 3) || (i > 3 && i < 7 && j == 9) || (i > 6 && i < 10 && j == 2)
		                        || (i > 6 && i < 10 && j == 10) || (i > 9 && i < 12 && j == 1) || (i > 9 && i < 12 && j == 11)) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}

}
