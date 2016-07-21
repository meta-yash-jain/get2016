package Assignment2;

import java.util.Scanner;

public class Survey {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Questions question = new Questions();
		Report report = new Report();
		Rating rate = new Rating();
		String output[][];
		int choice;
		System.out.println("Enter no. of participants");
		int noOfParticipant = sc.nextInt();	
		String participants[][] = new String[noOfParticipant][3];
		for(int i = 0; i < noOfParticipant; i++) {
			output = question.ques();
			for(int j=0; j < output.length; j++){
				System.out.println(output[j][0]);
				if(output[j][1].equals("Single Select")) {	
					String options[] = output[j][2].split("/");
					for(int k = 0; k < options.length; k++){
						System.out.println(options[k]);						
					}
					System.out.println("Enter choice");
					choice = sc.nextInt();	
					while(choice > options.length){
						System.out.println("Enter correct choice");						
						choice = sc.nextInt();	
					}
					participants[i][0]=choice+"";
				} else {
					if(output[j][1].equals("Multi Select")) {
						String options[] = output[j][2].split("/");
						for(int k = 0; k < options.length; k++){
							System.out.println((k + 1) + ":" + options[k]);						
						}	
						System.out.println("Enter choice");
						choice = sc.nextInt();	
						while(choice != 0){
							if(choice > options.length) {
								System.out.println("Enter correct choice");						
							    choice = sc.nextInt();
							    continue;
							} else {
								if(participants[i][1] == null){
									participants[i][1] = options[choice - 1];
								} else {
								participants[i][1]+= "/" + options[choice - 1];
								}
							    choice = sc.nextInt();
							}
						}
					} else {
						sc.nextLine();
						String feedback = sc.nextLine();
						participants[i][2] = feedback;
					}
				}	
			}
		}
		report.report(participants);
		rate.rating(participants);
		sc.close();
	}
}