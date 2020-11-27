package gui;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Racing {
	public static int getRandomValue(int Min, int Max) {

		// Get and return the random integer
		// within Min and Max
		return ThreadLocalRandom.current().nextInt(Min, Max + 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rng = new Random(100);
		int roll;
		int finalScore = 0;

		ArrayList<String> racers = new ArrayList<String>();

		boolean looping = true;
		String name = "";
		System.out.println("Enter the name of your racers: ");
		System.out.println("Repository for a jar application that will take racer names, roll random number for each racer, and finally print out a unique phrase for each racer.");

		while (looping) {
			name = input.nextLine();
			if (name.equals("Done")) {
				break;
			} else {
				racers.add(name);
			}
		}
		System.out.println("--- There are " + racers.size() + " racers. ---");

		int x = racers.size();
		ArrayList<Integer> randoms = new ArrayList<Integer>(x);

		for (int i = 0; i < racers.size(); i++) {
			roll = getRandomValue(1, 100);
			randoms.add(roll);
		}
		String phrase;
		for (int i = 0; i < racers.size(); i++) {
//			System.out.println(racers.get(i) + " has rolled " + randoms.get(i));
			
			switch (randoms.get(i)) {
			case 1:
				phrase = racers.get(i)
						+ " takes one step out from the starting line and promptly faceplants� for a whopping score of 1.";
				break;
			case 2:
				phrase = "Poor " + racers.get(i)
						+ " trips over their own feet trying to get a running start for a score of 2!";
				break;
			case 3:
				phrase = "Unfortunately, " + racers.get(i)
						+ " thought someone called them and turned to look, causing a small jam with a score of 3.";
				break;
			case 4:
				phrase = "A loose pebble on the racetrack causes " + racers.get(i) + " to tumble for a score of 4!";
				break;
			case 5:
				phrase = racers.get(i)
						+ " slips part of the way into the first stretch, and while they miss a pileup, they tumble a little ways for a final score of 5.";
				break;
			case 6:
				phrase = racers.get(i)
						+ " starts off really well, and looks to be on a good track, but trips at a bad time to cause a small pileup for a score of 6!";
				break;
			case 7:
				phrase = "A score of 7 means that " + racers.get(i)
						+ " doesn�t get too far�the delicious festival food drew them away from the track!";
				break;
			case 8:
				phrase = racers.get(i)
						+ " does great until they realize they were actually running the wrong way somehow� for a score of 8.";
				break;
			case 9:
				phrase = "One lucky dodge doesn�t save " + racers.get(i)
						+ " and they take a wild tumble in the first stretch for a score of 9.";
				break;
			case 10:
				phrase = "At a score of 10, " + racers.get(i)
						+ " manages to pull out of the traffic jam in low-scoring, but tires out halfway through..";
				break;
			case 11:
				phrase = "A score of 11 for " + racers.get(i) + " as they run headfirst into a bunch of balloons� ";
				break;
			case 12:
				phrase = racers.get(i)
						+ " gives it a good go of things, but the festival food from earlier means they�re calling it for a score of 12.";
				break;
			case 13:
				phrase = racers.get(i)
						+ " skirts through the tricky start, but tires part of the way and takes it slow for the rest of the race for a score of 13.";
				break;
			case 14:
				phrase = "Tiring part of the way through, " + racers.get(i) + " has to stop for a score of 14.";
				break;
			case 15:
				phrase = "A rough start for " + racers.get(i)
						+ " but they manage for most of the race�ending with a score of 15 after having to slow at the end.";
				break;
			case 16:
				phrase = "Nearly completing the race, poor " + racers.get(i)
						+ " stumbles and trips right towards the end for a score of 16.";
				break;
			case 17:
				phrase = racers.get(i)
						+ " does great for a while� and then tries to do a fancy speedup maneuver. It doesn�t work� for a score of 17.";
				break;
			case 18:
				phrase = "Scoring at 18, " + racers.get(i)
						+ " sees a friend in the crowd and just CAN�T help but go talk to them� but forgetting to finish the race.";
				break;
			case 19:
				phrase = "With a score of 19, " + racers.get(i)
						+ " gets a little distracted by something along the way and misses the finish line..!";
				break;
			case 20:
				phrase = "Still somewhat straggling behind at a score of 20, " + racers.get(i)
						+ " manages to complete the race!";
				break;
			case 21:
				phrase = racers.get(i)
						+ " pulls back from the pack to complete the race at their own pace for a score of 21.";
				break;
			case 22:
				phrase = "Grabbing a score of 22, " + racers.get(i)
						+ " is worn out and needs to take a break after finishing the race.";
				break;
			case 23:
				phrase = "For a score of 23, " + racers.get(i)
						+ " is able to finish the race while admiring the scenery.. it is lovely out here!";
				break;
			case 24:
				phrase = "With a score of 24, " + racers.get(i)
						+ " bounds ahead but expends a lot of energy, and just kinda takes it easy the rest of the way.";
				break;
			case 25:
				phrase = "A score of 25 gets " + racers.get(i) + " to the finish�just a little slower than some!";
				break;
			case 26:
				phrase = racers.get(i)
						+ " finishes with a score of 26 after trying to take it a little easy through the race.";
				break;
			case 27:
				phrase = "Slow and steady finishes the race for " + racers.get(i) + " at a score of 27.";
				break;
			case 28:
				phrase = "A slower pace than some, but not a problem for " + racers.get(i)
						+ " with a finishing score of 28.";
				break;
			case 29:
				phrase = racers.get(i)
						+ " is careful from start to finish, and while that means they�re a tad slower, they get a decent score of 29!";
				break;
			case 30:
				phrase = "With a score of 30, " + racers.get(i)
						+ " pulls through the final stretch to make it to the finish.";
				break;
			case 31:
				phrase = "At first it looks like " + racers.get(i)
						+ " isn�t going to make it, but a burst of confidence gets them and they finish with a score of 31!";
				break;
			case 32:
				phrase = "Scoring 32, " + racers.get(i)
						+ " thinks about what�s for dinner and falls back a tad in the pack but still completes the race!";
				break;
			case 33:
				phrase = "A score of 33 gets " + racers.get(i)
						+ " going after a tricky start, but they push on through to the finish!";
				break;
			case 34:
				phrase = racers.get(i)
						+ " finds a score of 34 despite a tough start�. but some good cheers lift their spirits and they finish well!";
				break;
			case 35:
				phrase = "A score of 35 gets " + racers.get(i) + " to the finish�with some effort.";
				break;
			case 36:
				phrase = "Racing through the murky start, " + racers.get(i)
						+ " manages to finish with a respectable score of 36.";
				break;
			case 37:
				phrase = racers.get(i)
						+ " makes it past a few tricky situations and although slowly, they finish strong for a score of 37.";
				break;
			case 38:
				phrase = "A score of 38 and a little luck helps " + racers.get(i) + " take their time to the finish.";
				break;
			case 39:
				phrase = "With a score of 39 and some patience, " + racers.get(i)
						+ " manages to clear their way to finish line.";
				break;
			case 40:
				phrase = "A score of 40 and a burst of energy lands " + racers.get(i) + " with a good finish.";
				break;
			case 41:
				phrase = "Scoring 41, " + racers.get(i)
						+ " has a few tricks up their sleeve to get them to the finish!";
				break;
			case 42:
				phrase = racers.get(i)
						+ " finds a few stray sparkles that gives some pep in their step, helping them to a score of 42 and a finish.";
				break;
			case 43:
				phrase = "At a score of 43, " + racers.get(i)
						+ " dodges most of the tricky spots for a well-paced finish.";
				break;
			case 44:
				phrase = racers.get(i) + " paces themself through most of the race to land a score of 44.";
				break;
			case 45:
				phrase = "With a score of 45, " + racers.get(i) + " handles their pace to the finish line.";
				break;
			case 46:
				phrase = "For a score of 46, " + racers.get(i)
						+ " gets their chance to make it through the finish line.";
				break;
			case 47:
				phrase = "Scoring 47, " + racers.get(i)
						+ " finds a few opportunities to gain some ground and make it to the finish!";
				break;
			case 48:
				phrase = racers.get(i)
						+ " rushes through a crowd and doesn�t look back, keeping a fair pace for a score of 48.";
				break;
			case 49:
				phrase = "With a score of 45, " + racers.get(i)
						+ " makes good use of an opening in the pack to speed ahead!";
				break;
			case 50:
				phrase = "With a score of 50 and a solid, steady pace, " + racers.get(i)
						+ " finishes the race comfortably.";
				break;
			case 51:
				phrase = "Scoring 51, " + racers.get(i)
						+ " remembers something funny and distracts a few racers, finding a chance to pull ahead!";
				break;
			case 52:
				phrase = "For a score of 52 and with some happy cheers from the crowd, " + racers.get(i)
						+ " finishes the race!";
				break;
			case 53:
				phrase = "A score of 53 and " + racers.get(i) + " completes the race well.";
				break;
			case 54:
				phrase = racers.get(i)
						+ " finds a lucky gust of wind to help their speed�for a score of 54 and a solid finish.";
				break;
			case 55:
				phrase = "For a score of 55 and a solid finish, " + racers.get(i) + " cruises to the end!";
				break;
			case 56:
				phrase = racers.get(i)
						+ " loves the feeling of racing and it shows�their solid score of 56 proves their mettle!";
				break;
			case 57:
				phrase = "Good speed and good luck sends " + racers.get(i) + " to the finish with a score of 57.";
				break;
			case 58:
				phrase = "58 is " + racers.get(i) + "�s lucky number as they land that score for a finish!";
				break;
			case 59:
				phrase = "For a score of 59, " + racers.get(i) + " coasts on to the finish.";
				break;
			case 60:
				phrase = "With a score of 60, " + racers.get(i)
						+ " tears ahead early on, leaving most of the competition in the dust.";
				break;
			case 61:
				phrase = "A score of 61 and " + racers.get(i)
						+ " is ahead of the group, maintaining a fair speed all the way to the finish.";
				break;
			case 62:
				phrase = "Scoring at 62, " + racers.get(i) + " makes a good run to the finish!";
				break;
			case 63:
				phrase = "A fair breezy wind helps " + racers.get(i) + " finish with a score of 63!";
				break;
			case 64:
				phrase = "Scoring 64, " + racers.get(i)
						+ " barrels through the tough patches of the track to finish well.";
				break;
			case 65:
				phrase = racers.get(i) + " nabs a score of 65 and makes it to the finish!";
				break;
			case 66:
				phrase = "For a score of 66, " + racers.get(i)
						+ " pulls a little ahead and doesn�t falter through the race!";
				break;
			case 67:
				phrase = "With a score of 67, " + racers.get(i)
						+ " finds a good balance for the entire race and finishes strong.";
				break;
			case 68:
				phrase = racers.get(i) + " keeps up a good pace and makes sure to not over-exert for a score of 68.";
				break;
			case 69:
				phrase = racers.get(i) + " earns a score of 69 and cruises through the race to the finish.";
				break;
			case 70:
				phrase = "A score of 70 has " + racers.get(i) + " well ahead of the pack for a solid finish.";
				break;
			case 71:
				phrase = racers.get(i)
						+ " maintains their speed for the majority of the race, only falling behind just ever so slightly for a score of 71.";
				break;
			case 72:
				phrase = "Scoring at 72, " + racers.get(i) + " speeds on through the race.";
				break;
			case 73:
				phrase = "Even though they get a little tired towards the end, " + racers.get(i)
						+ " finishes with a good score of 73!";
				break;
			case 74:
				phrase = "Avoiding trouble at the start proves out to be the key for " + racers.get(i)
						+ ", getting a score of 74 and a good finish.";
				break;
			case 75:
				phrase = "A score of 75, and " + racers.get(i) + " keeps up with the leading group to finish strong!";
				break;
			case 76:
				phrase = racers.get(i)
						+ " does well for the majority of the race, and dodges a tricky final stretch for a score of 76!";
				break;
			case 77:
				phrase = "Scoring 77, " + racers.get(i)
						+ " finds a cloud on the track and cools off so they have the energy to keep their speed up for the finish!";
				break;
			case 78:
				phrase = "With a score of 78, " + racers.get(i) + " finds a fast route to the finish!";
				break;
			case 79:
				phrase = racers.get(i) + " keeps up with the pack leads most of the final run for a score of 79!";
				break;
			case 80:
				phrase = "At a score of 80, " + racers.get(i)
						+ " finishes with the upper range of racers for a good result!";
				break;
			case 81:
				phrase = "Pulling ahead for the last few laps gets " + racers.get(i)
						+ " a score of 81 and a good finish.";
				break;
			case 82:
				phrase = "With a score of 82, " + racers.get(i)
						+ " finds a� totally legal shortcut.. and finishes well!";
				break;
			case 83:
				phrase = racers.get(i) + " gets a score of 83 via some fancy footwork and determination!";
				break;
			case 84:
				phrase = "Scoring 84, " + racers.get(i)
						+ " performs admirably and stays near the race leaders until the finish line!";
				break;
			case 85:
				phrase = "A score of 85 allows " + racers.get(i) + " a mostly clear shot for the finish!";
				break;
			case 86:
				phrase = racers.get(i) + "leaps over the obstacles for a score of 86 and a smooth finish.";
				break;
			case 87:
				phrase = "With a fabulous start, " + racers.get(i)
						+ " gets a score of 87 and keeps up their speed through most of the race!";
				break;
			case 88:
				phrase = "A score of 88, and " + racers.get(i) + " shows it with a smooth run in to the finish line!";
				break;
			case 89:
				phrase = racers.get(i) + " hasn�t let up yet! And they finish that way for a score of 89!";
				break;
			case 90:
				phrase = "Racing must be in " + racers.get(i) + "�s blood with a score of 90�a clean run all the way!";
				break;
			case 91:
				phrase = "With a score of 91, " + racers.get(i) + " finishes among the upper tier of racers!";
				break;
			case 92:
				phrase = "Nabbing a score of 92, " + racers.get(i) + " blasts on to the finish!";
				break;
			case 93:
				phrase = "A score of 93 and some excited shouts from the crowd award " + racers.get(i)
						+ " with a great finish!";
				break;
			case 94:
				phrase = "With a score of 94, " + racers.get(i) + " glides onwards to a smooth finish!";
				break;
			case 95:
				phrase = "A score of 95 brings " + racers.get(i) + " to the finish with flying colors!";
				break;
			case 96:
				phrase = racers.get(i) + " almost seems to float by the pack with a score of 96 for a stunning finish.";
				break;
			case 97:
				phrase = "Scoring 97, " + racers.get(i)
						+ " is at the start one moment and the finish line the next.. what speed!";
				break;
			case 98:
				phrase = "In a show of speed, " + racers.get(i) + " blasts past the crowd for a score of 98.";
				break;
			case 99:
				phrase = racers.get(i)
						+ " is incredibly quick with a score of 99, and is juuuust shy of being top racer!!";
				break;
			case 100:
				phrase = "Stunningly fast with a score of 100, " + racers.get(i)
						+ " blitzes from start to finish with unholy speed. We barely even saw them save for the dust cloud. How were they SO fast??";
				break;
			default:
				phrase = "";
				break;
			}
			System.out.println(phrase);
			finalScore = finalScore + randoms.get(i);
		}
		System.out.println("Race results complete");
		System.out.println("Team Score is: " + finalScore);

	}
}
