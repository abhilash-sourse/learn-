 import java.util.Scanner;
 import java.util.Random;

public class hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();

                        //hello world

        // System.out.println("hello world");
        // System.out.println("i am abhi");

                        //variable

        // int a = 10;
        // int b = 20;
        // System.out.println("the value of a is "+ a);
        // System.out.println("the value of b is "+ b);

        // double price = 200;
        // double per_seat = 100;
        // System.out.println("the total cost is "+ price);
        // System.out.println("the cost of per seat "+ per_seat);

        // String fname = "Abhi";
        // String lname= "lash";
        // System.out.println("The person first name  " + fname);
        // System.out.println("The person last name " + lname);

        // char grade = 'A';
        // char currency = '$';
        // System.out.println("Your class grade " + grade);
        // System.out.println("Your currency is " + currency);

        // boolean isStudent = true;
        // boolean forsale = false;
        // System.out.println("he is student "+ isStudent);
        // System.out.println("the sale is books " + forsale);

        // if(isStudent){
        //     System.out.println("you are a student");
        // }else{
        //     System.out.println("you are not a student");
        // }

                        //user input

        // System.out.print("Enter your name:" );
        // String name = scanner.nextLine();
        // System.out.println("hello "+ name);

        // System.out.print("Enter you age:");
        // int age = scanner.nextInt();
        // System.out.println("he age is " + age);

        // System.out.print("Enter your scgp:");
        // double scgp = scanner.nextDouble();
        // System.out.print("your scgp: "+scgp);

                        //check area

        // double width ;
        // double height ;
        // double area ;

        // System.out.print("Enter the width:");
        // width = scanner.nextDouble();

        // System.out.print("Enter the height:");
        // height = scanner.nextDouble();

        // area = width * height;
        // System.out.println("The area is : "+area + "cm²");

                            //MAD LIBS GAME

        // String adjective1;
        // String none1;
        // String adjective2;
        // String verb1;
        // String adjective3;

        // System.out.print("Enter an adjective (description):");
        // adjective1 =scanner.nextLine();
        // System.out.print("Enter a none (animal or person):");
        // none1 = scanner.nextLine();
        // System.out.print("Enter an adjective (decription):");
        // adjective2 = scanner.nextLine();
        // System.out.print("Enter a verb end with -ing  (action):");
        // verb1 = scanner.nextLine();
        // System.out.print("Enter an adjective (description):");
        // adjective3 = scanner.nextLine();

        // System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        // System.out.println("in an exhibit , i saw a " + none1 + ".");
        // System.out.println(none1 +" was " + adjective2 + " and " + verb1 + "!");
        // System.out.println("i was " + adjective3 + "!");
        

                        //arithmetic
        
        // int x = 10;
        // int y = 3;
        // int z;

        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = x % y;

        // System.out.println(z);

                        // Augmented Assignment Operator

        // x = x + y;
        // x += y;
        // x -= y;
        // x *= y;
        // x /= y;
        // x %= y;

                        // Increment and decrement operators

        // x += 1;
        // x++;
        // x--;

        // System.out.println(x);


                        //ORDER OF OPERATION [P-E-M-D-A-S] = Parentheses,Exponents,Mult/Div (left to right), Add/Sub (left to right)

        // Double result = 3 + 4 * (7 - 5) / 2.0;

        // System.out.println(result);


                        // shopping cart program

        // String item;
        // double price;
        // int quantity;
        // char currency = '$';
        // double total;

        // System.out.print("what item would you like to buy : ");
        // item = scanner.nextLine();

        // System.out.print("What is the prince for each? ");
        // price  = scanner.nextDouble();

        // System.out.print("Hoe many would you like : ");
        // quantity = scanner.nextInt();

        // total = price * quantity;

        // System.out.println("\nyou have bought" + quantity + " " + item );
        // System.out.println("your total is " + currency + total);


                        //if statement
        // int age ;
        // String name;
        // boolean  isStudent;

        // System.out.print("Enter your name :");
        // name = scanner.nextLine();

        // System.out.print("Enter your age : ");
        // age = scanner.nextInt();

        // System.out.print("Are you a Student (true/false): ");
        // isStudent = scanner.nextBoolean();

        // if(age >= 65){
        //     System.out.println("you are an senior! ");
        // }else if(age >= 18){
        //     System.out.println("you are an adult! ");
        // }else if(age < 0){
        //     System.out.println("you have't been born yet! ");
        // }else if(age == 0){
        //     System.out.println("You are a baby");
        // }else{
        //     System.out.println("you are a child ");
        // }

        // if(isStudent){
        //     System.out.println("You are a student");
        // }else{
        //     System.out.println("You are not a student");
        // }

        // if(name.isEmpty()){
        //     System.out.println("you did't enter your name! ");
        // }else{
        //     System.out.println("hello " + name + "!");
        // }

                        //ramdom number
        // double number;

        // number = random.nextDouble();
        // System.out.println(number);

        // boolean isHeads;

        // isHeads = random.nextBoolean();

        // if(isHeads){
        //     System.out.println("HEADS");
        // }else{
        //     System.out.println("TAILS");
        // }

                        //math class

        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;

        // result = Math.pow(2 , 5);
        // result = Math.abs(-5);
        // result = Math.sqrt(9);
        // result = Math.round(3.14);
        // result = Math.ceil(2.78);
        // result = Math.floor(2.99);
        // result = Math.max(2 , 5);
        // result = Math.min(2 , 5);

        // System.out.println(result);

                    // sides of hypotenuse

        // double a;
        // double b;
        // double c;

        // System.out.print("Enter the length of side A:");
        // a = scanner.nextDouble();

        // System.out.print("Enter the length of side B:");
        // b = scanner.nextDouble();

        // c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));

        // System.out.println("The hypotenuse (side c) is " + c);


                            //find area and volume and circumference
        // double radius;
        // double circumference;
        // double area;
        // double volume;

        // System.out.print("Enter the radius: ");
        // radius = scanner.nextDouble();

        // circumference = 2 + Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        // System.out.println("The circumference is " + circumference + "cm");
        // System.out.println("The area is : " + area +  "cm²");
        // System.out.println("The volum is : " + volume + "cm³");
    

                            //using printf
        // String name ="Abhilash";
        // char firstLetter = ' ';
        // int age = 30;
        // double height = 60.6;
        // boolean isEmployed = true;

        // System.out.printf("hello %s\n", name);
        // System.out.printf("Your name starts with a %c\n",firstLetter);
        // System.out.printf("You are %d years old\n",age);
        // System.out.printf("You are %.2f inches tall\n",height);
        // System.out.printf("Employed : %b\n",isEmployed);

        // System.out.printf("%s is %d years old",name,age);

                    //compound interest calculator

        // double price1 = 9.99;
        // double price2 = 100.15;
        // double price3 = -54.01;
        // int id1 = 1;
        // int id2 = 23;
        // int id3 = 456;
        // int id4 = 7890;

        // System.out.printf("%(.2f\n",price1);
        // System.out.printf("%(.2f\n",price2);
        // System.out.printf("%(.2f\n",price3);

        // System.out.printf("%04d\n",id1);
        // System.out.printf("%04d\n",id2);
        // System.out.printf("%04d\n",id3);
        // System.out.printf("%04d\n",id4);

        // System.out.printf("%4d\n",id1);
        // System.out.printf("%4d\n",id2);
        // System.out.printf("%4d\n",id3);
        // System.out.printf("%4d\n",id4);

        // System.out.printf("%-4d\n",id1);
        // System.out.printf("%-4d\n",id2);
        // System.out.printf("%-4d\n",id3);
        // System.out.printf("%-4d\n",id4);
        
        // double principal;
        // double rate;
        // int timesCompounded;
        // int years;
        // double amount;

        // System.out.print("Enter the principal amount:");
        // principal = scanner.nextDouble();

        // System.out.print("Enter the interest rate (in %):");
        // rate = scanner.nextDouble() /100 ;

        // System.out.print("Enter the # of time compounded per year: ");
        // timesCompounded = scanner.nextInt();

        // System.out.print("Enter the # of year :");
        // years = scanner.nextInt();

        // amount = principal + Math.pow(1 * rate / timesCompounded, timesCompounded * years);
        // System.out.printf("the amount after %d years is %.2f",years,amount);


                        //nested if statement
    //     boolean isStudent = true;
    //     boolean isSenior = false;
    //     double price = 9.99;

    //     if(isStudent){
    //         if(isSenior){
    //         System.out.println("You get a student discount of 10%");
    //         System.out.println("You get a Senior discount of 10%");
    //         price *= 0.7;
    //     }else{
    //         System.out.println("You get a student discount of 10%");
    //         price *= 0.9;
    //     }
    // }else{
    //     if(isSenior){
    //         System.out.println("You get a senior discount of 20%");
    //         price *= 0.8;
    //     }else{
    //     price *= 1;
    //     }
    // }
    
    //     System.out.printf("The prince of a ticket is $ %f: ",price);


                        //string methods
    // String name = "Abhi";

    // int length = name.length();
    // char letter = name.charAt(0);
    // int index = name.indexOf("h");
    // int lastIndex = name.lastIndexOf("b");
    // name = name.toUpperCase();
    // name = name.toLowerCase();
    // name = name.trim();
    // name = name.replace("b","a");
    // System.out.println(name.isEmpty());

    // if(name.isEmpty()){   //or
    // if(name.equalsIgnoreCase("Password")){
    //     System.out.println("Your name is empty");
    // }else{
    //     System.out.println("Hello " + name);
    // }

    // System.out.println(name);


                // Substrings

    // String email;
    // String username;
    // String domain;

    // System.out.print("Enter your emali: ");
    // email = scanner.nextLine();

    // if(email.contains("@")){
    //     username = email.substring(0,email.indexOf("@"));
    //     domain = email.substring(email.indexOf("@") + 1);

    //     System.out.println(username);
    //     System.out.println(domain);
    // }else{
    //     System.out.println("Emails must contain @");
    // }


                    //weight convertes

        // double weight;
        // double newweight;
        // int choice;

        // System.out.println("Weight conversion program");

        // System.out.println("1. Counvert lbs to kgs");
        // System.out.println("2. Counvert kgs to lbs");

        // System.out.print("Choose an option: ");
        // choice = scanner.nextInt();

        // if(choice == 1){
        //     System.out.print("Enter the wight in lbs: ");
        //     weight = scanner.nextDouble();
        //     newweight = weight * 0.453592;
        //     System.out.printf("The new wight is kgs is %.2f:" , newweight);
        // }else if(choice == 2){
        //     System.out.print("Enter the wight in kgs: ");
        //     weight = scanner.nextDouble();
        //     newweight = weight * 2.20462;
        //     System.out.printf("The new wight is lbs is %.2f:" ,newweight);
        // }else{
        //     System.out.println("That was a valid choice:");
        // }


                        //ternary operator ? = Return 1 of 2 value if a condition is true

        // int income = 20000;

        // double taxRate = (income >= 40000) ? 0.25 : 0.15;

        // System.out.println(taxRate);

                        // 2 method

        // int hours = 9;

        // String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        // System.out.println(timeOfDay);

                        //3 method

        // int number = 7;

        // String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        // System.out.println(evenOrOdd);

                        //4 method
        // int score = 95;

        // String passOfFail = (score >= 60 )  ? "PASS" : "FAIL";

        // System.out.println(passOfFail);


                        //temperature 

        // double temp;
        // double newTemp;
        // String unit;

        // System.out.print("Enter the temperature :");
        // temp = scanner.nextDouble();

        // System.out.print("Convert to celsius or Fahrenheit? (C or F) : ");
        // unit = scanner.next().toUpperCase();

        // System.out.print(temp);
        // System.out.println(unit);

        // newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        // System.out.println(newTemp + "°");

                            //switch method

        // String day ;

        // System.out.print("Enter the day of week: ");
        // day = scanner.nextLine();

        // switch(day){
                        //1 method
            // case "Monday" : System.out.println("It is weekday ");
            // case "Tuesday" : System.out.println("It is weekday ");
            // case "Wednesday" : System.out.println("It is weekday ");
            // case "Thursday" : System.out.println("It is weekday ");
            // case "Friday" : System.out.println("It is weekday ");
            // case "Saturday" : System.out.println("It is weekend ");
            // case "Sunday" : System.out.println("It is weekend ");
            // default : System.err.println(day +" is not a day");
    // }

                        //2 method

        //     switch(day) {
        //         case "Monday":
        //         case "Tuesday":
        //         case  "Wednesday":
        //         case "Thursday":
        //         case "Friday" :
        //             System.out.println("It is a weekday");
        //             break;
        //         case "Saturday":
        //         case "Sunday" :
        //             System.out.println("It is a weekend");
        //             break;
        //         default :
        //             System.out.println(day + " is not a valid day");
        // }


        




        scanner.close();
        


    }
}