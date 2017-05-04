package my.parking;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {
    public static final int N=20;
    public static Map<Integer, String> parkingMap = new TreeMap<Integer, String>();
    public static void main(String[] args) {

        initParking();
        showParkingMenu();
       //System.out.println(parkingMap);
    }

    static void initParking()
    {
        for (int i=1;i<=N;i++)
        {
            parkingMap.put(i,"");
        }

    }

    static void showParkingMenu() {
        boolean notExit = true;
        while(notExit) {
            System.out.println("Please select item:");
            System.out.println("1. Add car to parking");
            System.out.println("2. Remove car from parking");
            System.out.println("3. Show parking status");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int item = sc.nextInt();
            switch (item) {
                case 1:
                    addCar();
                    break;
                case 2:
                    removeCar();
                    break;
                case 3:
                    showStatus();
                    break;
                case 4:
                    notExit = false;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }
    }

    static void addCar()
    {
        int i=1;
        boolean parkingSuccess=false;
        String genCarNumber="KV9315LA";
        do
        {
            if (parkingMap.get(i)=="")
            {
                parkingMap.put(i,genCarNumber);
                System.out.println("Car with number "+genCarNumber+" parked on place with number "+i);
                parkingSuccess=true;
            }
            i++; //System.out.println("AAA "+i+parkingSuccess);
        }
        while ((i<=N)&&(parkingSuccess==false));
        //while ((i<=N)||(parkingSuccess==false)); //вариант условия чтобы заполнить сразу все пустые места на стоянке
    }

    static void removeCar()
    {
        int rNumber = (int) (Math.random() * N) + 1;
        //возможно еще предусмотреть проверку не является ли это место уже свободным
        parkingMap.put(rNumber,"");
        System.out.println("Car with number "+rNumber+" left the parking");
    }

    static void showStatus()
    {
        for (Map.Entry<Integer, String> e : parkingMap.entrySet()){

            System.out.println(e.getKey()+" "+ e.getValue());

        }
    }

}
