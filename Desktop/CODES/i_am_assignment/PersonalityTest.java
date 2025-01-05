import java.util.Scanner;
	public class PersonalityTest {
		public static void main(String... args) {
			Scanner input = new Scanner(System.in);
			int countA = 0;
			int countB = 0;
			
				System.out.println("	WHAT IS YOUR NAME:");
				String name = input.nextLine();
				
				//ONE
				
				System.out.println("SELECT (A) OR (B) ");
				System.out.println("EXTROVERTED E  VS  INTROVERTED I");
				
						System.out.println();
						
				System.out.println("A expand energy. enjoy groups.  ,      B. conserve energy. enjoy one-on-one.");
				String[] optionone = {"A. expand energy, enjoy groups.", "B. conserve energy, enjoy one-on-one."};
				String one = input.nextLine();
					while(!one.equals("A") && !one.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A expand energy. enjoy groups.  ,      B. conserve energy. enjoy one-on-one.");
						one = input.nextLine(); 
					}
						
						System.out.println();
						
				System.out.println("A. more outgoing, think out loud.,       B. more reserved, enjoy think to yourself.");				
				String[] optionfive = {"A. more outgoing, think out loud.", "B. more reserved, enjoy think to yourself."};
				String five = input.nextLine();
					while(!five.equals("A") && !five.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. more outgoing, think out loud.,       B. more reserved, enjoy think to yourself.");
						five = input.nextLine();
					}
						
						System.out.println();
					
				System.out.println("A. seek many task, public activities, interaction with other.      B. seek private, solitary activities with queit to concetrate");				
				String[] optionnine = {"A. seek many task, public activities, interaction with other.", "B. seek private, solitary activities with queit to concetrate"};
				String nine = input.nextLine();
					while(!nine.equals("A") && !nine.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. seek many task, public activities, interaction with other.      B. seek private, solitary activities with queit to concetrate");
						nine = input.nextLine();
					}
					
						System.out.println();
																																									
				System.out.println("A. external, communicative, express yourself. , B. internal, reticent, keep to your self");	
				String[] optionthirteen = {"A. external, communicative, express yourself." , "B. internal, reticent, keep to your self"};
				String thirteen = input.nextLine();
					while(!thirteen.equals("A") && !thirteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. external, communicative, express yourself. , B. internal, reticent, keep to your self");
						thirteen = input.nextLine();
					}
				
					System.out.println();
				
				System.out.println("A. active, initiate.,		B. reflective, deliberate");
				String[] optionseventeen = {"A. active, initiate.", "B. reflective, deliberate"};
				String seventeen = input.nextLine();
					while(!seventeen.equals("A") && !seventeen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. active, initiate.,		B. reflective, deliberate");
						seventeen = input.nextLine();
					}
				
					System.out.println();
				
				//TWO
				
				System.out.println("SENSING S  VS  INTUITIVE N");
				System.out.println("A. interpret literally,		B. look for meaning and possibilities");
				String[] optiontwo = {"A. interpret literally", "B. look for meaning and possibilities"};
				String two = input.nextLine();
					while(!two.equals("A") && !two.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("SENSING S  VS  INTUITIVE N");
						System.out.println("A. interpret literally,		B. look for meaning and possibilities");
						two = input.nextLine();
					}
				
						System.out.println();
				
				System.out.println("A. practical, realistic, experiential. 		B. imaginative, innovative, theoretical");
				String[] optionsix = {"A. practical, realistic, experiential.", "B. imaginative, innovative, theoretical"};
				String six = input.nextLine();
					while(!six.equals("A") && !six.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. practical, realistic, experiential. 		B. imaginative, innovative, theoretical");
						six = input.nextLine();
					}
					
						System.out.println();
						
				System.out.println("A. standard, usual, conventional.		B. different, novel, unique.");			
				String[] optionten = {"A. standard, usual, conventional.", "B. different, novel, unique."};
				String ten = input.nextLine();
					while(!ten.equals("A") && !ten.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. standard, usual, conventional.		B. different, novel, unique.");
						ten = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. focus on here and now. 		B. look to the future global perspective, big picture");	
				String[] optionfourteen = {"A. focus on here and now.", "B. look to the future global perspective, big picture"};
				String fourteen = input.nextLine();
					while(!fourteen.equals("A") && !fourteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. focus on here and now. 		B. look to the future global perspective, big picture");
						fourteen = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. facts, things, what is. 		B. ideas, dreams, what could be, philosophical");
				String[] optioneighteen = {"A. facts, things, what is.", "B. ideas, dreams, what could be, philosophical"};
				String eighteen = input.nextLine();
					while(!eighteen.equals("A") && !eighteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. facts, things, what is. 		B. ideas, dreams, what could be, philosophical");
						eighteen = input.nextLine();
					}
				
						System.out.println();
	
				//THREE
				
				System.out.println("THINKING T  VS  FEELING F");
				System.out.println("A. logical, thinking, questioning.		B. empathetic, feeling, accommodating");
				String[] optionthree = {"A. logical, thinking, questioning.", "B. empathetic, feeling, accommodating"};
				String three = input.nextLine();
					while(!three.equals("A") && !three.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("THINKING T  VS  FEELING F");
						System.out.println("A. logical, thinking, questioning.		B. empathetic, feeling, accommodating");
						three = input.nextLine();
					}
				
						System.out.println();
	
				System.out.println("A. candid, straight forward, frank.			B. tactful, kind, encouraging");
				String[] optionseven = {"A. candid, straight forward, frank.",  "B. tactful, kind, encouraging"};
				String seven = input.nextLine();
					while(!seven.equals("A") && !seven.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. candid, straight forward, frank.			B. tactful, kind, encouraging");
						seven = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. firm, tend to criticize, hold the line.		B. gentle, tend to appriciate, conciliate");
				String[] optioneleven = {"A. firm, tend to criticize, hold the line.",  "B. gentle, tend to appriciate, conciliate"};
				String eleven = input.nextLine();
					while(!eleven.equals("A") && !eleven.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. firm, tend to criticize, hold the line.		B. gentle, tend to appriciate, conciliate");
						eleven = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. tough-minded, just.		B. tender-hearted, merciful.");
				String[] optionfiveteen = {"A. tough-minded, just.", "B. tender-hearted, merciful."};	
				String fiveteen = input.nextLine();
					while(!fiveteen.equals("A") && !fiveteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. tough-minded, just.		B. tender-hearted, merciful.");
						fiveteen = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. matter of fact, issue-oriented.		B. sensitive, people-oriented, commpationate.");
				String[] optionnineteen = {"A. matter of fact, issue-oriented.",	"B. sensitive, people-oriented, commpationate."};	
				String nineteen = input.nextLine();		
					while(!nineteen.equals("A") && !nineteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. matter of fact, issue-oriented.		B. sensitive, people-oriented, commpationate.");
						nineteen = input.nextLine();
					}
				
						System.out.println();
						
				//FOUR

				System.out.println("JUDGING J  PERCEPTIVE P");
				System.out.println("A. organizd, orderly.		B. flexible, adaptable");
				String[] optionfour = {"A. organizd, orderly.", "B. flexible, adaptable"};
				String four = input.nextLine();	
					while(!four.equals("A") && !four.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("JUDGING J  PERCEPTIVE P");
						System.out.println("A. organizd, orderly.		B. flexible, adaptable");
						four = input.nextLine();
					}
				
						System.out.println();
						
				System.out.println("A. plan, schedule.		B. unplanned, spontanious");
				String[] optioneight = {"A. plan, schedule.",	"B. unplanned, spontanious"};
				String eight = input.nextLine();
					while(!eight.equals("A") && !eight.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. plan, schedule.		B. unplanned, spontanious");
						eight = input.nextLine();
					}
				
						System.out.println();
				
				System.out.println("A. regulated, structured.		B. easy-going, live and let live");
				String[] optiontwelve = {"A. regulated, structured.", "B. easy-going, live and let live"};	
				String twelve = input.nextLine();		
					while(!twelve.equals("A") && !twelve.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. regulated, structured.		B. easy-going, live and let live");
						twelve = input.nextLine();
					}
					
						System.out.println();
				
				System.out.println("A. preparation, plan ahead.		B. go with the flow, adapt as we go");
				String[] optionsixteen = {"A. preparation, plan ahead.", "B. go with the flow, adapt as we go"};	
				String sixteen = input.nextLine();		
					while(!sixteen.equals("A") && !sixteen.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. preparation, plan ahead.		B. go with the flow, adapt as we go");
						sixteen = input.nextLine();
					}
					
							System.out.println();
				
				System.out.println("A. control, govern.		B. latitude, freedom");
				String[] optiontwenty = {"A. control, govern.", "B. latitude, freedom"};	
				String twenty = input.nextLine();		
					while(!twenty.equals("A") && !twenty.equals("B")) {
						System.out.println("Expected A or B as response");
						System.out.println("A. control, govern.		B. latitude, freedom");
						twenty = input.nextLine();
					}
					
							System.out.println();
				
				System.out.println("Hello" +" " +  name + " " + "you selected");
				
				//ONE
				
				if(one.equals("A")) {
						countA++;
						System.out.println(optionone[0]);
					} else if (one.equals("B")) {
						countB++;
						System.out.println(optionone[1]);
					}
					
				if(five.equals("A")) {
						countA++;
						System.out.println(optionfive[0]);
					} else if (five.equals("B")) {
						countB++;
						System.out.println(optionfive[1]);
					} 
				
				if(nine.equals("A")) {
						countA++;
						System.out.println(optionnine[0]);
					} else if (nine.equals("B")) {
						countB++;
						System.out.println(optionnine[1]);
					} 
					
				if(thirteen.equals("A")) {
						countA++;
						System.out.println(optionthirteen[0]);	
					}	else if (thirteen.equals("B")) {
						countB++;
						System.out.println(optionthirteen[1]);
					}
				
				if(seventeen.equals("A")) {
						countA++;
						System.out.println(optionseventeen[0]);
					} else if (seventeen.equals("B")) {
						countB++;
						System.out.println(optionseventeen[1]); 
					}
					
						System.out.println();
					
				//TWO
				
				if(two.equals("A")) {
						countA++;
						System.out.println(optiontwo[0]);
					} else if (two.equals("B")) {
						countB++;
						System.out.println(optiontwo[1]);	
					}
				
				if(six.equals("A")) {
						countA++;
						System.out.println(optionsix[0]);
					} else if (six.equals("B")) {
						countB++;
						System.out.println(optionsix[1]);
					}	
					
				if(ten.equals("A")) {
						countA++;
						System.out.println(optionten[0]);
					} else if (ten.equals("B")) {
						countB++;
						System.out.println(optionten[1]);
					}		
						
				if(fourteen.equals("A")) {
						countA++;
						System.out.println(optionfourteen[0]);
					} else if (fourteen.equals("B")) {
						countB++;
						System.out.println(optionfourteen[1]);	
					}
					
				if(eighteen.equals("A")) {
						countA++;
						System.out.println(optioneighteen[0]);
					} else if (eighteen.equals("B")) {
						countB++;
						System.out.println(optioneighteen[1]);
					}
					
							System.out.println();
					
				//THREE	
				
				if(three.equals("A")) {
						countA++;
						System.out.println(optionthree[0]);
					} else if (three.equals("B")) {
						countB++;
						System.out.println(optionthree[1]);
					}	
					
				if(seven.equals("A")) {
						countA++;
						System.out.println(optionseven[0]);
					} else if (seven.equals("B")) {
						countB++;
						System.out.println(optionseven[1]);
					}
					
				if(eleven.equals("A")) {
						countA++;
						System.out.println(optioneleven[0]);
					} else if (eleven.equals("B")) {
						countB++;
						System.out.println(optioneleven[1]);	
					}
					
				if(fiveteen.equals("A")) {
						countA++;
						System.out.println(optionfiveteen[0]);
					} else if (fiveteen.equals("B")) {
						countB++;
						System.out.println(optionfiveteen[1]);
					}
					
				if(nineteen.equals("A")) {
						countA++;
						System.out.println(optionnineteen[0]);
					} else if (nineteen.equals("B")) {
						countB++;
						System.out.println(optionnineteen[1]);
					}	
					
							System.out.println();
					
					//FOUR
					
				if(four.equals("A")) {
						countA++;
						System.out.println(optionfour[0]);
					} else if (four.equals("B")) {
						countB++;
						System.out.println(optionfour[1]);	
					}
					
				if(eight.equals("A")) {
						countA++;
						System.out.println(optioneight[0]);
					} else if (eight.equals("B")) {
						countB++;
						System.out.println(optioneight[1]);
					}	

				if(twelve.equals("A")) {
						countA++;
						System.out.println(optiontwelve[0]);
					} else if (twelve.equals("B")) {
						countB++;
						System.out.println(optiontwelve[1]);	
					}
					
				if(sixteen.equals("A")) {
						countA++;
						System.out.println(optionsixteen[0]);
					} else if (sixteen.equals("B")) {
						countB++;
						System.out.println(optionsixteen[1]);	
					}	
					
				if(twenty.equals("A")) {
						countA++;
						System.out.println(optiontwenty[0]);
					} else if (twenty.equals("B")) {
						countB++;
						System.out.println(optiontwenty[1]);	
					}	
					
							System.out.println();
					
				System.out.println("A came out :" + countA + " " + "times");
				System.out.println("B came out :" + countB + " " + "times");
		}
	}