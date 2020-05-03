
public class PhoneUtils {

    private static boolean bruteDuplicateCheck(Phone singleElement, Phone[] xElement) {
        for (int i = 0; i < xElement.length; i++) {
            if (singleElement.equals(xElement[i])) {
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
            if (i != 0) {
                if (bruteDuplicateCheck(tempElement, phones)) {
                    System.out.println("Podany element juz istnieje");
                    continue;
                }
            } else {
                phones[i] = tempElement;
            }
            i++;
        } while (i <= tableSize - 1);
    }
}