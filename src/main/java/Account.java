public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    /*
         Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
         Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
    */
    public boolean checkNameToEmboss() {
        boolean isCorrect = false;
        if (name != null) {
            if (name.length() >= 3 && name.length() <= 19) {
                isCorrect = true;
                char spase = ' ';
                char[] array = name.toCharArray();
                int spaceCount = 0;
                for (char a : array) {
                    if (a == spase)
                        spaceCount++;
                }
                if (spaceCount != 1) {
                    isCorrect = false;
                }
                if (array[0] == spase || array[array.length - 1] == spase) {
                    isCorrect = false;
                }
            }
        }
        return isCorrect;
    }

}