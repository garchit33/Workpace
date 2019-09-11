package com.test.learning;


import java.util.Scanner;

 

abstract class GeneralBank

{

     final float sr=(float)4.0,fr=(float)4.0;

    

     public float getSr() {

           return sr;

     }

    

     public float getFr() {

           return fr;

     }

    

     void getSavingInterestRate()

     {}

     void getFixedInterestRate()

     {}

    

    

}

class ICICBank extends GeneralBank

{

     void getSavingInterestRate()

     {

     float sricici=(float) 3.0;

           if(super.getSr()<sricici)

           System.out.println("Saving Rate: " +sricici+"%");

           else

                System.out.println("Saving Rate: " + super.getSr()+"%");

     }

     void getFixedInterestRate()

     {

           float fricici=(float)8.5;

           if(super.getFr()<fricici)

                System.out.println("Fixed Rate: " +fricici+"%");

                else

                     System.out.println("Fixed Rate: " + super.getFr()+"%");

     }

void getWithdrawal()

{

System.out.println("Withdrawal Limit: " + 50000+"/-");

}

}

class KotMBank extends GeneralBank

{

     void getSavingInterestRate()

     {

           float srkotak=(float) 6.0;

           if(super.getSr()<srkotak)

                System.out.println("Saving Rate: " +srkotak+"%");

                else

                     System.out.println("Saving Rate: " + super.getSr()+"%");

     }

     void getFixedInterestRate()

     {

           float frkotak=(float)9.0;

           if(super.getFr()<frkotak)

                System.out.println("Fixed Rate: " +frkotak+"%");

                else

                     System.out.println("Fixed Rate: " + super.getFr()+"%");

     }

void getWithdrawal()

{

System.out.println("Withdrawal Limit: " + 60000+"/-");

}

}

class SBIBank extends GeneralBank

{

     void getSavingInterestRate()

     {

           float srsbi=(float) 2.0;

           if(super.getSr()<srsbi)

                System.out.println("Saving Rate: " +srsbi+"%");

                else

                     System.out.println("Saving Rate: " + super.getSr()+"%");

     }

     void getFixedInterestRate()

     {

           float frsbi=(float)4.0;

           if(super.getFr()<frsbi)

                System.out.println("Fixed Rate: " +frsbi+"%");

                else

                     System.out.println("Fixed Rate: " + super.getFr()+"%");

     }

void getWithdrawal()

{

System.out.println("Withdrawal Limit: " + 100000+"/-");

}

}

class BankDetail

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

 

System.out.println("\tBank");

System.out.println("1.ICICI\n2.Kotak\n3.SBI");

int ch=sc.nextInt();

 

switch(ch){

case 1: ICICBank i=new ICICBank();

     i.getSavingInterestRate();

     i.getFixedInterestRate();

     i.getWithdrawal();

     break;

case 2: KotMBank k=new KotMBank();

     k.getSavingInterestRate();

     k.getFixedInterestRate();

     k.getWithdrawal();

     break;

case 3: SBIBank a=new SBIBank();

	a.getSavingInterestRate();
	
	a.getFixedInterestRate();
	
	a.getWithdrawal();

	break;

default: System.out.println("invalid choice");

}

}   

}
