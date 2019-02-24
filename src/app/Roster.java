package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
abstract class Roster{
    private ArrayList<String> names;
    private String title;
    private ArrayList<Roster> Rosters;

    public void addName(){
        System.out.println("Please enter name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        for(String x : names){
            if(x.equals(name)){
                System.out.println("This name is already on the list");
            }
            else names.add(name); System.out.println("You are in");
        }
    }
    public ArrayList<String> getNames(){ 
        return names;
    }
    public ArrayList<String> setNames(){
        this.names =names;
        return names;
    }
    public void sortNames(){
        for(int n = 0; n < names.size()-1; n++){
            int small = n;
            for(int i = n + 1; i < names.size(); i++){
                if(names.get(small).compareTo(names.get(i)) > 0){
                    small = i;
                }
            }
            String temp = names.get(n);
            names.set(n,names.get(small));
            names.set(small,temp);
        }
    }
    public Roster(ArrayList<String>names,String title){
        this.names = new ArrayList<String>();
        this.title = title;
    }

} 