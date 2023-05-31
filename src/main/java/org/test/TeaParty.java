package org.test;

public class TeaParty {
    public int teaParty(int tea, int candy) {

        /* Check if the party is great by checking if tea & candy are atleast 5 above and either one is double of the other. if yes, return 2.
        If not, check whether both candy and tea are atleast 5 each, then it's a good party, return 1
        If both the cases are false, it means, both tean and candy are less than 5, which means it's a bad party, return 0.
        */
        if(tea >= 5 && candy >= 5 && (tea >= 2* candy || candy >= 2* tea)){
            return 2;
        }else if(tea >= 5 && candy >=5){
            return 1;
        }
        else
            return 0;

    }

    public static void main(String[] args) {
        TeaParty q = new TeaParty();
        System.out.println("Tea Party time!!!");
        System.out.println("Party ratings: \n 0 - Bad :( \n 1 - Good :) \n 2 - Great :D ");
        System.out.println("Party has 3 tea and 2 candy, How's the party going? " + q.teaParty(3,2));
        System.out.println("Party has 6 tea and 8 candy, How's the party going? " + q.teaParty(6,8));
        System.out.println("Party has 7 tea and 18 candy, How's the party going? " + q.teaParty(7,18));
    }

}
