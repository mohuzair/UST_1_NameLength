public class PassengerNames {
    public static String[] getPassengersWithLength(String[] passengerNames, int length) {
        int count = 0;
        for (String name : passengerNames) {
            if (name.length() == length) {
                count++;
            }
        }
        
        String[] passengersWithLength = new String[count];
        
        int index = 0;
        for (String name : passengerNames) {
            if (name.length() == length) {
                passengersWithLength[index] = name;
                index++;
            }
        }
        
        return passengersWithLength;
    }
    
    public static void main(String[] args) {
        String[] passengerNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        int length = 5; 
        
        String[] passengersWithLength = getPassengersWithLength(passengerNames, length);
        
        System.out.println("Passengers with name length " + length + ":");
        for (String name : passengersWithLength) {
            System.out.println(name);
        }
    }
}
