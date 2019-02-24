package app;

import java.util.Arrays;

public class RosterTester {

    public static void main(String[]args){
        ClassRoster test = new ClassRoster("tester", 16);

        for(int i = 0; i < 17; i++){
            test.addName();
        }
        System.out.print("Alphabetical: ");
        System.out.println(test.getNames());
        System.out.print("shuffled: ");
        System.out.println(test.shuffleNames());
        System.out.print("cold call: ");
        System.out.println(test.coldCall());
        System.out.print("groups 2: ");
        System.out.println(Arrays.deepToString(test.randomGroups(2)));
        System.out.print("groups 3: ");
        System.out.println(Arrays.deepToString(test.randomGroups(3)));
        System.out.print("groups 4: ");
        System.out.println(Arrays.deepToString(test.randomGroups(4)));
    }
}