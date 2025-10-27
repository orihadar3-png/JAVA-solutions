

//1  
import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            // Check if the string starts or ends with 'Z'
            if (input.startsWith("Z") || input.endsWith("Z")) {
                break;
            }

            // Check if the string starts and ends with 'X'
            if (input.startsWith("X") && input.endsWith("X")) {
                count++;
            }
        }

        System.out.println("Number of strings that start and end with 'X': " + count);
    }
}

//2 


//3 
public static boolean isPeak(int[] arr, int index) {
   
    if (index <= 0 || index >= arr.length - 1) {
        return false; 
    }

   
    if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
        return true;
    }

    return false;
}



public static int countPeaks(int[] arr) {
    int peakCount = 0;
    for (int i = 1; i < arr.length - 1; i++) {
        if (isPeak(arr, i)) {
            peakCount++;
        }
    }

    return peakCount;
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 7, 6, 8, 9};

        System.out.println("Is index 1 a peak? " + isPeak(arr, 1)); // true
        System.out.println("Is index 2 a peak? " + isPeak(arr, 2)); // false
        System.out.println("Is index 5 a peak? " + isPeak(arr, 5)); // true

        System.out.println("Total number of peaks: " + countPeaks(arr)); // 3
    }
}

//4  

public class Act {
    private String actName;
    private int len;
    private Actor[] actArr;
    private int currentNum;

    public Act(String actName, int len) {
        this.actName = actName;
        this.len = len;
        this.actArr = new Actor[20];
        this.currentNum = 0;
    }

 
    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        this.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }
}

public String addActor(Actor actor) {
    if (currentNum >= 20) {
        return "no room";
    }
    if (actor.getAge() < 45 || actor.getNumActs() < 5) {
        return "not suitable";
    }
    actArr[currentNum] = actor;
    currentNum++;
    return "was added";
}

public int countExperiencedActors() {
    int experiencedCount = 0;
    for (int i = 0; i < currentNum; i++) {
        if (actArr[i].getNumActs() >= 10) {
            experiencedCount++;
        }
    }
    return experiencedCount;
}

public class Act {
    private String actName;
    private int len;
    private Actor[] actArr;
    private int currentNum;

    public Act(String actName, int len) {
        this.actName = actName;
        this.len = len;
        this.actArr = new Actor[20];
        this.currentNum = 0;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public Actor[] getActArr() {
        return actArr;
    }

    public void setActArr(Actor[] actArr) {
        this.actArr = actArr;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public String addActor(Actor actor) {
        if (currentNum >= 20) {
            return "no room";
        }
        if (actor.getAge() < 45 || actor.getNumActs() < 5) {
            return "not suitable";
        }
        actArr[currentNum] = actor;
        currentNum++;
        return "was added";
    }

    public int countExperiencedActors() {
        int experiencedCount = 0;
        for (int i = 0; i < currentNum; i++) {
            if (actArr[i].getNumActs() >= 10) {
                experiencedCount++;
            }
        }
        return experiencedCount;
    }
}

public class Actor {
    private String name;
    private int age;
    private int numActs;

    public Actor(String name, int age, int numActs) {
        this.name = name;
        this.age = age;
        this.numActs = numActs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumActs() {
        return numActs;
    }

    public void setNumActs(int numActs) {
        this.numActs = numActs;
    }
}
/// 4 
public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("John Doe", 50, 12);
        Actor actor2 = new Actor("Jane Smith", 30, 8);
        Actor actor3 = new Actor("Bob Brown", 46, 5);

        Act act = new Act("Hamlet", 120);

        System.out.println(act.addActor(actor1)); // was added
        System.out.println(act.addActor(actor2)); // not suitable
        System.out.println(act.addActor(actor3)); // was added

        System.out.println("Number of experienced actors: " + act.countExperiencedActors()); // 1
    }
}

//5 


public class Country {
    private String name;
    private int infected;
    private int recovered;
    private int dead;

