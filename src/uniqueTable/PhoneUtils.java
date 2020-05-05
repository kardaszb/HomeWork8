package uniqueTable;

public class PhoneUtils {

    private static boolean bruteDuplicateCheck(Phone tempElement, Phone[] table) {
        for (int i = 0; i < table.length; i++) {
            if (tempElement.equals(table[i])) {
                return true;
            }
        }
        return false;
    }

    public void addElements(int tableSize) {
        Phone[] phones = new Phone[tableSize];
        int i = 0;
        do {
            System.out.println("Wprowadz element nr: " + (i + 1));
            Phone tempElement = new PhoneCreate().create();
            if (bruteDuplicateCheck(tempElement, phones)) {
                System.out.println("Podany element juz istnieje");
                continue;
            } else {
                phones[i] = tempElement;
                i++;
            }
        } while (i <= tableSize - 1);
    }
}