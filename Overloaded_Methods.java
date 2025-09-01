public class Overloaded_Methods {
    public static void main(String[] args){
        /* overloaded methods = methods that share the same name,
                                but different parameters
                                signature = name + parameters
            we can have two methods with same name but not same parameters
            they need to have different list of parameters
         */
        System.out.println(add(1,2,3));
        System.out.println(bakePizza("crusty", "heavy","onion,jalapeno.capsicum,mozzarella"));
    }
    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " cheese" + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " cheese " + bread + " pizza";
    }
}
