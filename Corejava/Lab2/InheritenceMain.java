package Lab2;

import java.util.Scanner;

public class InheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("chhose the option ");
		System.out.println("\t1.Written Item");
		System.out.println("\t2.Media Item");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Choose the option");
			System.out.println("\t1.Book");
			System.out.println("\t2.Journal Paper");
			int n1=sc.nextInt();
			if(n1==1)
			{
				System.out.println("Enter identification no.,Name of book,no. of copies,Name of author");
				Book book=new Book(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
				book.additem();
				book.checkIn();
				book.checkOut();
				book.print();
			}
			else if(n1==2) {
				System.out.println("Enter identification no.,Name of book,no. of copies,Name of author,year in which it is published");
				JournalPaper journal=new JournalPaper(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
				journal.additem();
				journal.checkIn();
				journal.checkOut();
				journal.print();
			}
			else
				System.out.println("Wrong choice");
		}
		else if(n==2) {
			System.out.println("Choose the option");
			System.out.println("\t1.video");
			System.out.println("\t2.CD");
			int n1=sc.nextInt();
			if(n1==1)
			{
				System.out.println("Enter identification no.,Name of book,no. of copies,video no. to be played,year of release,director and genre");
				video vid=new video(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
				vid.additem();
				vid.checkIn();
				vid.checkOut();
				vid.print();
			}
			else if(n1==2) {
				System.out.println("Enter identification no.,Name of book,no. of copies,run time no.,artist,genre");
				CD cd=new CD(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next());
				cd.additem();
				cd.checkIn();
				cd.checkOut();
				cd.print();
			}
			else
				System.out.println("Wrong choice");
		}
		else
			System.out.println("Wrong choice");

	}

}
