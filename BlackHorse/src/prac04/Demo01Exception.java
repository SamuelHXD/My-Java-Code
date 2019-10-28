package prac04;

public class Demo01Exception {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int index = 8;
        int element = getElement(arr,index);
        System.out.println(element);
        System.out.println("over");
    }

    private static int getElement(int[] arr, int index) {
        if (index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("man,you are error!");
        }
        int element = arr[index];
        return element;
    }
}