    public Country(String name, int infected, int recovered, int dead) {
        this.name = name;
        this.infected = infected;
        this.recovered = recovered;
        this.dead = dead;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }
}

public class Status {
    private int count1;
    private int count2;
    private String names;

    public Status() {
        this.count1 = 0;
        this.count2 = 0;
        this.names = "";
    }
    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}

public static Status worldStatus(Country[] arr) {
    Status status = new Status();

    for (Country country : arr) {
        // מספר המדינות בהן אין נדבקים בקורונה
        if (country.getInfected() == 0) {
            status.setCount1(status.getCount1() + 1);
        }

        // מספר המדינות בהן יותר מחלימים ממתים
        if (country.getRecovered() > country.getDead()) {
            status.setCount2(status.getCount2() + 1);
        }

        // שמות המדינות שבהן רוב הנדבקים החלימו
        if (country.getRecovered() > 0 && country.getInfected() > 0 && country.getRecovered() >= country.getInfected()) {
            if (!status.getNames().isEmpty()) {
                status.setNames(status.getNames() + ", ");
            }
            status.setNames(status.getNames() + country.getName());
        }
    }

    return status;
}

public class Main {
    public static void main(String[] args) {
        Country[] countries = {
            new Country("CountryA", 1000, 800, 200),
            new Country("CountryB", 0, 0, 0),
            new Country("CountryC", 500, 600, 50),
            new Country("CountryD", 100, 50, 30)
        };

        Status status = worldStatus(countries);

        System.out.println("Number of countries with no infections: " + status.getCount1());
        System.out.println("Number of countries with more recoveries than deaths: " + status.getCount2());
        System.out.println("Names of countries where most infected have recovered: " + status.getNames());
    }
}
//6 
//7

public class SportClube {
    private String name;
    private String sportName;
    private String city;
    private int countOfPlayer;
    private int countOfCoach;

