public class Friend_static {

    static int numOfFriends;
    String name;

    Friend_static(String name){
        this.name=name;
        numOfFriends++;
    }
    static void showFriends(){
        System.out.println("You have "+ numOfFriends+ " total friends");
    }
}
