package baitap;

public class Ex8Method {
    private final byte DAY_IN_MONTH = 31;

    public Ex8Method(byte b) {
    }

    public String getSet() {
        return set;
    }

    private String set = "";
    private byte count = 0;
    private byte stringCount = 0;

    public byte getFirstNumber() {
        return firstNumber;
    }

    private  byte firstNumber;

    public void Set(byte size){
        this.firstNumber = size;
        int i;
        for(i = size; i <= DAY_IN_MONTH;){
            while (count < size){
                set = set + " " + i + " ";
                i++;
                count++;
                stringCount++;
                if (stringCount == 4){
                    set = set + "\n";
                    stringCount = 0;
                }
            }
            if(count == size){
                i = i + size;
                count = 0;
            }
        }
    }
}