    public SportClube(String name, String sportName, String city, int countOfPlayer, int countOfCoach) {
        this.name = name;
        this.sportName = sportName;
        this.city = city;
        this.countOfPlayer = countOfPlayer;
        this.countOfCoach = countOfCoach;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSportName() { return sportName; }
    public void setSportName(String sportName) { this.sportName = sportName; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getCountOfPlayer() { return countOfPlayer; }
    public void setCountOfPlayer(int countOfPlayer) { this.countOfPlayer = countOfPlayer; }

    public int getCountOfCoach() { return countOfCoach; }
    public void setCountOfCoach(int countOfCoach) { this.countOfCoach = countOfCoach; }
}

public class SportUnion {
    private String unionName;
    private SportClube[] unionData;
    private int numberUnion;

    // Constructor
    public SportUnion(String unionName) {
        this.unionName = unionName;
        this.unionData = new SportClube[100];
        this.numberUnion = 0;
    }

    // Getters and Setters
    public String getUnionName() { return unionName; }
    public void setUnionName(String unionName) { this.unionName = unionName; }

    public SportClube[] getUnionData() { return unionData; }
    public void setUnionData(SportClube[] unionData) { this.unionData = unionData; }

    public int getNumberUnion() { return numberUnion; }
    public void setNumberUnion(int numberUnion) { this.numberUnion = numberUnion; }

 //א
    public boolean addClub(SportClube club) {
        if (numberUnion >= 100) {
            return false;
        }
        for (int i = 0; i < numberUnion; i++) {
            SportClube existingClub = unionData[i];
            if (existingClub.getName().equals(club.getName()) &&
                existingClub.getCity().equals(club.getCity()) &&
                existingClub.getSportName().equals(club.getSportName())) {
                return false;
            }
        }
        unionData[numberUnion] = club;
        numberUnion++;
        return true;
    }

    // ב
    public String getClubWithMostCoaches() {
        int maxCoaches = -1;
        String clubName = "";
        for (int i = 0; i < numberUnion; i++) {
            if (unionData[i].getCountOfCoach() > maxCoaches) {
                maxCoaches = unionData[i].getCountOfCoach();
                clubName = unionData[i].getName();
            }
        }
        return clubName;
    }
}

public class Main {
    public static void printOutstandingUnions(SportUnion[] unions) {
        for (SportUnion union : unions) {
            if (union != null && union.getNumberUnion() >= 5) {
                boolean isOutstanding = true;
                for (int i = 0; i < union.getNumberUnion(); i++) {
                    if (union.getUnionData()[i].getCountOfPlayer() < 50) {
                        isOutstanding = false;
                        break;
                    }
                }
                if (isOutstanding) {
                    System.out.println(union.getUnionName());
                }
            }
        }
    }

    public static void main(String[] args) {
        // דוגמה לשימוש
        SportClube club1 = new SportClube("Club1", "Football", "CityA", 60, 5);
        SportClube club2 = new SportClube("Club2", "Basketball", "CityB", 50, 8);
        SportClube club3 = new SportClube("Club3", "Tennis", "CityC", 70, 4);
        SportClube club4 = new SportClube("Club4", "Swimming", "CityD", 55, 10);
        SportClube club5 = new SportClube("Club5", "Football", "CityE", 52, 3);

        SportUnion union1 = new SportUnion("Union1");
        union1.addClub(club1);
        union1.addClub(club2);
        union1.addClub(club3);
        union1.addClub(club4);
        union1.addClub(club5);

        SportUnion[] unions = {union1};

        printOutstandingUnions(unions);
    }
}



//10 

public static boolean isSpecialString(String str) {
    if (str.isEmpty()) {
        return false;
    }

    boolean isLowerCase = Character.isLowerCase(str.charAt(0));
    boolean isUpperCase = Character.isUpperCase(str.charAt(0));
    
    if (!isLowerCase && !isUpperCase) {
        return false;
    }

    int[] charCount = new int[26];
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        
        if (Character.isLowerCase(c) && !isLowerCase || Character.isUpperCase(c) && !isUpperCase) {
            return false;
        }
        
        if (isLowerCase) {
            charCount[c - 'a']++;
        } else {
            charCount[c - 'A']++;
        }
    }
    
    for (int count : charCount) {
        if (count % 2 != 0) {
            return false;
        }
    }
    
    return true;
}

public static boolean what(int[][] arr) {
    int sum = 0;
    int tempSum;

    // Calculate the sum of the first row
    for (int j = 0; j < arr[0].length; j++) {
        sum += arr[0][j];
    }

    // Compare sum of all other rows with the first row
    for (int i = 1; i < arr.length; i++) {
        tempSum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            tempSum += arr[i][j];
        }
        if (tempSum != sum) {
            return false;
        }
    }

    return true;
}

//11 

public class MonthFuel {
    private Invoice[] invoices;
    private int current;

    public MonthFuel() {
        this.invoices = new Invoice[1000];
        this.current = 0;
    }

    public void addInvoice(int day, String num, String name, double fuel) {
        invoices[current] = new Invoice(day, num, name, fuel);
        current++;
    }
}

public double[] fuelPerDay() {
    double[] fuelPerDayArray = new double[32];


    Arrays.fill(fuelPerDayArray, 0.0);

  
    for (int i = 0; i < current; i++) {
        int day = invoices[i].getDay();
        fuelPerDayArray[day - 1] += invoices[i].getFuel();
    }

    return fuelPerDayArray;
}

public String maxFuelPerCar() {
    String maxCar = "";
    double maxFuel = 0.0;

    for (int i = 0; i < current; i++) {
        String carNum = invoices[i].getNum();
        double fuelAmount = 0.0;

       
        for (int j = 0; j < current; j++) {
            if (invoices[j].getNum().equals(carNum)) {
                fuelAmount += invoices[j].getFuel();
            }
        }

      
        if (fuelAmount > maxFuel) {
            maxFuel = fuelAmount;
            maxCar = carNum;
        }
    }

    return maxCar;
}