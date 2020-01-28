package lab2;
import cse131.ArgsProcessor;
public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int numSticks = ap.nextInt("Number of Sticks?");
		System.out.println("there are " + numSticks + " sticks to start");

		int start = ap.nextInt("Player 1 or Player 2?");





		if (start == 1) {
			System.out.println("Human Starts!");
			System.out.println("");
		}
		else if (start ==2) {
			System.out.println("Computer Starts!");
			System.out.println("");
		}
		else {
			System.out.println("Invalid input");
		}

		// this clause is closed 


		for (int i=0; numSticks>0;) {

			if (start ==2) {


				boolean computer = (Math.random()<.5);
				if (computer) {


					if ((numSticks -1 )>0 || (numSticks -1) ==0) {
						numSticks = numSticks -1;
						System.out.print("Computer took 1 stick: ");
					}
					else {
						System.out.println("Computer tried to take too many sticks");
					}}
				else if (numSticks ==0) {
					System.out.println("Computer Wins!");
				}
				else {
					if ((numSticks -2 )>0 || (numSticks -2) ==0) {
						numSticks = numSticks -2;
						System.out.print("Computer took 2 sticks: ");
					}
					else {
						System.out.println("Computer tried to take too many sticks");
					}


				}

				System.out.println("Round " + i + ", There are now " + numSticks + " sticks left");
				//this was one turn of the computer IF the computer starts


				i =i+1;
				//this ends the computers turn


				if (numSticks>0) {
					int human = ap.nextInt("take 1 or 2 sticks?");

					if (human ==1) {
						
						if ((numSticks -1)>0 || (numSticks -1) ==0) {

							numSticks = numSticks - 1;
							System.out.print("Human took 1 stick: " );
							
							if (numSticks ==0) {
								System.out.println("There are 0 sticks left. Human Wins!");
							}
						}
						else {
							System.out.println("Not enough sticks left!");
							System.out.println("There are "+ numSticks + " sticks left");
						}
					}


					else if (human ==2) {
						if ((numSticks-2)==0 || (numSticks-2) >0 ) {

							numSticks = numSticks - 2;
							System.out.print("Human took 2 sticks: ");
							
							if (numSticks ==0) {
								System.out.println("Human Wins!");
							}
							else {
								System.out.println("Round " + i + ", There are now "+ numSticks + " sticks left");
							}
						}
						else {
							System.out.print("Not enough sticks left.");
							System.out.println("There are "+ numSticks + " sticks left");
						}
					}

					else {
						System.out.print("Invalid Entry. ");
						System.out.println("There are "+ numSticks + " sticks left");
					}

					//this is one turn for the human IF the computer starts

					i=i+1;

				}
				// this was all if numSticks>0

				else if (numSticks ==0) {
					System.out.println("There are 0 sticks left. Computer wins!");
				}



			}
			
			//This ends IF the computer starts 
			//this ends the if start ==2 clause 
			
			

			else if (start ==1) {


				if (numSticks>0) {
					int human = ap.nextInt("take 1 or 2 sticks?");

					if (human ==1) {
						if ((numSticks -1)>0 || (numSticks -1) ==0) {

							numSticks = numSticks - 1;
							System.out.print("Human took 1 stick: " );
							if (numSticks ==0) {
								System.out.println("There are 0 sticks left. Human Wins!");
							}
							else {
								System.out.println("Round " + i + ", There are now "+ numSticks + " sticks left");
							}
						}

						else {
							System.out.print("Not enough sticks left. ");
							System.out.println("There are "+ numSticks + " sticks left");
						}
					

//delete below if it doesnt work
					if (numSticks>0) {
						boolean computer = (Math.random()<.5);
						if (computer) {

							if (numSticks >0) {


								if ((numSticks -1 )>0 || (numSticks -1) ==0) {
									numSticks = numSticks -1;
									System.out.println("Computer took 1 stick : Round "+ i + ", there are now "+ numSticks +" sticks left.");
								}
								else  {
									System.out.print("Computer tried to take too many sticks. ");
								}
								
								

							}
						}
						
						else  {
							if ((numSticks -2 )>0 || (numSticks -2) ==0) {
								numSticks = numSticks -2;
								System.out.println("Computer took 2 sticks : Round "+ i + ", there are now "+ numSticks +" sticks left.");
							}
							else {
								System.out.println("Computer tried to take too many sticks");
							}
							if (numSticks == 0)
								
							System.out.println("There are 0 sticks left. Computer wins!");
						}
							
						}

					}

					// this ends if human starts and tries to take 1


					else if (human ==2) {
						
						if ((numSticks-2)==0 || (numSticks-2) >0 ) {

							numSticks = numSticks - 2;
							System.out.print("Human took 2 sticks: ");

							if (numSticks ==0) {
								System.out.println("There are 0 stickes left. Human Wins!");
							}
							else if (numSticks>0){
								System.out.println("Round " + i + ", There are now "+ numSticks + " sticks left");
							}
						}

						else {
							System.out.print("Not enough sticks left! ");
							System.out.println("There are "+ numSticks + " sticks left");
						}



						

						i=i+1;
						//this ends the humans turn IF the human starts 

						if (numSticks>0) {
						boolean computer = (Math.random()<.5);
						if (computer) {

							if (numSticks >0) {


								if ((numSticks -1 )>0 || (numSticks -1) ==0) {
									numSticks = numSticks -1;
									System.out.println("Computer took 1 stick : Round "+ i + ", there are now "+ numSticks +" sticks left.");
								}
								else  {
									System.out.print("Computer tried to take too many sticks. ");
								}
								
								

							}
						}
						
						else  {
							if ((numSticks -2 )>0 || (numSticks -2) ==0) {
								numSticks = numSticks -2;
								System.out.println("Computer took 2 sticks : Round "+ i + ", there are now "+ numSticks +" sticks left.");
							}
							else {
								System.out.println("Computer tried to take too many sticks");
							}
							if (numSticks == 0)
								
							System.out.println("There are 0 sticks left. Computer wins!");
						}
							
						}

					}	

				
					i =i+1;
				}




			}





		}


	}}


